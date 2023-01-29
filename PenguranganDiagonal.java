package HackerRank;

import java.util.Scanner;

public class PenguranganDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix [i][j] = sc.nextInt();
            }
        }

        //Diagonal kiri ke kanan
        int d1 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j <= i; j++) {
                d1 += matrix[i][j];
            }
        }
        System.out.println(d1);

        //Diagonal kanan ke kiri
        int d2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 2 - i; j <= 2 - i ; j++) {
                d2 += matrix [i][j];
            }
        }
        System.out.println(d2);

        int ans = Math.abs(d1 - d2);
        System.out.println(ans);
    }
}
