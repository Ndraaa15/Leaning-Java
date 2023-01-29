package HackerRank;

import java.util.*;

public class IndeksArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] x = new int[a];
        for (int i = 0; i < a; i++) {
            x[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int f = 0;
        for (int i = 0; i < a; i++) {
            if (x[i] == q){
                System.out.print(i + " ");
                f++;
            }
        }
        if (f == 0){
            System.out.println("-1");
        }
    }
}