package HackerRank;

import java.util.Scanner;

public class RotasiMatriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [][] num = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                num [i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = a-1; j >= 0; j--) {
                System.out.print(num[j][i] + " ");
            }
            System.out.println();
        }
    }
}
