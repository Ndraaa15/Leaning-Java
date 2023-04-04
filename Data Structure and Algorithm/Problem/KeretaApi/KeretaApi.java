package src.ASD_HackerRank.KeretaApi;

import java.util.Scanner;

public class KeretaApi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        linkedList <Object> node = new linkedList<>();


        while (sc.hasNext()){
            String a = sc.nextLine();

            String [] b = a.split(" ");
            if (b[0].equals("TAMBAH")){
                node.add(b[1]);
            }else if (b[0].equals("LEPAS")){
                node.remove(Integer.parseInt(b[1]));
            }else if (b[0].equals("CETAK")){
                node.printAll();
            }
        }

    }
}

class linkedList <Object>{
    Node head, tail;
    int size = 0;

    public boolean isEmpty (){
        return size == 0;
    }

    void add(Object data){
       Node input = new Node(data);
        if (isEmpty()){
            head = tail = input;
        }else {
            tail.next = input;
            tail = tail.next;
        }
        size++;
    }

    void remove (int i){
        if (head == null || i < 0 || i > size - 1){
            return;
        }
        Node p = head;
        // 1 2 3 4 5

        if (i == 0){
            head = head.next;
            size--;
            return;
        }
        for (int j = 0; j < i - 1; j++) {
            p = p.next;
        }
        p.next = p.next.next;
        if (p.next == null){
            tail = p;
        }
        size--;
    }

    void printAll (){
        Node p = head;
        while (p != null){
            if (p == tail){
                System.out.print(p.data);
            }else {
                System.out.print(p.data + "-");
            }
            p = p.next;
        }
    }
}

class Node {
    Object data;
    Node next;
    Node (Object data){
        this.data = data;
    }
}
