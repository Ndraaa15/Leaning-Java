package HackerRank;

import java.util.Scanner;

public class AnakTangga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anakTangga = sc.nextInt();
        int kelipatan = sc.nextInt();

        if (kelipatan > anakTangga){
            System.out.println(-1);
            return;
        }

        if (kelipatan == anakTangga){
            System.out.println(kelipatan);
            return;
        }

        if (((double)anakTangga/2) % kelipatan == 0){
            System.out.println(anakTangga/2);
            return;
        }


        int z = 1;
        int normal = anakTangga;
        while (anakTangga != 0){
            anakTangga -= z;
            if (anakTangga == -1){
                System.out.println(-1);
                return;
            }
            System.out.println("Sisa : " + anakTangga);
            double langkah = (double) anakTangga/2 + z;
            System.out.println(langkah);
            if (langkah % kelipatan == 0){
                System.out.print((int) langkah);
                return;
            }
            z++;
            anakTangga = normal;
        }
    }
}
