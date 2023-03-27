package src.DataStructure.Stack.Array;

import java.util.EmptyStackException;

class Stack {
    int top;
    int arraySize;
    Object [] array;

    public void  initialize (int arraySize){
        this.arraySize = arraySize;
        array = new Object[this.arraySize];
        top = -1;
    }
    public boolean isEmpty (){
        return top == -1;
    }

    public boolean isFull (){
        return  top == this.arraySize - 1;
    }

    public Object pop (){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return array[top--];
    }

    public void push (Object o){
        if (isFull()){
            array =  arrayDoubling(array);
        }
        array[++top] = o;
    }

    public Object peek (){
        return array[top];
    }

    public Object [] arrayDoubling (Object [] x){
        Object [] newArr = new Object [2 * x.length];
        //In the last argument we need to put the length of original array
        System.arraycopy(x, 0, newArr, 0, x.length);
        return newArr;
    }

    public Object [] arrayResizing (Object [] x){
        Object [] newArr = new Object[2 * x.length];
        for (int i = 0; i < x.length; i++) {
            newArr[i] = x[i];
        }
        return newArr;
    }
}
