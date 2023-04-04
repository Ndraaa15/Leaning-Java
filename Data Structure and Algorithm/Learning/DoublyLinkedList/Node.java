package src.DataStructure.DoublyLinkedList;

class Node {
    //Object dibawah bisa diganti tergantung kebutuhan (bisa menjadi int atau string)
    //Field data
    Object data;
    Node next;
    Node prev;

    Node(Object data){
        this.data = data;
    }
}
