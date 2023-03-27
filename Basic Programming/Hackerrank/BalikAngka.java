package HackerRank;

import java.util.Scanner;

public class BalikAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String a = sc.nextLine();

        String [] angka = a.split("");

        int  b = a.length();


        for (int i = b - 1; i >= 1; i--) {

            if (angka[i].equals("-")){
                System.out.print("-");
                System.out.print(angka[i]);
            } else {
                System.out.print(angka[i]);
            }
        }
    }
}
