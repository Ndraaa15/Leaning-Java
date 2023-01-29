package HackerRank;

import java.util.Scanner;

public class DiagonalDiferrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int [] a = new int [x];

        for (int i = 0; i < x ; i++) {
            for (int j = 0; j < x; j++) {
                a[i] = sc.nextInt();
            }
            System.out.println();
        }

        int sum1 = 0;
        for (int i = 0; i < x; i++) {
            for (int j = i; j <= i; j++) {
                sum1 += a[i];
            }
            System.out.println();
        }

        System.out.println(sum1);

        int sum2 = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 3; j >= x - i; j--) {
                sum2 += a[i];
            }
            System.out.println();
        }
        System.out.println(sum2);

        int result = Math.abs(sum1 - sum2);

        System.out.println(result);

    }
}
