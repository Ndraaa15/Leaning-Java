package src.UTPPBO;

public class Pegawai extends Perpustakaan{
    private String nama;
    private String nomorPegawai;
    Perpustakaan perpustakaan;

    public Perpustakaan getPerpustakaan() {
        return perpustakaan;
    }

    public void setPerpustakaan(Perpustakaan perpustakaan) {
        this.perpustakaan = perpustakaan;
    }

    public Pegawai(String nama, String nomorPegawai) {
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    void tampilkanInfoPegawai (){
        System.out.println("Nama Pegawai  : " + this.nama);
        System.out.println("Nomor Pegawai : " + this.nomorPegawai);
    }

    void menambahPelanggan(String nama, String nomorPelanggan){
        if (super.indexPelanggan == 99){
            System.out.println("Maaf list pelanggan sudah penuh");
            return;
        }else {
            perpustakaan.listPelanggan[++super.indexPelanggan] = new Pelanggan(nama, nomorPelanggan);
        }
    }

    void menambahBuku(String judul, String penulis, int jumlah){
        if (super.indexBuku == 19){
            System.out.println("Maaf list buku sudah penuh");
        }else {
            for (int i = 0; i < perpustakaan.listBuku.length; i++) {
                //Pengecekan apakah judul bukunya sama makanya jumlahnya ditambah meskipun beda penulis (sesuai output)
                if (perpustakaan.listBuku[i] != null){
                    if (perpustakaan.listBuku[i].getJudul().equals(judul)){
                        int jumlahSaatIni = perpustakaan.listBuku[i].getJumlah();
                        perpustakaan.listBuku[i].setJumlah(jumlahSaatIni + jumlah);
                        return;
                    }
                }
            }
            perpustakaan.listBuku[++super.indexBuku] = new Buku(judul, penulis, jumlah);
        }
    }
}
