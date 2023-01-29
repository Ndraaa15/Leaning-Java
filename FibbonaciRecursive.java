package HackerRank;

import java.util.Scanner;

public class FibbonaciRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num1 = 1;
        int num2 = 1;
        for (int i = 3; i <= a; i++) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        System.out.println(num2);
    }
}
