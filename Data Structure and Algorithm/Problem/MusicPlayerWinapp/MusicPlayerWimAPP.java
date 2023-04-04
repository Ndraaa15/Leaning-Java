package src.ASD_HackerRank.MusicPlayerWinapp;


import java.util.Scanner;

public class MusicPlayerWimAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularDoublyLinkedList wimApp = new CircularDoublyLinkedList();
        while (sc.hasNext()){
            String command = sc.nextLine();
            String [] commands = command.split(" ");
            if (command.equals("EXIT")){
                break;
            }else if(command.equals("NEXT") || command.equals("PREV")){
                wimApp.playMusic(command);
            }  else if (commands[0].equals("MOVE")) {
                wimApp.move(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
            } else if (commands[0].equals("PLAYAT")) {
                wimApp.playAt(Integer.parseInt(commands[1]));
            } else if (commands[0].equals("REMOVE")) {
                wimApp.remove(Integer.parseInt(commands[1]));
            }else if (commands[0].equals("INSERT")) {
                wimApp.insert(commands[1]);
            }
        }
        wimApp.print();
    }
}

class CircularDoublyLinkedList {
  Node head, tail, current;
  int size = 0;
    void insert (Object music){
        Node input = new Node(music);
        if (head == null) {
            head = input;
            tail = input;
            tail.next = head;
            head.prev = tail;
        } else {
            input.prev = tail;
            tail.next = input;
            tail = input;
            tail.next = head;
            head.prev = tail;
        }
        size ++;
    }

    void remove (int index){
        if (size == 0){
            return;
        }

        if (index > 0){
            index %= size;
        }else {
            index %= size;
            index += size;
        }

        if(index == 0 || index == size){
            if (head.next == head){
                head = tail = null;
                current = null;
                size = 0;
                return;
            }
            if (current !=null){
                if (head.data == current.data){
                    current = current.next;
                }
            }
            tail.next = tail.next.next;
            head = head.next;
            head.prev = tail;
            return;
        }else {
            if (index == size - 1){
                if (current != null){
                    if (tail.data == current.data){
                        current = current.next;
                    }
                }
                tail = tail.prev;
                tail.next = head;
                size--;
                return;
            }

            Node p = head;
            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            if (current != null){
                if (p.next.data == current.data){
                    current = current.next;
                }
            }
            if (p.next.next == p){
                p.next = p;
                p.prev = p;
            }else {
                p.next = p.next.next;
                p.next.prev = p;
            }
        }
        size--;
    }

    void playAt (int index){
        if (size == 0 || head == null){
            return;
        }
        if (index > 0){
            index %= size;
        }else {
            index %= size;
            index += size;
        }

        if (index == 0){
            current = head;
            System.out.println("Sedang diputar: " + head.data);
            return;
        }

        current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Sedang diputar: " + current.data);
    }

    void move (int index, int target){
        if (size == 0){
            return;
        }
        Node temp;

        if (index > 0){
            index %= size;
        }else {
            index %= size;
            index += size;
        }

        //Remove
        if (index == 0 || index == size){
            temp = head;
            head = head.next;
            tail.next = tail.next.next;
            head.prev = tail;
        }else {

            Node p = head;

            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            if (index == size - 1){
                temp = tail;
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }else {
                temp = p.next;
                p.next = p.next.next;
                p.next.prev = p;
            }
        }

        //Insert
        if (target > 0){
            target %= size;
        }else {
            target %= size;
            target += size;
        }

        if (target == 0 || target == size){
            if (head == null){
                head = tail = temp;
                head.prev = tail;
                tail.next = head;
                return;
            }
            temp.next = head;
            head.prev = temp;
            head = temp;
            head.prev = tail;
            tail.next = head;
        }else {

            Node x = head;

            for (int i = 0; i < target - 1; i++) {
                x = x.next;
            }

            if(target == size-1){
                tail.next = temp;
                temp.prev = tail;
                temp.next = head;
                tail = temp;
                head.prev = tail;
            }else {
                temp.next = x.next;
                x.next.prev = temp;
                x.next = temp;
                temp.prev = x;
            }
        }
    }

    void  playMusic (String pointer){
        if (size == 0){
            return;
        }
        if (pointer.equals("NEXT")){
            Object music = next();
            if (music != null){
                System.out.println("Sedang diputar: " + music);
            }
        } else if (pointer.equals("PREV")) {
            Object music = prev();
            if (music != null){
                System.out.println("Sedang diputar: " + music);
            }
        }
    }

    Object next (){
        if (current == null){
            if (head == null){
                return null;
            }else {
                current = head;
                return current.data;
            }
        }
        current = current.next;
        return current.data;
    }

    Object prev (){
        if (current == null){
            if (head == null){
                return null;
            }else {
                current = head;
                return current.data;
            }
        }
        current = current.prev;
        return current.data;
    }

    public void print () {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
            if (current == head) {
                break;
            }
        }
        System.out.println();
    }
}

class Node{
    Node next;
    Node prev;
    Object data;
    public Node(Object data) {
        this.data = data;
    }
}




