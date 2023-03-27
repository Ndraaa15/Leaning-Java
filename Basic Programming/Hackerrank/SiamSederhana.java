package HackerRank;

import java.util.ArrayList;

import java.util.Scanner;

public class SiamSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        name.add("Budi");
        name.add("Joko");
        name.add("Susi");

        boolean a = true;
        System.out.println("Siam Sederhana");
        while (a){
            int b = sc.nextInt();
            if (b == 1){
                String newName = sc.next();
                name.add(newName);
                System.out.println("1. Tambah Mahasiswa");
                System.out.println("2. Tampilkan Mahasiswa");
                System.out.println("3. Keluar");

            }else if (b == 2){
                System.out.println("1. Tambah Mahasiswa");
                System.out.println("2. Tampilkan Mahasiswa");
                System.out.println("3. Keluar");
                for (String z: name) {
                    System.out.println(z);
                }

            } else if (b == 3) {
                System.out.println("1. Tambah Mahasiswa");
                System.out.println("2. Tampilkan Mahasiswa");
                System.out.println("3. Keluar");
                a = false;
            }
        }
    }
}
