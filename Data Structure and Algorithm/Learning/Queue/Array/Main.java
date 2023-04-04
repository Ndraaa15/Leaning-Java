package src.DataStructure.Queue.Array;

public class Main {
    public static void main(String[] args) {
        QueueArrayCircular queue = new QueueArrayCircular(5);
        queue.enqueue(1);
        queue.printQ();
        queue.enqueue(2);
        queue.printQ();
        queue.enqueue(3);
        queue.printQ();
        queue.enqueue(4);
        queue.printQ();
        queue.enqueue(5);
        queue.printQ();
        queue.dequeue();
        queue.printQ();
        queue.dequeue();
        queue.printQ();
        queue.enqueue(6);
        queue.printQ();
        queue.enqueue(7);
        queue.printQ();
        queue.enqueue(8);
        queue.printQ();


    }
}
