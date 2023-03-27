package BCC;

import java.util.Scanner;

public class HartaKarun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String [][] ba = new String[a][b];
        sc.nextLine();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                ba[i][j] = sc.next();
            }
        }

        sc.nextLine();
        String pil = sc.nextLine().toLowerCase();
        String [] z = pil.split(" ");


        int x = 0;
        int y = 0;

        for (int i = 0; i < z.length; i++) {
            if (z[i].equals("kiri")){
                x--;
                if (x < 0){
                    x = 0;
                }
            }else if (z[i].equals("kanan")){
                x++;
                if (x > b - 1){
                    x = b - 1;
                }
            }else if (z[i].equals("atas")){
                y--;
                if (y < 0){
                    y = 0;
                }

            }else if (z[i].equals("bawah")){
                y++;
                if (y > a - 1){
                    y = a - 1;
                }
            }

        }

        if (ba[y][x].equals("X")){
            ba[y][x] = "*";
            System.out.println("Rudi Menemukan Harta Karun!");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(ba[i][j]);
                }
                System.out.println();
            }
        }else {
            ba[y][x] = "*";
            System.out.println("Harta Karun Belum Ditemukan\"");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(ba[i][j]);
                }
                System.out.println();
            }
        }
    }
}
