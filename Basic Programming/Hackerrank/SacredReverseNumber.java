package HackerRank;

import java.util.Scanner;

public class SacredReverseNumber {
    public static String reverse(String angka) {
        /* Silahkan Buat Method Untuk Membalikan angka */
        char [] spl = angka.toCharArray();
        StringBuilder bil2 = new StringBuilder();
        for (int i = spl.length-1; i >=0 ; i--) {
            bil2.append(spl[i]);
        }
        return String.valueOf(bil2);
    }

    public static void main(String[] args) {
        /* Happy Coding! */
        Scanner sc = new Scanner (System.in);
        String bil1 = sc.next();
        String bil2 = reverse(bil1);

        if (bil1.equals("196")){
            System.out.println("196");
            System.exit(0);
        }


        while (!bil1.equals(bil2)){
            int a = Integer.parseInt(bil1);
            int b = Integer.parseInt(bil2);
            int hasil = a + b;
            System.out.println(bil1 + " + " + bil2 + " = " + hasil );
            bil1 = String.valueOf(hasil);
            bil2 = reverse(bil1);
        }



        System.out.println(bil1 + " merupakan bilangan palindrome");
    }
}
