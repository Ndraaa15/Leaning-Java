package src.UTPPBO;

public class Pelanggan{
    private String nama;
    private String nomorPelanggan;
    private Buku [] BukuPinjaman = new Buku[3];
    private int index = -1;
    private boolean isFull = false;

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public Pelanggan(String nama, String nomorPelanggan) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }

    void tambahBuku (Buku bukuPinjam){
        if (this.index == 2){
            isFull = true;
            return;
        }else {
            BukuPinjaman[++this.index] = bukuPinjam;
        }
    }

    void tampilkanInfoPelanggan (){
        if (index == -1){

        }else {
            System.out.println("Nama Pelanggan  : " + this.nama);
            System.out.println("Nomor Pelanggan : " + this.nomorPelanggan);
            System.out.println("Buku yang dipinjam : ");
            int counter = 0;
            for (int i = 0; i < BukuPinjaman.length; i++) {
                if (BukuPinjaman[i] != null){
                    System.out.println((1 + i) + ". " + BukuPinjaman[i].getJudul());
                }else {
                    counter++;
                }
                if (counter == 3){
                    System.out.println("Tidak ada");
                }
            }
        }
    }
}
