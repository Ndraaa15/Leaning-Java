package src.ASD_HackerRank.SemogaTidakErrorLagi;

import java.util.Scanner;
import java.util.Stack;

public class SemogaTidakErrorLagi {
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String bracket = sc.nextLine();
        String [] splittedBracket = bracket.split("");
        int counter = 0;
        for (int i = 0; i < splittedBracket.length; i++) {
            if (splittedBracket[i].equals("{")){
                stack.push("}");
            }else if (splittedBracket[i].equals("[")){
                stack.push("]");
            }else if (splittedBracket[i].equals("(")){
                stack.push(")");
            }else {
                if (!stack.pop().equals(splittedBracket[i])){
                    System.out.println("Tidak Seimbang");
                    return;
                }else {
                    counter++;
                }
            }
        }
        System.out.println("Seimbang " + counter);
    }
}

