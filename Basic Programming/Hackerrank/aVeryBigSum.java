package HackerRank;

import java.util.Scanner;

public class aVeryBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        long [] number = new long[a];

        long sum = 0;

        for (int i = 0; i < a; i++) {
            number[i] = sc.nextLong();
            sum += number[i];

            System.out.println(number[i]);

        }
        System.out.print(sum);

    }


}
