package src.OOP_C.KRS;

import java.util.Scanner;

public class MyKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        boolean check = true;

        System.out.println("---------------| My KRS |---------------");
        System.out.println(" Selamat datang di sistem pendaataan KRS ");

        System.out.println("        <<<Identitas Mahasiswa>>>       ");
        System.out.print(" Nama          : ");
        String name = sc.nextLine();
        System.out.print(" Umur          : ");
        int age = sc.nextInt();
        Mahasiswa mahasiswa = new Mahasiswa(name, age);
        System.out.print(" Alamat        : ");
        sc.nextLine();
        String address = sc.nextLine();
        mahasiswa.setAddress(address);
        System.out.print(" NIM           : ");
        String NIM = sc.nextLine();
        mahasiswa.setNIM(NIM);
        System.out.print(" Jenis Kelamin : ");
        String gender = sc.nextLine();
        mahasiswa.setGender(gender);
        System.out.print(" Nomor Telepon : ");
        String contact = sc.nextLine();
        mahasiswa.setContact(contact);
        System.out.print(" Masukkan jumlah mata kuliah : ");
        int size = sc.nextInt();
        KRS myKRS = new KRS(size);
        System.out.println(" Jumlah mata kuliah yang dipilih: " + size + " mata kuliah \n");

        while (check){
            System.out.println("               <<<Menu>>>             ");
            System.out.println("[1] Tampilkan Profile");
            System.out.println("[2] Tambah KRS");
            System.out.println("[3] Tampilkan KRS");
            System.out.println("[4] Selesai");
            System.out.print("Masukkan pilihan anda : ");
            int choose = sc.nextInt();
            sc.nextLine();
            if (choose == 1){
                mahasiswa.displayProfile();
            } else if (choose == 2) {
                isTrue = true;
                System.out.println("             <<<Mata Kuliah>>>               \n");
                System.out.println("[1]  Sistem Operasi");
                System.out.println("[2]  Algoritma dan Struktur Data");
                System.out.println("[3]  Kewarganegaraan");
                System.out.println("[4]  Kewirausahaan");
                System.out.println("[5]  Pemrograman Berorientasi Objek");
                System.out.println("[6]  Aljabar Linear");
                System.out.println("[7]  Statistik dan Teori Peluang");
                System.out.println("[8]  Metode Numerik");
                System.out.println("[9]  Desain dan Analisis Algoritma");
                System.out.println("[10] Perograman Website");
                while (isTrue) {
                    try{
                        System.out.println("Masukkan pilihan mata kuliah anda : ");
                        int MK = sc.nextInt();
                        if (MK == 1){
                            myKRS.tambahMataKuliah(MataKuliah.MK1);
                        }else if (MK == 2){
                            myKRS.tambahMataKuliah(MataKuliah.MK2);
                        }else if (MK == 3){
                            myKRS.tambahMataKuliah(MataKuliah.MK3);
                        }else if (MK == 4){
                            myKRS.tambahMataKuliah(MataKuliah.MK4);
                        }else if (MK == 5){
                            myKRS.tambahMataKuliah(MataKuliah.MK5);
                        }else if (MK == 6){
                            myKRS.tambahMataKuliah(MataKuliah.MK6);
                        }else if (MK == 7){
                            myKRS.tambahMataKuliah(MataKuliah.MK7);
                        }else if (MK == 8){
                            myKRS.tambahMataKuliah(MataKuliah.MK8);
                        }else if (MK == 9){
                            myKRS.tambahMataKuliah(MataKuliah.MK9);
                        }else if (MK == 10){
                            myKRS.tambahMataKuliah(MataKuliah.MK10);
                        }
                        System.out.println("Apakah anda ingin memasukkan lagi ? [y/n] : ");
                        sc.nextLine();
                        String confirm = sc.nextLine();
                        switch (confirm) {
                            case "Y" -> {
                                continue;
                            }
                            case "n" -> isTrue = false;
                        }
                    }catch (Exception e){
                        isTrue = false;
                        System.out.println("Maaf, KRS sudah penuh. Terimakasih telah mengisi di myKRS \n");
                    }
                }
            } else if (choose == 3){
                mahasiswa.krs = myKRS;
                mahasiswa.krs.displayKRS();
            } else if (choose == 4) {
                System.out.println("Terimakasih sudah mengisi di sistem pendataan ini!");
                check = false;
            }
        }
    }
}
