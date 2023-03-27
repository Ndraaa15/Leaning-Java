package src.DataStructure;
import java.util.*;
import java.util.Stack;

public class ValidParantheses {
    //Stack implementation

    public static void main(String[] args) {
        String name = "{{()}}";
        Stack<Character> stack = new java.util.Stack<Character>();
        boolean ans;
        for (char z: name.toCharArray()) {
            if (z == '('){
                stack.push(')');
            } else if (z == '{') {
                stack.push('}');
            } else if (z == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != z){
                    ans = false;
                }
            }
        }
        System.out.println(stack);
        ans = stack.isEmpty();
        System.out.println(ans);
    }
}
