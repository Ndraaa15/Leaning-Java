package src.OOP_C.KRS;

public class Dosen  extends Manusia {
    private double salaryPerMonth;
    private String NIP;
    private MataKuliah mataKuliah;
    private StatusDosen statusDosen;
    public Dosen(String name, String address, String contact, String gender, int age, double salaryPerMonth, String NIP, MataKuliah mataKuliah, StatusDosen statusDosen, String email) {
        super(name, address, contact, gender, age, email);
        this.salaryPerMonth = salaryPerMonth;
        this.NIP = NIP;
        this.mataKuliah = mataKuliah;
        this.statusDosen = statusDosen;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public StatusDosen getStatusDosen() {
        return statusDosen;
    }

    public void setStatusDosen(StatusDosen statusDosen) {
        this.statusDosen = statusDosen;
    }

    public void printDosen (){
        super.displayProfile();
        System.out.printf(" NIP     : %s\n", getNIP());
        System.out.printf(" Status  : %s\n", getStatusDosen());
    }
    static StatusDosen tenuredLecturer = StatusDosen.TenuredLecturer;
    static StatusDosen assistantProfessor = StatusDosen.AssistantProfessor;
    static StatusDosen adjunctLecturer = StatusDosen.AdjunctLecturer;

    static Dosen dosen1 = new Dosen("Elon Musk", "Jalan Piranha", "089765678543", "Laki-Laki", 40, 5000000,"5676545676", MataKuliah.MK1, tenuredLecturer, "elon@gmail.com");
    static Dosen dosen2 = new Dosen("Marissa Mayer", "Jalan Seruni", "082345678901", "Perempuan", 45, 7500000, "0987654321", MataKuliah.MK2, assistantProfessor, "marissa@gmail.com");
    static Dosen dosen3 = new Dosen("Tim Cook", "Jalan Mahkota", "087654321098", "Laki-Laki", 55, 8500000, "1234567890", MataKuliah.MK3, adjunctLecturer, "tim@gmail.com");
    static Dosen dosen4 = new Dosen("Ginni Rometty", "Jalan Surya", "085678923456", "Perempuan", 60, 9000000, "9876543210", MataKuliah.MK4, tenuredLecturer, "ginni@gmail.com");
    static Dosen dosen5 = new Dosen("Satya Nadella", "Jalan Raya", "081234567890", "Laki-Laki", 50, 8000000, "4567890123", MataKuliah.MK5, assistantProfessor, "satya@gmail.com");
    static Dosen dosen6 = new Dosen("Susan Wojcicki", "Jalan Kencana", "089876543210", "Perempuan", 48, 7000000, "5678901234", MataKuliah.MK6, adjunctLecturer, "susan@gmail.com");
    static Dosen dosen7 = new Dosen("Jack Ma", "Jalan Merdeka", "081234567890", "Laki-Laki", 60, 9500000, "0987654321", MataKuliah.MK7, tenuredLecturer, "jack@gmail.com");
    static Dosen dosen8 = new Dosen("Sergey Brin", "Jalan Surya", "087654321098", "Laki-Laki", 45, 8500000, "1234509876", MataKuliah.MK8, assistantProfessor, "sergey@gmail.com");
    static Dosen dosen9 = new Dosen("Indra Nooyi", "Jalan Piranha", "085678923456", "Perempuan", 55, 9000000, "7890654321", MataKuliah.MK9, assistantProfessor, "indra@gmail.com");
    static Dosen dosen10 = new Dosen("Sheryl Sandberg", "Jalan Melati", "082345678901", "Perempuan", 51, 8000000, "0123456789", MataKuliah.MK4, tenuredLecturer, "sheryl@gmail.com");
}
