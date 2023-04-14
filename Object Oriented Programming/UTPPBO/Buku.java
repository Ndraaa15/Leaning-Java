package src.UTPPBO;

public class Buku {
    private String judul;
    private String penulis;
    private int jumlah;

    public Buku(String judul, String penulis, int jumlah) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    void tampilkanInfoBuku (){
        System.out.println("Judul Buku   : " + this.judul);
        System.out.println("Penulis Buku : " + this.penulis);
        System.out.println("Jumlah Buku  : " + this.jumlah);
    }
}
