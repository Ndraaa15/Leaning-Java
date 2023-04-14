package src.UTPPBO;

public class Perpustakaan {
    int indexBuku = -1;
    int indexPelanggan = -1;
    Buku [] listBuku = new Buku[100];
    Pegawai pegawaiPerpus;
    Pelanggan [] listPelanggan = new Pelanggan[20];
    public Perpustakaan() {}
    public Perpustakaan(Pegawai pegawaiPerpus) {
        this.pegawaiPerpus = pegawaiPerpus;
    }

    void pinjam (String namaPelanggan, String judulBuku){
        Buku buku = cariBuku(judulBuku);
        if (buku != null){
            for (int i = 0; i < listPelanggan.length; i++) {
                if (listPelanggan[i] != null){
                    if (listPelanggan[i].getNama().equals(namaPelanggan)){
                        if (listPelanggan[i].isFull()){
                            break;
                        }else {
                            int jumlahSaatIni = buku.getJumlah() - 1;
                            buku.setJumlah(jumlahSaatIni);
                            listPelanggan[i].tambahBuku(buku);
                            break;
                        }
                    }
                }
            }
            return;
        }else {
            return;
        }
    }

    Buku cariBuku (String judulBuku){
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] != null){
                if (listBuku[i].getJudul().equals(judulBuku)){
                    if (listBuku[i].getJumlah() > 0){
                        return listBuku[i];
                    }else {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    void tampilkanInfoPerpustakaan(){
        pegawaiPerpus.tampilkanInfoPegawai();
        System.out.println();

        for (int i = 0; i < listPelanggan.length; i++) {
            if (listPelanggan[i] != null){
                listPelanggan[i].tampilkanInfoPelanggan();
                System.out.println();
            }
        }
        System.out.println();

        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] != null){
                listBuku[i].tampilkanInfoBuku();
                System.out.println();
            }
        }
    }
}
