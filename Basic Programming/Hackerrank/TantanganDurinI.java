package HackerRank;

import java.util.Scanner;

public class TantanganDurinI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 && i%5 ==0){
                System.out.println("Merah-Biru");
            }else if (i % 3 == 0){
                System.out.println("Merah");
            } else if (i % 5 == 0){
                System.out.println("Biru");
            }else {
                System.out.println("Putih");
            }
        }
    }
}
