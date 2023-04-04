package src.DataStructure.CircularDoublyLinkedList;



public class Main {
    public static void main(String[] args) {
        CircularLinkedList a = new CircularLinkedList();
        a.addFirst("A");
        a.printAll();
        a.addFirst("B");
        a.printAll();
        a.addFirst("C");
        a.printAll();
        a.insertAfter(0, "D");
        a.printAll();
        a.insertAfter(3, "E");
        a.printAll();
        a.insertAfter(2, "GG");
        a.printAll();
        a.insertBefore(0, "F");
        a.printAll();
        a.insertBefore(-50, "F");
        a.printAll();

    }
}
