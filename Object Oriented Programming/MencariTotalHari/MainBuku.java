package src.OOP_C.MencariTotalHari;


import java.util.Scanner;

class Buku{
    private double totalLembar; //Total jumlah lembar kertas dalam 1 buku
    private double kataPerHari; //Jumlah kata yang bisa dikerjakan dalam 1 hari
    private double halamanPerHari; //Jumlah halaman yang bisa dikerjakan dalam 1 hari

    public void setTotalLembar(double i) {
        totalLembar = i;
    }

    public void setKataPerHari(double i) {
        kataPerHari = i;
    }

    public void setHalamanPerHari(double i) {
        halamanPerHari = i;
    }

    private double totalHari (double totalLembar, double halamanPerHari){
        double totalHari = totalLembar / lembarPerHari(halamanPerHari);
        return totalHari;
    }

    private double totalKata (double totalLembar, double kataPerHari){
        double totalKata = totalLembar * kataPerLembar(kataPerHari);
        return totalKata;
    }
    private double lembarPerHari (double halamanPerHari){
        return halamanPerHari / 2;
    }

    private double kataPerLembar (double kataPerHari){
        return kataPerHari / lembarPerHari(halamanPerHari) ;
    }

    public void result (){
        System.out.println("Hasil analisis");
        System.out.println("[A] Total hari : " + (int) (totalHari(totalLembar, halamanPerHari)));
        System.out.println("[B] Total kata : " + (int) (totalKata(totalLembar, kataPerHari)));
    }
}


public class MainBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("[1] Total lembar buku yang dibuat                 : ");
        double totaLembar = sc.nextDouble();
        System.out.print("[2] Jumlah kata yang bisa diselesaikan sehari     : ");
        double kataPerHari = sc.nextDouble();
        System.out.print("[3] Jumlah halaman yang bisa diselesaikan sehari  : ");
        double halamanPerHari = sc.nextDouble();
        //Case 1 = 1 lembar terdiri dari 2 halaman
        //Case 2 = 1 lembar terdiri dari 1 halaman
        //Dalam kode ini akan menggunakan case 1.
        Buku buku = new Buku();
        buku.setHalamanPerHari(halamanPerHari);
        buku.setKataPerHari(kataPerHari);
        buku.setTotalLembar(totaLembar);
        buku.result();
    }
}
