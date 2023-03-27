package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class HurufTerbanyak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine().toUpperCase();
        String sent = sen.replaceAll(",", "");
        String sente = sent.replaceAll(" ", "");

        char [] alpha = sente.toCharArray();

        Arrays.sort(alpha);

        int jumlahAngka = 0;
        char angka = '1';

        int jumlahHuruf = 0;
        char huruf = '1';

        for (int i = 0; i < alpha.length; i++) {
            int temp = 0;
            for (int j = 0; j < alpha.length; j++) {
                if (alpha[i] == alpha[j]){
                    temp++;
                }
            }
            System.out.println(alpha[i] + " " + temp);
            if((int)alpha[i] >= 48 && (int)alpha[i] <= 57){
                if (temp > jumlahAngka){
                    jumlahAngka = temp;
                    angka = alpha[i];
                }
            }else {
                if (temp > jumlahHuruf){
                    jumlahHuruf = temp;
                    huruf = alpha[i];
                }
            }
            i += temp - 1;
        }

        System.out.println("Huruf terbanyak : " + huruf);
        System.out.println("Angka terbanyak : " + angka);



    }
}
