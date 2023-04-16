package src.OOP_C.KRS;

import java.util.Scanner;

public class MyKRS {
    public static void main(String[] args) {
        Staff.listStaff.add(Staff.staff1);Staff.listStaff.add(Staff.staff2);Staff.listStaff.add(Staff.staff3);Staff.listStaff.add(Staff.staff4);
        Staff.listStaff.add(Staff.staff5);Staff.listStaff.add(Staff.staff6);Staff.listStaff.add(Staff.staff7);Staff.listStaff.add(Staff.staff8);

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
        System.out.print(" Alamat        : ");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.print(" Email         : ");
        String email = sc.nextLine();
        System.out.print(" NIM           : ");
        String NIM = sc.nextLine();
        System.out.print(" Jenis Kelamin : ");
        String gender = sc.nextLine();
        System.out.print(" Nomor Telepon : ");
        String contact = sc.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(name, address,  contact, gender, age, email, NIM);
        System.out.print(" Masukkan jumlah mata kuliah : ");
        int size = sc.nextInt();
        KRS myKRS = new KRS(size);
        System.out.println(" Jumlah mata kuliah yang dipilih: " + size + " mata kuliah \n");

        while (check) {
            System.out.println("               <<<Menu>>>             ");
            System.out.println("[1] Tampilkan Profile");
            System.out.println("[2] Tambah KRS");
            System.out.println("[3] Tampilkan KRS");
            System.out.println("[4] Cari Staff");
            System.out.println("[5] Selesai");
            System.out.print("Masukkan pilihan anda : ");
            int choose = sc.nextInt();
            sc.nextLine();
            if (choose == 1) {
                System.out.println("                Identitas Diri                  ");
                System.out.printf(" Nama    : %s\n", mahasiswa.getName());
                System.out.printf(" Email   : %s\n", mahasiswa.getEmail());
                System.out.printf(" Umur    : %d\n", mahasiswa.getAge());
                System.out.printf(" Alamat  : %s\n", mahasiswa.getAddress());
                System.out.printf(" Gender  : %s\n", mahasiswa.getGender());
                System.out.printf(" Contact : %s\n", mahasiswa.getContact());
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
                    try {
                        System.out.println("Masukkan pilihan mata kuliah anda : ");
                        int MK = sc.nextInt();
                        if (MK == 1) {
                            myKRS.tambahMataKuliah(MataKuliah.MK1);
                        } else if (MK == 2) {
                            myKRS.tambahMataKuliah(MataKuliah.MK2);
                        } else if (MK == 3) {
                            myKRS.tambahMataKuliah(MataKuliah.MK3);
                        } else if (MK == 4) {
                            myKRS.tambahMataKuliah(MataKuliah.MK4);
                        } else if (MK == 5) {
                            myKRS.tambahMataKuliah(MataKuliah.MK5);
                        } else if (MK == 6) {
                            myKRS.tambahMataKuliah(MataKuliah.MK6);
                        } else if (MK == 7) {
                            myKRS.tambahMataKuliah(MataKuliah.MK7);
                        } else if (MK == 8) {
                            myKRS.tambahMataKuliah(MataKuliah.MK8);
                        } else if (MK == 9) {
                            myKRS.tambahMataKuliah(MataKuliah.MK9);
                        } else if (MK == 10) {
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
                    } catch (Exception e) {
                        isTrue = false;
                        System.out.println("Maaf, KRS sudah penuh. Terimakasih telah mengisi di myKRS \n");
                    }
                }
            } else if (choose == 3) {
                mahasiswa.setKrs(myKRS);
                mahasiswa.getKrs().displayKRS();
            } else if (choose == 4) {
                System.out.println("[1]  Kemahasiswan");
                System.out.println("[2]  Akademik");
                System.out.println("[3]  Keuangan");
                System.out.println("[4]  Perpustakan");
                System.out.println("[5]  Teknologi Informasi");
                System.out.println("Masukkan pilihan Anda : ");
                int x = sc.nextInt();
                JobStaff job = null;
                if (x == 1){
                    job = JobStaff.Kemahasiswaan;
                } else if (x == 2) {
                    job = JobStaff.Akademik;
                }else if (x == 3) {
                    job = JobStaff.Keuangan;
                }else if (x == 4) {
                    job = JobStaff.Perpustakaan;
                }else if (x == 5) {
                    job = JobStaff.TeknologiInformasi;
                }

                int counter = 0;
                for (int i = 0; i < Staff.listStaff.size(); i++) {
                    if (Staff.listStaff.get(i).getJob() == job){
                        System.out.println("Staff " + (counter + 1));
                        Staff.listStaff.get(i).printStaff();
                        System.out.println();
                        counter++;
                    }
                }

            }else if (choose == 5) {
                System.out.println("Terimakasih sudah mengisi di sistem pendataan ini!");
                check = false;
            }
        }

        System.out.println("\nMethod Polymorphic Argument : ");
        Mahasiswa indra = new Mahasiswa("Indra", "Jalan Borobudur",  "089765456765", "Laki-Laki", 19, "indra@gmail.com", "225150200111006");
        Manusia.checkSalary(indra);

        JobStaff kemahasiswaan = JobStaff.Kemahasiswaan;
        Staff staff1 = new Staff("Aldiansyah", "Jalan Soekarno", "081234567189", "Laki-Laki", 35, "123456789", 3000000, kemahasiswaan, "aldiansyan@gmail.com");
        Manusia.checkSalary(staff1);

        System.out.println("Method Polymorphic Argument");
        StatusDosen tenuredLecturer = StatusDosen.TenuredLecturer;
        Dosen dosen1 = new Dosen("Elon Musk", "Jalan Piranha", "089765678543", "Laki-Laki", 40, 5000000,"5676545676", MataKuliah.MK1, tenuredLecturer, "elon@gmail.com");
        Manusia.checkSalary(dosen1);
    }
}
