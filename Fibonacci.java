package HackerRank;


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);

         int a = sc.nextInt();
         int b = Math.round(a);

         int nilai1 = 0;
         int nilai2 = 1;

        for (int i = 2; i < a   ; i++) {
            int nilai3 = nilai1 + nilai2;

            nilai1 = nilai2;
            nilai2 = nilai3;

        }

        System.out.println (nilai2);
    }
}
