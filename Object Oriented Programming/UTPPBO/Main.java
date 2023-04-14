package src.UTPPBO;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawaiPerpus = new Pegawai("Gede Indra Adi Brata", "225150200111006");
        Perpustakaan perpus = new Perpustakaan(pegawaiPerpus);

        pegawaiPerpus.setPerpustakaan(perpus);


        pegawaiPerpus.menambahPelanggan("Hayasaka", "99001110009");
        pegawaiPerpus.menambahPelanggan("Miyuk", "99001100008");
        pegawaiPerpus.menambahPelanggan("Kei", "990011110077");

        pegawaiPerpus.menambahBuku("Heavens", "Tiancan",  3);
        pegawaiPerpus.menambahBuku("Kaguya-sama", "Akasaka",  3);
        pegawaiPerpus.menambahBuku("Solo Leveling", "Chugong",  1);

        perpus.pinjam("Hayasaka", "Overlord");
        perpus.pinjam("Miyuki", "Solo Leveling");
        perpus.pinjam("Kei", "Solo Leveling");
        perpus.pinjam("Hayasaka", "Kaguya-sama");

        pegawaiPerpus.menambahBuku("Overlord", "Maruyama",  3);
        pegawaiPerpus.menambahBuku("Kaguya-sama", "Akasaka",  3);
        pegawaiPerpus.menambahBuku("Solo Leveling", "Chugong",  1);

        perpus.pinjam("Kei", "Heavens");
        perpus.pinjam("Miyuki", "Solo Leveling");

        pegawaiPerpus.menambahPelanggan("Shinomiya", "2");

        perpus.pinjam("Shinomiya", "Solo Leveling");
        perpus.pinjam("Shirogame", "Kaguya-sama");


        perpus.tampilkanInfoPerpustakaan();
    }
}
