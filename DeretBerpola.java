package HackerRank;

import java.util.Scanner;

public class DeretBerpola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= a; i++) {

            if (i % b == 0) {
                System.out.print("*" + " ");
            }
            System.out.print(i + " ");
        }

    }
}
