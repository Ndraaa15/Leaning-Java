package src.OOP_C.KRS;

public class Mahasiswa extends Manusia{
    private String NIM;
    private KRS krs;

    public Mahasiswa(String name, String address, String contact, String gender, int age, String email, String NIM) {
        super(name, address, contact, gender, age, email);
        this.NIM = NIM;

    }

    public KRS getKrs() {
        return krs;
    }

    public void setKrs(KRS krs) {
        this.krs = krs;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }


    public void displayProfile (){
        super.displayProfile();
        System.out.printf(" NIM     : %s\n", getNIM());
    }

}
