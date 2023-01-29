package HackerRank;

import java.util.Scanner;

public class NavisagasiRumah {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String blok1 = sc.nextLine();
        String blok2 = sc.nextLine();

        String aBlok1 = blok1.substring(0, blok1.indexOf("/"));
        String aBlok2 = blok2.substring(0, blok2.indexOf("/"));

        String bBlok1 = blok1.substring(4);
        String bBlok2 = blok2.substring(4);

        int nilaiABlok1 = Integer.parseInt(aBlok1.substring(1));
        int nilaiABlok2 = Integer.parseInt(aBlok2.substring(1));

        int nilaiBBlok1 = Integer.parseInt(bBlok1.substring(1));
        int nilaiBBlok2 = Integer.parseInt(bBlok2.substring(1));

        int hasilA = nilaiABlok2 - nilaiABlok1;
        int hasilB = nilaiBBlok2 - nilaiBBlok1;

        if (hasilA > 0 && hasilB > 0){
            System.out.println(hasilA + " langkah ke Barat dan " + hasilB + " langkah ke Selatan");
        } else if (hasilA > 0 && hasilB < 0) {
            System.out.println(hasilA + " langkah ke Barat dan " + Math.abs(hasilB) + " langkah ke Utara");
        } else if (hasilA < 0 && hasilB > 0) {
            System.out.println(Math.abs(hasilA) + " langkah ke Timur dan " + hasilB + " langkah ke Selatan");
        } else {
            System.out.println(Math.abs(hasilA) + " langkah ke Timur dan " + Math.abs(hasilB) + " langkah ke Utara");
        }


    }
}
