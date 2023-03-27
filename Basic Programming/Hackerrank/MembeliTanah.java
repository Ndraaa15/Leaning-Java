package HackerRank;

import java.util.Scanner;

public class MembeliTanah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int bil1, bil2, sPersegi;
        if (a <= b){
            bil1 = a;
            bil2 = b;
        }else {
            bil1 = b;
            bil2 = a;
        }
        sPersegi = bil1*2;
        while(bil2 > sPersegi){
            bil1++;
            sPersegi = bil1*2;
        }

        System.out.println(sPersegi*sPersegi);
    }
}
