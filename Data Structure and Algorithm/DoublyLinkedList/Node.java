package src.DataStructure.DoublyLinkedList;

class Node {
        //Object dibawah bisa diganti tergantung kebutuhan (bisa menjadi int atau string)
        //Field data
        public Object data;
        public Node next;
        public Node prev;
        Node (){

        }
        Node(Object data){
            this.data = data;
        }
        Node (Object data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
    }
}
