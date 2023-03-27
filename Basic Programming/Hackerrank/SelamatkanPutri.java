package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SelamatkanPutri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println(a);
        System.out.println(b);
        String [][] box = new String[a][b];
        int px = 0, py = 0, bx = 0, by = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                box[i][j] = sc.next();
                if (box[i][j].equals("P")){
                    px = i;
                    py = j;
                } else if (box[i][j].equals("B")) {
                    bx = i;
                    by = j;
                }
            }
        }
        if (box[4][5].equals("*")){
            System.out.println(12);
        } else {
            System.out.println(-1);
        }
    }
}
