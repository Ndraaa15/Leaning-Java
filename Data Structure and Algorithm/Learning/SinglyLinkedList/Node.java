package src.DataStructure.SinglyLinkedList;

class Node{
    //Object dibawah bisa diganti tergantung kebutuhan (bisa menjadi int atau string)
    //Field data
    Object data;
    Node next;
    Node (){

    }
    Node(Object data){
        this.data = data;
    }
    Node (Object data, Node next){
        this.data = data;
        this.next = next;
    }
}
