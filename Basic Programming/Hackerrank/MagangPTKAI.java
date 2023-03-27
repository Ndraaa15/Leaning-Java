package HackerRank;

import java.util.Scanner;

public class MagangPTKAI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carr = sc.nextInt();
        System.out.println(carr);
        if (carr == 0){
            System.out.println("Kereta tidak bisa dibuat jika tidak ada lokomotif");
            return;
        }
        String comm = sc.next();
        System.out.println(comm);
        if (comm.equals("rotate")){
            System.out.print(" "+ 1 + " ");
            for (int i = carr; i > 1 ; i--) {
                System.out.print(i + " ");
            }
        }else if (comm.equals("detach")){
            int det = sc.nextInt();
            if (det == 1){
                System.out.println("Lokomotif tidak bisa dilepas");
                return;
            }
            if (det > carr){
                System.out.println("Gerbong kereta tidak ada");
                for (int i = 1; i <= carr; i++) {
                    System.out.print(i + " ");
                }
            }else {
                for (int i = 1; i < det; i++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
