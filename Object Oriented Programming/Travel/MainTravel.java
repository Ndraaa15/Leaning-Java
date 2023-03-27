package src.OOP_C.Travel;

import java.util.Scanner;

class Mobil {
    public String jenis;
    public String noPolisi;
    public int tahun;
    public String warna;
    public double hargaSewa;
    public Supir supir;
    public Mobil(String noPolisi, int tahun, String warna, double hargaSewa, String jenis, Supir supir) {
        this.noPolisi = noPolisi;
        this.tahun = tahun;
        this.warna = warna;
        this.hargaSewa = hargaSewa;
        this.jenis = jenis;
        this.supir = supir;
    }

    public void detailMobil (){
        System.out.println("Detail Mobil");
        System.out.println("Jenis Mobil  : " + this.jenis );
        System.out.println("No Polisi    : " + this.noPolisi );
        System.out.println("Tahun Mobil  : " + this.tahun );
        System.out.println("Warna Mobil  : " + this.warna );
        System.out.println("Harga Sewa   : " + this.hargaSewa );

    }

    public void listMobil (){
        System.out.printf("Mobil berjenis " + this.jenis + " dengan harga sewa Rp. %,.2f" , this.hargaSewa);
    }

    public void pengemudiMobil (){
        System.out.println("Mobil dengan jenis " + this.jenis + " dikemudikan oleh " + this.supir.name);
    }

    public void tabrak (String object){
        System.out.println("Mobil dengan tipe " + this.jenis + " menabrak " + object);
    }

    public void belok (String direction){
        if (direction.equals("kiri")){
            System.out.println("Mobil " + this.jenis + " belok kiri");
        }else if (direction.equals("kanan")) {
            System.out.println("Mobil " + this.jenis + " belok kanan");
        }
    }

    public void mulaiMesin (){
        System.out.println("Mobil " + this.jenis + " siap untuk digunakan!!!");
    }

    public String toString (){
        return "Jenis mobil " + this.jenis + " keluaran tahun " + this.tahun + " dengan nomor polisi " + this.noPolisi + "\n" +
                "memiliki warna " + this.warna + " dengan harga sewa Rp. " + this.hargaSewa;
    }
}

class Supir{
    public String name;
    public String sim;
    public String alamat;
    public double gajiHarian;
    public Supir(String name, String sim, String alamat, double gajiHarian) {
        this.name = name;
        this.sim = sim;
        this.alamat = alamat;
        this.gajiHarian = gajiHarian;
    }

    public void detailSupir(){
        System.out.println("Detail Supir");
        System.out.println("Nama supir  :" + this.name);
        System.out.println("SIM         : " + this.sim);
        System.out.println("Alamat      : " + this.alamat);
        System.out.printf("Gaji Harian : Rp. %,.2f \n" , this.gajiHarian);
    }

    public void getGajiHarian (){
        System.out.printf("\n" + this.name , " mendapatkan gaji harian sebesar Rp. %,.2f" , this.gajiHarian);
    }

    public void getSIM (){
        System.out.println(this.name + " memiliki " + this.sim);
    }

    public void mulaiMenyetir(){
        System.out.println(this.name + " siap untuk mengemudi!!!");
    }

    public void cekBahanBakar (int bahanBakar){
        if (bahanBakar <= 3){
            System.out.println(this.name + " perlu mencari stasiun pengisian bahan bakar terdekat");
        }else {
            System.out.println(this.name + " bisa melanjutkan perjalanan menuju tempat tujuan");
        }
    }

    public String toString (){
        return this.name + " salah satu pegawai dari Krana Travel memiliki alamat di " + this.alamat + ". " + this.name + "\n" +
                "memiliki sim " + this.sim + " dengan gaji harian Rp. " + this.gajiHarian;
    }

}

class Pelanggan{
    public String name;
    public String noKTP;
    public String alamat;
    public Mobil mobil;
    public String kotaAsal;
    public String kotaTujuan;
    public Pelanggan() {}
    public void displayPesanan (){
        System.out.println("Selamat tiket anda telah berhasil dipesan!!!");
        System.out.println("Nama Pemesan     : " + this.name);
        System.out.println("Kota Asal        : " + this.kotaAsal);
        System.out.println("Kota Tujuan      : " + this.kotaTujuan);
        System.out.println("Mobil            : " + this.mobil.jenis + " " + this.mobil.warna);
        System.out.printf("Upah Supir       : Rp. %,.2f" , this.mobil.supir.gajiHarian);
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.printf("Total Pembayaran : Rp. %,.2f"  , (this.mobil.hargaSewa + this.mobil.supir.gajiHarian));
    }

    public void detailPelanggan (){
        System.out.println("Detail Pelanggan");
        System.out.println("Nama pelanggan  : " + this.name);
        System.out.println("No KTP          : " + this.noKTP);
        System.out.println("Alamat          : " + this.alamat);
    }

