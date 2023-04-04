package src.DataStructure.DoublyLinkedList;

class DoublyLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty (){
        return size == 0;
    }
    public int size (){
        return size;
    }
    public void  addLast (Object data){
        Node input = new Node(data);
        if (isEmpty()){
            head = tail = input;
        }else {
            input.prev = tail;
            tail.next = input;
            tail = input;
        }
        size++;
    }

    public void addFirst (Object data){
        Node input = new Node(data);
        if (isEmpty()){
            head = tail = input;
        }else{
            input.next = head;
            head.prev = input;
            head = input;
        }
        size++;
    }

    public void removeFirst(){
        if (isEmpty()){
            throw new NullPointerException();
        }else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast (){
        if (isEmpty()){
            throw new NullPointerException();
        }else {
            Node temp = tail.prev;
            tail.prev.next = null;
            tail = temp;
        }
        size--;
    }

    //Insert after index i and adding data
    public void insertAfter (int index, Object data){
        if (index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException();
        }
        Node input = new Node(data);
        if (index == 0){
            if (head.next == null){
                addLast(data);
                return;
            }else {
                input.next = head.next;
                head.next.prev = input;
                input.prev = head;
                head.next = input;
            }
        } else {
            Node curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            if (curr.next == null){
                addLast(data);
                return;
            }else {
                input.next = curr.next;
                curr.next.prev = curr;
                curr.next = input;
                input.prev = curr;
            }
        }
        size++;
    }

    //Insert before index i and adding data
    public void insertBefore (int index, Object data){
        if (index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException();
        }
        Node input = new Node(data);
        if (index == 0){
            addFirst(data);
            return;
        }else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            input.next = curr.next;
            curr.next.prev = input;
            curr.next = input;
            input.prev = curr;
        }
        size++;
    }

    //Remode node using data target
    public void removeData (Object target){
        Node curr = head;
        while (curr != null){
            if (curr.data == target){
                if (curr == head){
                    removeFirst();
                    break;
                } else if (curr == tail) {
                    removeLast();
                    break;
                }else {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                    size--;
                    break;
                }
            }
            curr = curr.next;
        }
    }

    //Remode node using index target
    public void removeIndex (int index){
        if (index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            removeFirst();
            return;
        }else if (index == size - 1){
            removeLast();
        }else {
            Node curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            curr.next.prev = curr.prev;
            curr.prev.next = curr.next;
        }
    }


    public void printAll (){
        Node curr = head;
        while (curr != null){
            System.out.print("<-" + curr.data + "->");
            curr = curr.next;
        }
        System.out.print(", size : " + size());
        System.out.println();
    }
}
