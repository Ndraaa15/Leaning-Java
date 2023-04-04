package src.DataStructure.PriorityQ;

import java.util.EmptyStackException;

public class PriorityQ {
    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty(){
        return size == 0;
    }

    public int size (){
        return size;
    }
    public void enqueue(Object data, int value) {
        Node input = new Node(data, value);
        Node curr = head;
        if (isEmpty()) {
            head = tail = input;
        } else {
            if (input.value > head.value){
                input.next = head;
                head = input;

            }else {
                while (curr.next != null) {
                    if (input.value > curr.next.value) {
                        input.next = curr.next;
                        curr.next = input;
                        break;
                    }
                    curr = curr.next;
                }

                if (curr.next == null){
                    tail.next = input;
                    tail = input;
                }
            }
        }
        size++;
    }

    public Object dequeue (){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    public void printAll (){
        Node curr = head;
        while (curr != null){
            System.out.print("<-"+curr.data);
            curr = curr.next;
        }
        System.out.println();
    }
}
