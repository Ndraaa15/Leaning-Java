package HackerRank;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] x = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        long a;
        a = Long.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            long temp;
            for (int j = 0; j < 3; j++) {
                temp = (x[i][j] + x[i][j + 1] + x[i][j + 2]) + x[i + 1][j + 1] + (x[i+2][j] + x[i+2][j+1] + x[i+2][j+2]);
                a = Math.max(a, temp);
            }
        }
        System.out.println(a);
    }
}
