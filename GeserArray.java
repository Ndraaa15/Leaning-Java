package HackerRank;

import java.util.Scanner;

public class GeserArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] num = new int [a];
        for (int i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int z = num.length;
        for (int i = x; i < z ; i++) {
            System.out.println(num [i] + " ");
        }
        for (int i = 0; i < x; i++) {
            System.out.println(num [i] + " ");
        }
    }
}
