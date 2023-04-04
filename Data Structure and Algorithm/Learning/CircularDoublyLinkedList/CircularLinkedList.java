package src.DataStructure.CircularDoublyLinkedList;

import javax.xml.crypto.Data;

//Using doubly linkedlist
class CircularLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty (){
        return size == 0;
    }

    public void addFirst (Object data){
        Node input = new Node(data);
        if (isEmpty()){
            head = tail = input;
            head.prev = tail;
            tail.next = head;
        }else {
            tail.next = input;
            input.next = head;
            input.prev = tail;
            head.prev = input;
            head = input;
        }
        size++;
    }

    public void removeFirst (){

    }

    public void addLast (Object data){
        Node input = new Node(data);
        if (isEmpty()){
            head = tail = input;
            head.prev = tail;
            tail.next = head;
        }else {
            tail.next = input;
            input.next = head;
            head.prev = input;
            input.prev = tail;
            tail = input;
        }
        size++;
    }

    public void removeLast (){

    }

    public void insertAfter (int index, Object data){
        if (index < 0){
            index %= size;
            index += size;
        }else if (index > 0){
            index %= size;
        }

        Node input = new Node(data);
        if (index == 0 || index == size){
            input.next = head.next;
            head.next.prev = input;
            input.prev = head;
            head.next = input;
        }else {
            Node curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            if (curr == tail){
                tail.next = input;
                input.prev = tail;
                input.next = head;
                head.prev = input;
                tail = input;
            }else {
                input.next = curr.next;
                curr.next.prev = input;
                curr.next = input;
                input.prev = curr;
            }
        }
        size++;
    }

    public void insertBefore (int index, Object data){
        if (index < 0){
            index %= size;
            index += size;
        }else {
            index %= size;
        }
        Node input = new Node(data);
        if (index == 0 || index == size){
            input.next = head;
            head.prev = input;
            tail.next = input;
            input.prev = tail;
            head = input;
        }else {
            Node curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            input.prev = curr.prev;
            curr.prev.next = input;
            input.next = curr;
            curr.prev = input;
        }
    }

    public void removeAt (int index){
        if (index < 0){
            index %= size;
            index += size;
        } else if (index > 0) {
            index %=size;
        }


        if (index == 0 || index == size){
            tail.next = head.next;
            head.next.prev = tail;
            head = head.next;
        }else {
            Node curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            if (curr == tail){
                tail.prev.next = head;
                head.prev = tail.prev;
                tail = tail.prev;
            }else {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
            }
        }
        size--;
    }

    public void printAll () {
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
