package src.DataStructure.PriorityQ;

public class Main {
    public static void main(String[] args) {
        PriorityQ a = new PriorityQ();
        a.enqueue("A", 1);
        a.enqueue("B", 10);
        a.printAll();
        a.enqueue("D", 0);
        a.printAll();
        a.enqueue("F", 2);
        a.printAll();
        a.enqueue("Z", -1);
        a.printAll();
        System.out.println(a.dequeue());
        a.printAll();
    }
}
