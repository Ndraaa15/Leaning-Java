package HackerRank;

import java.util.Scanner;

public class OrchidOotd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long mul = 1;
        for(int i = 0; i < 8; i++){
            mul *= sc.nextLong();
            double ans =mul % (Math.pow(10.0, 7.0) + 1);
            mul = (long) ans;
        }

        System.out.println(mul);

    }
}
