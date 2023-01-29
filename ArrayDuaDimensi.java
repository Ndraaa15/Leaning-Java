package HackerRank;

import java.util.Scanner;

public class ArrayDuaDimensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [][] num = new int[a][2];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 2; j++) {
                num[i][j] = sc.nextInt();
                System.out.print(i + " " + j + " " + num[i][j] + "\n");
            }
        }
    }
}
