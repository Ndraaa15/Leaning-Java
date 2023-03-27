package src.OOP_C.KategoriBuku;


//Dalam penyelesaian masalah ini bisa dilakukan dengan berbagai cara, contohnya :
//-) Menggunakan class untuk setiap kategorinya
//-) Menggunakan list untuk menyimpan kategori dan judul bukunya

import java.util.ArrayList;
import java.util.List;

class Perpustakaan {
    private String kategori;
    private List<BukuPerpustakaan> buku;
    public Perpustakaan(String kategori, List<BukuPerpustakaan> buku) {
        this.kategori = kategori;
        this.buku = buku;
    }

    public String getKategori() {
        return kategori;
    }

    public List<BukuPerpustakaan> getBuku() {
        return buku;
    }

    public void tambahBuku (BukuPerpustakaan bukuBaru){
        buku.add(bukuBaru);
    }
}

class  BukuPerpustakaan {
    private String judul;
    private String [] penulis;
    public BukuPerpustakaan(String judul, String[] penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public String[] getPenulis() {
        return penulis;
    }

}

public class MainPerpustakaan {
    public static void main(String[] args) {
        String [] penulis = {"Indra", "Adi"};
        BukuPerpustakaan buku1 = new BukuPerpustakaan("Pemrograman Java", penulis);
        Perpustakaan teknologi = new Perpustakaan("Teknologi", new ArrayList<>());
        teknologi.tambahBuku(buku1);
        for (BukuPerpustakaan buku: teknologi.getBuku()) {
            System.out.println(buku.getJudul());
        }
    }
}
