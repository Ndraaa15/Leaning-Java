package src.DataStructure.Queue.LinkedList;

class LinkedList {
    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty () {
        return size == 0;
    }

    public void makeEmpty (){
        head = tail =  null;
        size = 0;
    }

    public void enqueue (Object data){
        Node input = new Node(data);
        if (isEmpty()){
            head = tail = input;
        }else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    public Object dequeue (){
        Node curr = head;
        if (isEmpty()){
            System.err.println("Queue is empty");
            return null;
        }else {
            head = head.next;
        }
        return curr.data;
    }

    public Object peek (){
        return head.data;
    }

}
