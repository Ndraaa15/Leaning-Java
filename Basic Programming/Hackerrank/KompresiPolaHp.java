package HackerRank;

import java.util.Scanner;

public class KompresiPolaHp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] num = new int[n][n];
        int [] pola = new int[m];
        int z = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; n++) {
                num[i][j]= z;
                z++;
            }
        }
        for (int i = 0; i < m; i++) {
            pola[i] = sc.nextInt();
        }
    }
}
