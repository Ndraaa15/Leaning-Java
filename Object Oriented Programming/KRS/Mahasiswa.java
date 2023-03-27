package src.OOP_C.KRS;

public class Mahasiswa{
    private String name;
    private int age;
    private String address;
    private String NIM;
    private String gender;
    private String contact;
    public KRS krs;

    public Mahasiswa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String religion) {
        this.contact = religion;
    }


    public void displayProfile (){
        System.out.println("----------<<<Identitas Diri>>>----------");
        System.out.printf(" Nama    : %s\n", getName());
        System.out.printf(" Umur    : %d\n", getAge());
        System.out.printf(" Alamat  : %s\n", getAddress());
        System.out.printf(" NIM     : %s\n", getNIM());
        System.out.printf(" Gender  : %s\n", getGender());
        System.out.printf(" Contact : %s\n", getContact());
        System.out.println("----------------------------------------");
    }
}
