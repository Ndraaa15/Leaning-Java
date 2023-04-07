package src.ASD_HackerRank.OperBalon;

import java.util.Scanner;

class NodeCSLL {
    NodeCSLL next;
    NodeCSLL prev;
    String namaInput;
    NodeCSLL(String namaInput) {
       this.namaInput = namaInput;
    }
}

class CSLL {
    NodeCSLL head;
    NodeCSLL tail;
    NodeCSLL current;
    int size;

    boolean isEmpty() {
        return size == 0;
    }

    int getSize() {
        return size;
    }

    void addFirst(String newData) {
        NodeCSLL newNode = new NodeCSLL(newData);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
            head.prev = tail;
            tail.next = head;
        }else {
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = tail;
            tail.next = newNode;
            head = newNode;
        }
        current = head;
        size++;
    }

    void addLast(String newData) {
        NodeCSLL newNode = new NodeCSLL(newData);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
            head.prev = tail;
            tail.next = head;
        }else {
            tail.next = newNode;
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        current = tail;
        size++;
    }

    void printList() {
        NodeCSLL temp = head;
        while (temp != null){
            System.out.print(temp.namaInput + " -> ");
            temp = temp.next;
            if (temp == head){
                break;
            }
        }
    }

    void balloonPass() {
        if (isEmpty()) {
            System.out.println("List masih kosong.");
        }else if (size == 1){
            System.out.println("Tidak bisa oper.");
        }else {
            current = current.next;
        }

    }

    void balloonLocation() {
        if (isEmpty()) {
            System.out.println("List masih kosong.");
        }else {
            System.out.println("Balon ada pada " + current.namaInput +".");
        }

    }

    void balloonExplode() {
        if (isEmpty()) {
            System.out.println("List masih kosong.");
        }else {
            System.out.println("Boom! " +current.namaInput +" kalah.");

            System.exit(0);
        }
    }
}

public class OperBalon {
    public static void main(String[] args) {
        CSLL list = new CSLL();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();

        String command = "";
        String[] splitted = new String[2];
        for (int i = 0; i < n; i++) {
            command = sc.nextLine();
            splitted = command.split(" ");

            if (splitted[0].toLowerCase().equals("addfirst")) {
                list.addFirst(splitted[1]);
            } else if (splitted[0].toLowerCase().equals("addlast")) {
                list.addLast(splitted[1]);
            } else if (splitted[0].toLowerCase().equals("print")) {
                list.printList();
            } else if (splitted[0].toLowerCase().equals("balloon")) {
                if (splitted[1].toLowerCase().equals("loc")) {
                    list.balloonLocation();
                } else if (splitted[1].equals("pass")) {
                    list.balloonPass();
                } else if (splitted[1].toLowerCase().equals("boom")) {
                    list.balloonExplode();
                }
            }
        }
    }
}