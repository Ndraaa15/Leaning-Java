package src.OOP_C.KRS;

public class Manusia {
    private String name;
    private String address;
    private String contact;
    private String gender;
    private int age;
    private String email;

    public Manusia(String name, String address, String contact, String gender, int age, String email) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayProfile (){
        System.out.printf(" Nama    : %s\n", getName());
        System.out.printf(" Email   : %s\n", getEmail());
        System.out.printf(" Umur    : %d\n", getAge());
        System.out.printf(" Alamat  : %s\n", getAddress());
        System.out.printf(" Gender  : %s\n", getGender());
        System.out.printf(" Contact : %s\n", getContact());
    }

    public static void checkSalary (Manusia manusia){
        if (manusia instanceof Dosen){
            System.out.printf("Gaji yang anda terima untuk bulan ini adalah Rp. %,.2f\n", ((Dosen) manusia).getSalaryPerMonth());
            System.out.println("Silahkan tingkatkan kinerja anda!");
            System.out.println();
        }else if (manusia instanceof  Mahasiswa){
            System.out.println("Maaf anda adalah mahasiswa seharusnya anda membayar UKT bukan meminta gaji");
            System.out.println();
        } else if (manusia instanceof  Staff) {
            System.out.printf("Gaji yang anda terima untuk bulan ini adalah Rp. %,.2f\n", ((Staff) manusia).getSalaryPerMonth());
            System.out.println("Silahkan tingkatkan kinerja anda!");
            System.out.println();
        }
    }
}
