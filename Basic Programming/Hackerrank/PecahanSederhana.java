package HackerRank;

import java.util.Scanner;

public class PecahanSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a1 = sc.nextLong();
        long b1 = sc.nextLong();
        long a2 = sc.nextLong();
        long b2 = sc.nextLong();

        long hasilA = 0;
        long hasilB = 0;

        if (b1 == b2){
            hasilA = a1 + a2;
            hasilB = b1;
        }else {
            hasilA = (a1*b2) + (a2*b1);
            hasilB = b1*b2;
        }

        long a = hasilA;
        long b = hasilB;


        while (a != b){
            if (a>b){
                a-=b;
            }else {
                b-=a;
            }
        }

        System.out.print((hasilA/a) + " " + (hasilB/b));
    }
}
