package src.DataStructure;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        //Priority queue merupakan contoh dari FIFO dimana sebelum menyajikan elementnya kita membuat prioritasnya terlebih
        //dahulu

        //Priority queue biasanya berurutan dari yang terkecil ke terbesar
        Queue <Double> queue = new java.util.PriorityQueue<>(Collections.reverseOrder());

        //Reverse order biasanya digunakan untuk membalikkan priority dari yang terbesar ke terkecil
        queue.offer(2.0);
        queue.offer(3.5);
        queue.offer(4.0);
        queue.offer(1.5);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
