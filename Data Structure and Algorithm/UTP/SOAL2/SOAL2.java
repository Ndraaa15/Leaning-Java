package src.UTP.SOAL2;

import java.util.ArrayList;
import java.util.Scanner;

public class SOAL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motor motor = new Motor();
        Mobil mobil = new Mobil();
        int counterMobil = 0;
        int counterMotor = 0;
        int duration = sc.nextInt();
        int total = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < total; i++) {
            String a = sc.nextLine();
            if (a.startsWith("mobil")){
                String [] aSplit = a.split(" ");
                int penumpang = Integer.parseInt(aSplit[2]);
                counterMobil++;
                mobil.push(aSplit[1], penumpang);
            } else if (a.startsWith("motor")) {
                String [] aSplit = a.split(" ");
                int cc = Integer.parseInt(aSplit[2]);
                motor.enqueue(cc, aSplit[1]);
                counterMotor++;
            }
        }


        System.out.println("Kendaraan selamat : ");
        if (counterMobil == 0){
            System.out.println("Tidak ada mobil di dalam basement.");
        }else {
            System.out.print("Mobil dengan plat nomor ");
            for (int i = 0; i < duration; i++) {
                if (mobil.peek() == null){
                    continue;
                }else {
                    System.out.print(mobil.pop() + ", ");
                }
            }
            System.out.print("berhasil keluar dengan selamat. \n");
            if (mobil.size == 0){
                System.out.println("Semua mobil berhasil keluar dengan selamat.");
            }
        }


        if (counterMotor == 0){
            System.out.println("Tidak ada motor di dalam basement.");
        }else {
            System.out.print("Motor dengan plat nomor ");
            for (int i = 0; i < duration; i++) {
                String platMotor = motor.dequeue();
                if (platMotor == null){
                    continue;
                }else {
                    System.out.print(platMotor+ ", ");
                }
            }
            System.out.println("berhasil keluar dengan selamat.");
            if (motor.size == 0){
                System.out.println("Semua motor berhasil keluar dengan selamat.");
            }

        }


        System.out.println("\nKendaraan tertimbun : ");


        if (mobil.size == 0){
            System.out.println("Tidak ada mobil yang tertimbun.");
        }else {
            System.out.print("Mobil dengan plat nomor: ");
            mobil.printStack();
            System.out.print("masih tertimbun reruntuhan. \n");
        }

        if (motor.size == 0){
            System.out.println("Tidak ada motor yang tertimbun.");
        }else {
            System.out.print("Motor dengan plat nomor: ");
            motor.printQueue();
            System.out.print("masih tertimbun reruntuhan.\n");
        }


        System.out.println("\nTotal korban tertimbun sebanyak " + (mobil.getKorban() + motor.getKorban()) + " orang.");
    }
}

class Motor {
    NodeMtr head;
    NodeMtr tail;
    int size = 0;

    boolean isEmpty(){
        return size == 0;
    }

    int size (){
        return size;
    }
    void enqueue(int cc , String plat) {
        NodeMtr input = new NodeMtr(cc, plat);
        NodeMtr curr = head;
        if (isEmpty()) {
            head = tail = input;
        } else {
            if (input.cc > head.cc){
                input.next = head;
                head = input;
            }else {
                while (curr.next != null) {
                    if (input.cc < curr.next.cc) {
                        input.next = curr.next;
                        curr.next.prev = input;
                        curr.next = input;
                        input.prev = curr;
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

    String dequeue (){
        if (isEmpty()){
            return null;
        }
        NodeMtr temp = head;
        head = head.next;
        size--;

        return temp.plat;
    }

    void printQueue (){
        NodeMtr curr = tail;
        while (curr != null){
            System.out.print(curr.plat + ", ");
            curr = curr.prev;
        }
        System.out.print(head.plat + ", ");
    }



    int getKorban (){
        int totalKorban = 0;
        NodeMtr curr = head;
        while (curr != null){
            totalKorban += 1;
            curr = curr.next;
        }
        return totalKorban;
    }

}

class Mobil {
    NodeMbl head, tail;
    int size = 0;

    String peek (){
        if (head == null){
            return null;
        }
        return head.plat;
    }

    public int isEmpty (){
        if (size == 0){
            return -1;
        }
        return -1;
    }

    public void push (String plat, int penumpang){
        NodeMbl input = new NodeMbl(penumpang, plat);
        if(head == null && tail == null){
            head = tail = input;
            size++;
            return;
        }
        input.next = head;
        head = input;
        size++;
    }

    public Object pop(){
        if (size == 0){
            return -1;
        }
        NodeMbl temp = head;
        head = head.next;
        size--;
        return temp.plat;
    }

    public void printStack (){
        NodeMbl curr = head;
        while (curr != null){
            System.out.print(curr.plat + ", ");
            curr = curr.next;
        }
    }

    int getKorban (){
        int totalKorban = 0;
        NodeMbl curr = head;
        while (curr != null){
            totalKorban += curr.penumpang;
            curr = curr.next;
        }
        return totalKorban;
    }
}


class NodeMbl {
    NodeMbl next;
    int penumpang;
    String plat;
    public NodeMbl(int penumpang, String plat) {
        this.penumpang = penumpang;
        this.plat = plat;
    }
}

class NodeMtr {
    NodeMtr next;
    NodeMtr prev;
    int cc;
    String plat;
    public NodeMtr(int cc, String plat) {
        this.cc = cc;
        this.plat = plat;
    }
}