package HackerRank;

import java.util.Scanner;

public class AnebdanAmar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String word3 = sc.nextLine();

        String [] a1 = word1.split("");
        String [] a2 = word2.split("");
        String [] a3 = word3.split("");

        String [][] xo = new String[3][3];

        System.arraycopy(a1, 0, xo[0], 0, 3);
        System.arraycopy(a2, 0, xo[1], 0, 3);
        System.arraycopy(a3, 0, xo[2], 0, 3);

        int aneb = 0;
        int amar = 0;


        for (int i = 0; i < 3; i++) {
            String cur = "";
            for (int j = 0; j < 3; j++) {
                cur += xo[i][j];
            }
            if (cur.equals("OOO")){
                aneb++;
            } else if (cur.equals("XXX")) {
                amar++;
            }
        }
        for (int i = 0; i < 3; i++) {
            String cur = "";
            for (int j = 0; j < 3; j++) {
                cur += xo[j][i];
            }
            if (cur.equals("OOO")){
                aneb++;
            } else if (cur.equals("XXX")) {
                amar++;
            }
        }

        if (xo[0][0].equals("O") && xo[1][1].equals("O") && xo[2][2].equals("O")){
            aneb++;
        } else if (xo[0][0].equals("X") && xo[1][1].equals("X") && xo[2][2].equals("X")) {
            amar++;
        }

        if (xo[0][2].equals("O") && xo[1][1].equals("O") && xo[2][0].equals("O")){
            aneb++;
        } else if (xo[0][2].equals("X") && xo[1][1].equals("X") && xo[2][0].equals("X")) {
            amar++;
        }

        if (amar == aneb){
            if(word1.contains("*") || word2.contains("*") || word3.contains("*")){
                System.out.println("Permainan Belum Selesai");
            }else {
                System.out.println("Seri");
            }
        } else if (aneb > amar) {
            System.out.println("Aneb Menang");
        } else if (amar > aneb) {
            System.out.println("Amar Menang");
        }


    }
}
