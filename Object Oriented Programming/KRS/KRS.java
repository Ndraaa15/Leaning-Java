package src.OOP_C.KRS;

public class KRS {
    private MataKuliah [] daftarMataKuliah;
    private int index = -1;
    private int size;
    KRS (int size){
        this.size = size;
         daftarMataKuliah = new MataKuliah[size];
    }

    public void tambahMataKuliah (MataKuliah mataKuliah){
        daftarMataKuliah[++index] = mataKuliah;
    }

    public void displayKRS(){
        if (index == -1){
            System.out.println("KRS masih kosong, silahkan isi KRS anda!");
        } else if (index < size){
            System.out.println("---------------<<< KRS >>>---------------");
            for (int i = 0; i <= index; i++) {
                System.out.print(i + 1 + ". "); this.daftarMataKuliah[i].printMK();
                System.out.println("Identitas Dosen : ");
                this.daftarMataKuliah[i].getDosen().printDosen();
                System.out.println();
            }
            System.out.println("---------------<<<<<>>>>>----------------");
        } else {
            System.out.println("---------------<<< KRS >>>---------------");
            for (int i = 0; i < size; i++) {
                System.out.print(i + 1 + ". "); this.daftarMataKuliah[i].printMK();
                System.out.println("Identitas Dosen : ");
                this.daftarMataKuliah[i].getDosen().printDosen();
                System.out.println();
            }
            System.out.println("---------------<<<<<>>>>>----------------");
        }
    }
}
