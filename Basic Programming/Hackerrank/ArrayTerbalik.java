package HackerRank;

import java.util.Scanner;

public class ArrayTerbalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] x = new int[a];
        for (int i = 0; i < a; i++) {
            x[i]= sc.nextInt();
        }
        for (int i = a - 1; i >= 0 ; i--) {
            System.out.print(x[i] + " ");
        }
    }
}
