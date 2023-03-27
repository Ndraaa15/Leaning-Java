package HackerRank;

import java.util.Scanner;

public class Penyederhanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        int bil = 0;

        if (a < b){
            bil += a;
        }else {
            bil += b;
        }

        int fpb = 1;

        for (int i = 2; i <= bil; i++) {

            if (a%i == 0 && b %i == 0){
                fpb *= i;
            }
        }

        System.out.println(fpb);

        if (fpb == 1){
            System.out.println("SUDAH SEDERHANA");
        } else {
            System.out.println("BELUM SEDERHANA");
        }
    }
}
