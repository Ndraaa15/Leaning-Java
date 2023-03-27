package src.DataStructure.Stack.Array;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.initialize(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("pop : " + stack.pop());
        System.out.println("pop : " + stack.pop());

        System.out.println("top : " + stack.peek());
    }
}
