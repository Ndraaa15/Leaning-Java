package HackerRank;

import java.util.Scanner;

public class JavaLoopsDeret {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();


        int hasil1 = 0;



        for (int i = 0; i < line; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            for (int j = 0; j < n; j++) {

                hasil1=b*(int)Math.pow(2,j);

                a+=hasil1;

                System.out.print(a+" ");

            }

            System.out.println();
        }
    }
}
