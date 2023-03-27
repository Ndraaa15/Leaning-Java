package HackerRank;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();

       int [] number = new int[a];

       int sum = 0;
        for (int i = 0; i < a; i++) {
            number[i] = sc.nextInt();
            sum += number[i];
        }

        System.out.println(sum);
    }
}
