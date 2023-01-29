package HackerRank;

import java.util.Scanner;

public class NilaiFPBdanKPK {
    public static void main(String[] args) {
//        a * b / fpb (a, b) = kpk (a, b)

        Scanner sc = new Scanner(System.in);
        int fpb = sc.nextInt();
        int kpk = sc.nextInt();


        int bil1 = 0;
        int bil2 = 0;
        for (int i = 1; i <= kpk; i++) {
            int temp = 0;
            int temp1 = 1;
            if (kpk % i == 0){
                temp += i;
            }
            int s = kpk/temp;
            for (int j = 1; j < s; j++) {
                if (temp % j == 0 && s % j == 0){
                    temp1 *= j;
                }
            }
            if (temp1 == fpb){
                bil1 += i;
                bil2 += temp;
            }
        }

        System.out.println(bil1 + ", " + bil2);


    }
}
