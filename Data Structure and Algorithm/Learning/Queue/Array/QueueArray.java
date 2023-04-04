package src.DataStructure.Queue.Array;

class QueueArray {
    int front, rear;
    Object array[];
    int itemCount;
    public QueueArray (int size){
        array = new Object[size];
        itemCount = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty (){
        return itemCount == 0;
    }

    public boolean isFull (){
        return itemCount == array.length - 1;
    }

    public void enqueue (Object input){
        if (isFull()){
            array = arrayDoubling(array);
        }
        array[++rear] = input;
        itemCount++;
    }

    public Object dequeue (){
        if (isEmpty()){
            System.err.println("Queue is empty");
            return null;
        }
        Object temp = array[front];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[itemCount--] = null;
        rear--;
        return temp;
    }

    public Object peek (){
        if (isEmpty()){
            System.err.println("Queue is empty");
            return null;
        }
        return array[front];
    }

    public Object [] arrayDoubling(Object [] oldArray){
        Object [] newArray = new Object[oldArray.length * 2];
        System.arraycopy(oldArray, 0,newArray, 0, oldArray.length);
        return newArray;
    }

}
