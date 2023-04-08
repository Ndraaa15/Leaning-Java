package src.UTP.SOAL1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SOAL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        sc.nextLine();
        LinkedList list = new LinkedList();
        for (int i = 0; i < number; i++) {
            int a = sc.nextInt();
            list.add(a);
        }

        System.out.println(list.result());

    }
}

class LinkedList {
    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty (){
        return size == 0;
    }
    public int size (){
        return size;
    }
    void  add (int data){
        Node input = new Node(data);
        if (isEmpty()){
            head = tail = input;
        }else {
            input.prev = tail;
            tail.next = input;
            tail = input;
        }
        size++;
        size++;
    }

    int result () {
        Node curr = head;
        int maxVal = 0;
        int result = 0;
        while (curr != null){
            if(curr.data > maxVal ){
                maxVal = curr.data;
            }
            curr = curr.next;
        }

        Node curr2 = head;
        while (curr2 != tail){
            if(curr2.data == maxVal ){
                result  += curr2.data;
            }
            curr2 = curr2.next;
        }
        return result + tail.data;
    }

    public void printAll (){
        Node curr = head;
        while (curr != null){
            System.out.print("<-" + curr.data + "->");
            curr = curr.next;
        }
        System.out.print(", size : " + size());
        System.out.println();
    }


}



class Node {
    Node next;
    Node prev;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

