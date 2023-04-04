package src.DataStructure.Stack.LinkedList;


class Stack {
    Node head, tail;
    int size = 0;


    public Object peek (){
        if (head == null){
            return null;
        }
        return head.data;
    }
    public int isEmpty (){
        if (size == 0){
            return -1;
        }
        return -1;
    }

    public void push (Object x){
        Node input = new Node(x);
        if(head == null && tail == null){
            head = tail = input;
            size++;
            return;
        }
        input.next = head;
        head = input;
        size++;
    }

    public Object pop(){
        if (size == 0){
            return -1;
        }
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    public void printStack (){
        Node curr = head;
        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println("---");
    }

    public int size (){
        return size;
    }
}