    public void perjalananPelanggan (){
        System.out.println(this.name + " melakukan perjalanan dari " + this.kotaAsal + " menuju " + this.kotaTujuan);
    }

    public void sampai (){
        System.out.println(this.name + " sampai di " + this.kotaTujuan + " dengan selamat");
    }

    public void bayar (){
        System.out.printf("\n" + this.name + " melakukan pembayaran sebesar Rp. %,.2f untuk pembelian tiket.\n",  (this.mobil.hargaSewa + this.mobil.supir.gajiHarian));
    }

    public String toString (){
        return this.name + " memiliki nomor KTP " + this.noKTP + " yang beralamat di " + this.alamat;
    }
}




public class MainTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Supir supir1 = new Supir("Supriyatno", "SIM B, SIM C, SIM A", "Jalan Borobudur", 150_000);
        Supir supir2 = new Supir("Supriyadi", "SIM C, SIM A", "Jalan Prambanan", 180_000);
        Supir supir3 = new Supir("Abdul", "SIM A", "Jalan Mendut", 200_000);
//        supir1.detailSupir();
//        supir1.cekBahanBakar(4);
//        supir1.mulaiMenyetir();
//        supir1.getGajiHarian();
//        supir1.getSIM();
//        System.out.println(supir1.toString());
        Mobil [] listMobil = new Mobil[3];
        Mobil mobil1 = new Mobil("DK 6969 UAN",2020, "Hitam", 250_000, "Avanza", supir1);
        listMobil[0] = mobil1;
        Mobil mobil2 = new Mobil("DK 5786 AB",2000, "Putih", 180_000, "Rush", supir2);
        listMobil[1] = mobil2;
        Mobil mobil3 = new Mobil("DK 1782 FK",2015, "Abu-Abu", 200_000, "Xenia", supir3);
        listMobil[2] = mobil3;
//        mobil1.belok("kiri");
//        mobil1.detailMobil();
//        mobil1.mulaiMesin();
//        mobil1.tabrak("Tiang");
//        mobil1.pengemudiMobil();
//        System.out.println(mobil1.toString());

        String [] kota = {"Bandung", "Denpasar", "Surabaya"};
        Pelanggan pelanggan = new Pelanggan();


        System.out.println("            Selamat Datang di Krana Travel          ");
        System.out.println("-----------------------------------------------------");
        System.out.println("[a] Pesan tiket");
        System.out.print("Masukkan pilihan anda : ");
        String pilihan = sc.nextLine();
        if (pilihan.equals("a")){
            System.out.println("Identitas Pelanggan");
            System.out.print("[1] Nama   :");
            String nama = sc.nextLine();
            System.out.print("[2] No KTP :");
            String noKTP = sc.nextLine();
            System.out.print("[3] Alamat :");
            String alamat = sc.nextLine();
            pelanggan.name = nama; pelanggan.noKTP = noKTP; pelanggan.alamat = alamat;
            System.out.println("Silahkan pilih rute yang anda pilih : ");
            for (int i = 0; i < kota.length; i++) {
                System.out.println("[" + (i + 1) + "] " + kota[i]);
            }
            System.out.print("Masukkan Kota Asal : ");
            String pilihanKota = sc.nextLine();
            if (pilihanKota.equals("1")){
                pelanggan.kotaAsal = kota[0];
            }else if (pilihanKota.equals("2")){
                pelanggan.kotaAsal = kota[1];
            }else if (pilihanKota.equals("3")){
                pelanggan.kotaAsal = kota[2];
            }

            System.out.print("Masukkan Kota Tujuan : ");
            pilihanKota = sc.nextLine();
            if (pilihanKota.equals("1")){
                pelanggan.kotaTujuan = kota[0];
            }else if (pilihanKota.equals("2")){
                pelanggan.kotaTujuan = kota[1];
            }else if (pilihanKota.equals("3")){
                pelanggan.kotaTujuan = kota[2];
            }

            for (int i = 0; i < listMobil.length; i++) {
                System.out.print("[" + (i + 1) + "] ") ;listMobil[i].listMobil();
                System.out.println();
            }

            System.out.print("Pilih jenis mobil yang anda inginkan : ");
            pilihanKota = sc.nextLine();
            if (pilihanKota.equals("1")){
                pelanggan.mobil = listMobil[0];
            }else if (pilihanKota.equals("2")){
                pelanggan.mobil = listMobil[1];
            }else if (pilihanKota.equals("3")){
                pelanggan.mobil = listMobil[2];
            }
            pelanggan.displayPesanan();
//            pelanggan.bayar();
//            pelanggan.detailPelanggan();
//            pelanggan.sampai();
//            pelanggan.perjalananPelanggan();
//            System.out.println(pelanggan.toString());
        }
    }
}
