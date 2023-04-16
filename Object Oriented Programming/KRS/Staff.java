package src.OOP_C.KRS;

import java.util.ArrayList;

public class Staff extends Manusia{
    private double salaryPerMonth;
    private JobStaff job;
    String NIP;
    static ArrayList<Staff> listStaff = new ArrayList<>();

    public Staff(String name, String address, String contact, String gender, int age, String NIP, double salaryPerMonth, JobStaff job, String email) {
        super(name, address, contact, gender, age, email);
        this.NIP = NIP;
        this.salaryPerMonth = salaryPerMonth;
        this.job = job;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public JobStaff getJob() {
        return job;
    }

    public void setJob(JobStaff job) {
        this.job = job;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }


    public void printStaff (){
        super.displayProfile();
        System.out.printf(" NIP     : %s\n", getNIP());
        System.out.printf(" Job     : %s\n", getJob());
    }


    static JobStaff kemahasiswaan = JobStaff.Kemahasiswaan;
    static JobStaff keuangan = JobStaff.Keuangan;
    static JobStaff akademik = JobStaff.Akademik;
    static JobStaff perpustakan = JobStaff.Perpustakaan;
    static JobStaff teknologiInformasi = JobStaff.TeknologiInformasi;

    static Staff staff1 = new Staff("Aldiansyah", "Jalan Soekarno", "081234567189", "Laki-Laki", 35, "123456789", 3000000, kemahasiswaan, "aldiansyan@gmail.com");
    static Staff staff2 = new Staff("Rahmawati", "Jalan Hatta", "08546765678", "Perempuan", 35, "156786256", 3000000, kemahasiswaan, "rahmawati@gmail.com");
    static Staff staff3 = new Staff("Firman", "Jalan Budi Utomo", "08976765678", "Laki-Laki", 35, "192657387", 6000000, keuangan, "firman@gmail.com");
    static Staff staff4 = new Staff("Nadia", "Jalan Merdeka", "08567890123", "Perempuan", 28, "193456789", 8000000, akademik, "nadia@gmail.com");
    static Staff staff5 = new Staff("Dewi", "Jalan Raya", "081234567890", "Perempuan", 42, "187654321", 10000000, perpustakan, "dewi@gmail.com");
    static Staff staff6 = new Staff("Rudi", "Jalan Surya", "087654321098", "Laki-Laki", 31, "194567890", 7500000, keuangan, "rudi@gmail.com");
    static Staff staff7 = new Staff("Sinta", "Jalan Kencana", "082345678901", "Perempuan", 25, "195678901", 6500000, teknologiInformasi, "sinta@gmail.com");
    static Staff staff8 = new Staff("Surya", "Jalan Bromo", "082398768901", "Laki-Laki", 28, "19589876", 8000000, teknologiInformasi, "surya@gmail.com");

}
