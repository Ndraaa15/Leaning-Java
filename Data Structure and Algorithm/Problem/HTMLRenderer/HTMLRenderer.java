package src.ASD_HackerRank.HTMLRenderer;

import java.util.ArrayList;
import java.util.Scanner;

public class HTMLRenderer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stacks stack = new Stacks();
        ArrayList<String> listWord = new ArrayList<>();
        while (sc.hasNextLine()){
            String htmlElement = sc.nextLine();
            if (htmlElement.equals("<!-- end -->")){
                if(stack.getSize() != 0){
                    System.out.println("dokumen tidak valid");
                }else {
                    for (String str : listWord) {
                        System.out.println(str);
                    }
                }
                break;
            }else if (htmlElement.matches("</.*>") || htmlElement.equals("</>")){
                String tempCloseTags = htmlElement.substring(2, htmlElement.length() - 1).toLowerCase();
                if(stack.getSize() == 0){
                    System.out.println("dokumen tidak valid");
                    return;

                }else {
                    if (!stack.pop().equals(tempCloseTags)) {
                        System.out.println("dokumen tidak valid");
                        return;
                    }
                }

            }else if (htmlElement.matches("<.*>") || htmlElement.equals("<>")){
                String closeTag = htmlElement.substring(1, htmlElement.length() - 1).toLowerCase();
                stack.push(closeTag);

            }else {
                if (stack.getSize() != 0){
                    listWord.add(htmlElement);
                }
            }
        }
    }
}

class Stacks {
    Node head;
    int size;
    public boolean isEmpty(){
        return size == 0;
    }

     void push (String data){
        Node input = new Node(data);
        if (!isEmpty()) {
            input.next = head;
        }
        head = input;
        size++;
    }

    Object pop (){
        if (isEmpty()){
            return null;
        }
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    int getSize (){
        return size;
    }
}

class Node {
    String data;
    Node next;
    public Node(String data) {
        this.data = data;
    }
}
