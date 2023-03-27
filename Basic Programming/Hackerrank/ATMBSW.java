package HackerRank;

import java.util.Scanner;

public class ATMBSW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();

        long seratus = a/100;
        long limapuluh1= a%100;
        long limapuluh = limapuluh1/50;
        long duapuluh1 = limapuluh1%50;
        long duapuluh = duapuluh1 /20;
        long sepuluh1 = duapuluh1%20;
        long sepuluh = sepuluh1/10;
        long lima1 = sepuluh1%10;
        long lima = lima1/5;
        long dua1 = lima1%5;
        long dua = dua1/2;
        long satu1 = dua1%2;

        System.out.print(seratus + " " + limapuluh + " " + duapuluh + " " + sepuluh + " " + lima + " " + dua + " " + satu1);

    }
}
