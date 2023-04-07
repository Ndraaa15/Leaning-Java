package src.ASD_HackerRank.JavedSiAnakMagang;

import java.util.Scanner;

public class JavedSiAnakMagang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack page = new Stack();
        Stack tempPage = new Stack();

        int totalTask = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < totalTask; i++) {
            String line = sc.nextLine();
            if (line.equals("current")){
                if (page.getSize() == 0){
                    System.out.println("Homepage");
                }else {
                    System.out.println(page.peek());
                }
            } else if (line.startsWith("visit")) {
                tempPage.makeEmpty();
                String [] lines = line.split(" ");
                page.push(lines[1]);
            } else if (line.equals("back")) {
                if (page.getSize() == 0){
                    System.out.println("No pages back.");
                }else {
                    String temp = page.pop();
                    tempPage.push(temp);
                }
            } else if (line.equals("forward")){
                if (tempPage.getSize() == 0){
                    System.out.println("No pages forward.");
                }else {
                    String temp = tempPage.pop();
                    page.push(temp);
                }
            }
        }
    }
}

class Stack{
    Node head;
    int size = 0;

    boolean isEmpty (){
        return size == 0;
    }

    void makeEmpty (){
        head = null;
        size = 0;
    }

    String peek (){
        return head.data;
    }

    void push (String data){
        Node input = new Node(data);
        if (isEmpty()){
            head = input;
        }else {
            input.next = head;
            head = input;
        }
        size++;
    }

    String pop (){
        Node temp = head;
        if (isEmpty()){
            return "Stack empty";
        }else {
            head = head.next;
        }
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

