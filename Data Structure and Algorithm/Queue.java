package src.DataStructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        //FIFO --> first in first out
        //Jadi konsep queue ini sama dengan antrian
        //Add = enqueue, offer()
        //remove = dequeue, poll()
        //Linier Data Structure

        /*Karena queue ini merupakan interface jadi kita memerlukan kelas yang menggunakan konsep
          queue yaitu linkedlist dan priority queue
         */

        java.util.Queue <String> queue = new LinkedList<>();

        //Mengecek apakah queue kosong atau tidak
        System.out.println(queue.isEmpty());

        //Untuk menambah element pada queue menggunakan perintah offer
        queue.offer("Indra");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Ray");

        //Mengecek apakah ada element ada di queue atau tidak
        System.out.println(queue.contains("Indra"));

        //Untuk mengetahui element yang menempati posisi pertama menggunakan peek
        System.out.println(queue.peek());

        System.out.println(queue);

        //Untuk menghilangkan element pada posisi pertama menggunakan poll
        queue.poll();
        queue.poll();

        System.out.println(queue.peek());
        System.out.println(queue);

        //Penggunaan Queue
        //1. Keyboard Buffer
        //2. Printer Queue
        //3. Used in linkedlist, priority queue, breadth-first search


    }
}
