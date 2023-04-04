package src.DataStructure.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList a = new DoublyLinkedList();
        a.addLast("A");
        a.printAll();
        a.addLast("B");
        a.printAll();
        a.addLast("C");
        a.printAll();
        a.removeData("C");
        a.printAll();
        a.addLast("GG");
        a.printAll();
        a.insertAfter(2, "C");
        a.printAll();
        a.removeData("C");
        a.printAll();

    }
}
