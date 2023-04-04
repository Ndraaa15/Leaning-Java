package src.DataStructure.Queue.Array;

public class QueueArrayCircular {
    int size;
    int front, rear;
    Object array[];
    int itemCount;
    public QueueArrayCircular (int size){
        this.size = size;
        array = new Object[size];
        itemCount = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty (){
        return itemCount == 0;
    }

    public boolean isFull (){
        return itemCount == array.length;
    }

    public void enqueue (Object input){
        if (isFull()){
            array = arrayCircularDoubling(array);
        }
        if (rear == array.length - 1){
            rear = -1;
            if (array[rear + 1] == null){
                array[++rear] = input;
            }
        }else {
            array[++rear] = input;
        }
        itemCount++;
    }

    public Object dequeue (){
        if (isEmpty()){
            System.err.println("Queue is empty");
            return null;
        }
        if (front == array.length){
            front = 0;
        }
        if (array[front] == null){
            System.out.println("Error");
            return null;
        }
        Object temp = array[front];
        array[front] = null;
        front++;
        itemCount--;
        return temp;
    }

    public Object peek (){
        return array[front];
    }

    public Object [] arrayCircularDoubling (Object [] oldArray){
        Object [] newArray = new Object[oldArray.length * 2];
        //front
        int j = front;
        System.out.println(oldArray.length);
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = oldArray[j];
            j++;
            if (j == oldArray.length){
                j = 0;
            }
            if (j == front){
                break;
            }
        }
        front = 0;
        rear = oldArray.length - 1;
        return newArray;
    }

    public void printQ (){
        for (int i = 0; i < array.length; i++) {
            System.out.print(" <-- " + array[i]);
        }
        System.out.println();
    }

}

