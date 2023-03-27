package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();


        //1
        ArrayList <Integer> hasil = new ArrayList<>(a);

        String bilangan = "";

        for (int i = 2; i < a; i++) {
            int hasilSementara = 0;
            for (int j = i; j < 1 + i; j++) {

                hasil.add(hasilSementara += a % j);

            }
        }

        if (hasil.contains(0)){
            bilangan += "Bukan Prima";
        } else{
            bilangan += "Prima";
        }

        System.out.println(bilangan);

        //2


        boolean x = true;
        if (a == 1 || a == 0){
            System.out.println ("Bukan Bilangan Prima");

            return;
        }


        for (int i = 2; i < a; i++) {
            if (a % i == 0){
                x =false;
                break;
            }
        }

        if (x){
            System.out.println("Prima");
        }else {
            System.out.println("Bukan Bilangan Prima");
        }


    }
}
