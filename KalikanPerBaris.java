package HackerRank;

import java.util.Scanner;

public class KalikanPerBaris {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int [][] num = new int [a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                num[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < a; i++) {
            int temp = 1;
            for (int j = 0; j < b; j++) {
                temp *= num[i][j];
                System.out.print(num[i][j] + " ");
            }
            System.out.print("  " + "==> " + temp);
            System.out.println();
        }

    }
}
