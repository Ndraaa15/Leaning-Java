package src.ASD_HackerRank.FCFSScheduler;

import java.util.Scanner;

public class FCFSScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Qscheduler q = new Qscheduler();
        int thread = sc.nextInt();
        sc.nextLine();
        while (sc.hasNext()){
            String task = sc.nextLine();
            if (task.equals("START")){
                int counter = 0;
                for (int i = 0; i < thread; i++) {
                    if (q.isEmpty()){
                        break;
                    }
                    System.out.println("task " + q.dequeue() + " done");
                    counter++;
                }
                System.out.println((thread - counter) + " idle thread");
            } else if (task.equals("DONE")) {
                q.printQ();
            } else {
                q.enqueue(task);
            }
        }
    }
}

class Qscheduler{
    Node head;
    Node tail;
    int size = 0;

    boolean isEmpty (){
        return size == 0;
    }

    void enqueue (Object data){
        Node input = new Node(data);
        if(isEmpty()){
            head = tail = input;
        }else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    Object dequeue (){
        if (isEmpty()){
            return null;
        }
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    void printQ (){
        System.out.println("task left: ");
        Node curr = head;
        while (curr != null){
            System.out.println("task " + curr.data);
            curr = curr.next;
        }

    }
}


class Node {
    Node next;
    Object data;

    public Node(Object data) {
        this.data = data;
    }
}
