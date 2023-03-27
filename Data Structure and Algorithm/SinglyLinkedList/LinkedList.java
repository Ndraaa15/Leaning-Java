package src.DataStructure.SinglyLinkedList;

class LinkedList{
    Node head, tail;
    private int size = 0;

    boolean isEmpty (){
        return size == 0;
    }

    int getSize(){
        return size;
    }

    void addFirst (Object data){
        Node input = new Node(data);
        if (isEmpty()){
            head = tail = input;
        }else {
            input.next = head;
            head = input;
        }
        size++;
    }

    public void addLast(Object data){
        Node input = new Node(data);
        if (isEmpty()){
            head = tail = input;
        }else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    void insertAfter (Object target, Object data){
        Node input = new Node(data);
        Node p = head;
        while (p != null){
            if (p.data.equals(target)){
                input.next = p.next;
                p.next = input;
                size++;
            }
            p = p.next;
        }
    }

     void insertBefore (Object target, Object data){
       Node input = new Node(data);
       Node p = head;
       while (p != null){
           if (head.data.equals(target)){
               addFirst(data);
           }else if (p.next.data.equals(target)){
               input.next = p.next;
               p.next = input;
               break;
           }
           p = p.next;
       }
       size++;
    }

     void removeFirst (){
        if(size == 1){
            head = tail = null;
            return;
        }
        Node p = head;
        if (!isEmpty()){
            size--;
        }else {
            System.err.println("Data is empty!");
        }
        if (size < 0){
            System.err.println("Size out of bounds!");
        } else {
            if (head.equals(tail)){
                tail = head = null;
            }else {
                p = p.next;
                head = p;
                p = null;
            }
        }
    }

     void removeLast (){
        if(size == 1){
            head = tail = null;
            return;
        }
        Node p = head;
        if (!isEmpty()){
            size--;
        }else {
            System.err.println("Data is empty!");
        }
        if (size < 0){
            System.err.println("Size out of bounds!");
        } else {
            while (p.next != tail){
                p = p.next;
            }
            p.next = null;
            tail = p;
            p = null;
        }
    }

     void remove (Object target){
        if(size == 1){
            head = tail = null;
            return;
        }
        Node p = head;
        if (!isEmpty()){
            size--;
        }else {
            System.err.println("Data is empty!");
        }
        if (size > 0){
            while (p != null){
                if (p.next.data.equals(target)){
                    p.next = p.next.next;
                    if (p.next == null){
                        removeLast();
                    }
                    break;
                }
                p = p.next;
            }
        }else {
            System.err.println("Size out of bounds!");
        }
    }

//    public void replace (Object target, Object data){
//        Node p = head;
//        Node input = new Node(data);
//        while (p != null){
//            if (p.data.equals(target)){
//                p.data = target;
//                break;
//            }
//            p = p.next;
//        }
//    }


     void replace (int index, Object data){
       Node p = head;
       Node input = new Node(data);
        for (int i = 0; i < index - 1; i++) {
            p = p.next;
        }
        remove(p.next.data);
        insertAfter(p.data, input.data);
    }

     void clear (){
        head = tail = null;
    }


    //Buatlah method untuk mengakses semua data pada singly linked list.
     void printAll (){
        Node p = head;
        while (p != null){
            System.out.print(p.data + " --> ");
            p = p.next;
        }
        System.out.println();
    }
}

