package src.ASD_HackerRank.MengaduIPK;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class MengaduIPK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue students = new Queue();
        int totalStudent = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < totalStudent; i++) {
            String information = sc.nextLine();
            String [] informations = information.split(" ");
            float pointPlus = (float) (0.2 * Float.parseFloat(informations[2]));
            float ipkFinal = Float.parseFloat(informations[1]) + pointPlus;

            students.enqueue(informations[0], ipkFinal);
        }

        for (int i = 0; i < totalStudent; i++) {
            Node student = students.dequeue();
            System.out.println(i + 1 + ". " + student.name + " (" + student.ipk + ")");
            System.out.printf("%d. %s (%f)\n", i + 1, student.name, student.ipk);

        }
    }
}

class Queue{
    Node head;
    Node tail;
    int size = 0;

    boolean isEmpty (){
        return size == 0;
    }

    void enqueue (String name, float ipk){
        Node input = new Node(name, ipk);
        if (isEmpty()){
            head = tail = input;
        }else {
            Node curr = head;
            if (input.ipk > head.ipk){
                input.next = head;
                head = input;

            }else {
                while (curr.next != null) {
                    if (input.ipk > curr.next.ipk) {
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

    Node dequeue (){
        Node temp = head;
        if (isEmpty()){
            return null;
        }else {
            head = head.next;
        }
        size--;
        return temp;
    }
}

class Node {
    Node next;
    float ipk;
    String name;

    public Node(String name, float ipk) {
        this.name = name;
        this.ipk = ipk;
    }
}
