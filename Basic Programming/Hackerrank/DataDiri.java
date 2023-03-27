package HackerRank;

import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String [] name  = new String[a];
        int [] age = new int[a];
        for (int i = 0; i < a; i++) {
            name[i] = sc.next();
            age[i] = sc.nextInt();
        }
        int c = sc.nextInt();
        System.out.println("nama :" + name[c - 1]);
        System.out.println("umur :" + age[c - 1]);
    }
}
