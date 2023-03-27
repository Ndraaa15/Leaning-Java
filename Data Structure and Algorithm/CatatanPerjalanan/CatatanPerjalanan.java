package src.ASD_HackerRank.CatatanPerjalanan;

import java.util.Scanner;

public class CatatanPerjalanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList perjalanan = new DoublyLinkedList();
        while (sc.hasNext()){
            String route = sc.nextLine();
            String [] routes = route.split(" ");
            if (route.equals("SIMPAN")) {
                break;
            }
            if (routes[0].equals("MASUK")){
                perjalanan.masuk(routes[1]);
            } else if (routes[0].equals("SISIP")) {
                int i = Integer.parseInt(routes[2]);
                perjalanan.selip(routes[1], i);
            }  else if (routes[0].equals("HAPUS")) {
                int i = Integer.parseInt(routes[1]);
                perjalanan.hapus(i);
            }
        }

        System.out.println("Mode Perjalanan");
        while (sc.hasNext()){
            String command = sc.nextLine();
            String [] commands = command.split(" ");
            if(command.equals("SELESAI")){
                break;
            } else {
                perjalanan.cetakPerjalanan(commands[1]);
            }
        }
    }
}


class DoublyLinkedList{
    Node head;
    Node tail;
    int size = 0;

    Node current;

    void masuk (Object kota){
        Node input = new Node(kota);
        if (head == null){
            head = tail = input;
        } else {
            input.prev = tail;
            tail.next = input;
            tail = input;
        }
        size ++;
    }

    void selip (Object kota, int i){
        if (i < 0 || i > size){
            return;
        }
        // 1 2 3 4 5 6 7 8 9 10
        Node input = new Node(kota);


        if (i == 0){
            if (head == null){
                head = tail = input;
                size++;
                return;
            }
            input.next = head;
            head.prev = input;
            head = input;
            size++;
            return;
        }
        if (i == size){
            Node curr = tail;
            curr.next = input;
            input.prev = curr;
            tail = input;
            size++;
            return;
        }
        Node p = head;
        for (int j = 0; j < i - 1; j++) {
            p = p.next;
        }
        input.next = p.next;
        input.prev =p;
        p.next.prev = input;
        p.next = input;

        size++;
    }
    
    void hapus (int i){
        // 1 2 3 4 5 6 7 8 9 10
        if (i < 0 || i > size || head == null){
            return;
        }
        if (i == 0){
            if (head.next == null){
                head = tail = null;
                size = 0;
                return;
            }
            head.next.prev = null;
            head = head.next;
            size--;
            return;
        }

        if (i == size - 1){
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }

        Node p = head;
        for (int j = 0; j < i - 1; j++) {
            p = p.next;
        }
            p.next = p.next.next;
            p.next.prev = p;
        size--;
    }

    void  cetakPerjalanan (String command){
        if (command.equals("NEXT")){
            Object kota = next();
            if ( kota == null){
                System.out.println("Tujuan tidak valid");
            }else {
                System.out.println("Sedang berada di " + kota);
            }
        } else if (command.equals("BEFORE")) {
            Object kota = before();
            if (kota == null){
                System.out.println("Tujuan tidak valid");
            }else {
                System.out.println("Sedang berada di " + kota);
            }
        }
    }

    Object next (){
        if (current == null){
            current = head;
        }
        if (current.next == null){
            return  null;
        }
        current = current.next;
        return current.data;
    }

    Object before (){
        if (current == null){
            current = head;
        }
        if (current.prev == null){
            return  null;
        }
        current = current.prev;
        return current.data;
    }
}

class Node{
    Object data;
    Node next;
    Node prev;
    public Node(Object data) {
        this.data = data;
    }
}
