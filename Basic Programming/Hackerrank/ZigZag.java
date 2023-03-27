package HackerRank;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int [][] num = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num [i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < col; i++) {
            if (i % 2 == 1){
                for (int k = row - 1; k >= 0 ; k--) {
                    System.out.print(num[k][i] + " ");
                }
            }else {
                for (int j = 0; j < row; j++) {
                    System.out.print(num[j][i] + " ");
                }
            }
        }
    }
}
