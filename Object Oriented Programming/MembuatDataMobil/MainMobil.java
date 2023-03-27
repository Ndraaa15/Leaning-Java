package src.OOP_C.MembuatDataMobil;

import java.util.ArrayList;
import java.util.Scanner;

class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;

    public void setNoPlat(String s){
         noPlat = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
         manufaktur = s;
    }
    public void setKecepatan(double i){
         kecepatan = rubahKecepatan(i);
    }

    public void setWaktu (double i){
        waktu = rubahSekon(i);
    }
    public double setJarak (double kecepatan, double waktu){
        double jarak = kecepatan * waktu;
        return rubahJarak(jarak);
    }
    private double rubahSekon (double i){
        return i * 3600;
    }
    private double rubahKecepatan(double i){
        return (i * 1000) / 3600;
    }
    private double rubahJarak (double i){
        return i / 1000;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+kecepatan + " m/s");
        System.out.println("sehingga untuk menempuh jarak " + setJarak(kecepatan, waktu) + " Km " + " akan memerlukan waktu " + waktu + " sekon");
    }
}

public class MainMobil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mobil> listMobil = new ArrayList<>();
        System.out.println("             Selamat datang di Jasa Pengecekan Kendaraan            ");
        System.out.println("-------------------------------------------------------------------");
        boolean isTrue = true;
        do {
            System.out.println("Pilih pilihan anda : ");
            System.out.println("[a] Masukkan data kendaraan");
            System.out.println("[b] Tampilkan semua data kendaraan");
            System.out.println("[c] Selesai");
            System.out.print("Pilihan anda : ");
            String option = sc.nextLine();
            if (option.equals("a")){
                Mobil mobil = new Mobil();
                System.out.print("[1] Masukkan jenis manufaktur kendaraan anda             : ");
                String manufaktur = sc.nextLine();
                mobil.setManufaktur(manufaktur);
                System.out.print("[2] Masukkan nomor plat kendaraan anda                   : ");
                String noPlat = sc.nextLine();
                mobil.setNoPlat(noPlat);
                System.out.print("[3] Masukkan warna kendaraan anda                        : ");
                String warna = sc.nextLine();
                mobil.setWarna(warna);
                System.out.print("[4] Masukkan kecepatan kendaraan anda                    : ");
                double kecepatan = sc.nextDouble();
                mobil.setKecepatan(kecepatan);
                System.out.print("[5] Masukkan waktu yang ingin kendaraan anda tempuh (jam): ");
                double waktu = sc.nextDouble();
                sc.nextLine();
                mobil.setWaktu(waktu);
                mobil.displayMessage();
                listMobil.add(mobil);
            }else if (option.equals("b")){
                for (Mobil value : listMobil) {
                    value.displayMessage();
                    System.out.println();
                }
            }else if (option.equals("c")){
                isTrue = false;
            }
        }while (isTrue);
    }
}
