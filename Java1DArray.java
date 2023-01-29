package HackerRank;

import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int [] number = new int[a];

        for (int i = 0; i < a; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i <a ; i++) {
            System.out.println(number[i]);
        }
    }
}
