package src.OOP_C.GradeStudent;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("                SMA NEGERI 1 SHIRATORIZAWA              ");
        System.out.println("Sistem Pendataan Nilai Siswa MIPA Tahun Ajaran 2045/2046");
        System.out.print("Masukkan Jumlah Siswa : ");
        int totalStudent = sc.nextInt();
        sc.nextLine();
        Student [] students = new Student[totalStudent];
        for (int i = 0; i < totalStudent; i++) {
            System.out.println("-----|Silahkan masukkan data siswa ke-" + (i + 1) + "|-----");
            System.out.println("              Identitas Siswa                   ");
            System.out.print("Nama Siswa           : ");
            String name = sc.nextLine();
            System.out.print("Alamat Siswa         : ");
            String address = sc.nextLine();
            System.out.print("Umur Siswa           : ");
            int age = sc.nextInt();
            System.out.println("                Nilai Siswa                          ");
            System.out.print("Nilai Matematika     : ");
            double mathGrade = sc.nextDouble();
            System.out.print("Nilai B. Inggris     : ");
            double englishGrade = sc.nextDouble();
            System.out.print("Nilai Science        : ");
            double scienceGrade = sc.nextDouble();
            sc.nextLine();
            students[i] = new Student(mathGrade, englishGrade, scienceGrade);
            students[i].setName(name);
            students[i].setAddress(address);
            students[i].setAge(age);
            students[i].displayMessage();
            System.out.println("----|Selamat, data siswa berhasil diinput|----" + "\n");
        }




        Student anya = new Student(50, 60,70);

        Student indra = new Student(98,96);
        indra.setScience(100);

        Student deku = new Student(98);
        deku.setEnglish(90);
        deku.setScience(80);
        anya.jumlahObjek();



//        Student anna = new Student();
//        anna.setName("Anna");
//        anna.setAddress("Malang");
//        anna.setAge(20);
//        anna.setMath(100);
//        anna.setScience(89);
//        anna.setEnglish(80);
//        anna.displayMessage();

        //menggunakan constructor lain
//        System.out.println("===================");
//        Student chris = new Student("Chris", "Kediri", 21);
//        chris.setMath(70);
//        chris.setScience(60);
//        chris.setEnglish(90);
//        chris.displayMessage();


//        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
//        System.out.println("===================");
//        anna = new Student("anna", "Batu", 18);
//        anna.displayMessage();
//
//        //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
//        System.out.println("===================");
//        chris.setAddress("Surabaya");
//        chris.setAge(22);
//        chris.displayMessage();
    }
}
