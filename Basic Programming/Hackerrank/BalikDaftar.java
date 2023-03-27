package HackerRank;

import java.util.Scanner;

public class BalikDaftar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String [] num = new String[a];
        for (int i = 0; i < a; i++) {
            num[i]= sc.next();
        }
        for (int i = num.length-1 ;i >= 0 ; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
