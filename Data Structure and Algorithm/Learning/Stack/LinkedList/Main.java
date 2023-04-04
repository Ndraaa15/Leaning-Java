package src.DataStructure.Stack.LinkedList;


public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();
        System.out.println("pop : " + stack.pop());
        System.out.println("pop : " + stack.pop());

        System.out.println("top : " + stack.peek());
    }
}
