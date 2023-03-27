package HackerRank;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] xo = new String [3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                xo[i][j] = sc.next();
            }
        }

        int amar = 0;
        int aneb = 0;

        for (int i = 0; i < 3; i++) {
            String cur = "";
            for (int j = 0; j < 3; j++) {
                cur += xo[i][j];
            }

            if (cur.equals("OOO")){
                aneb++;
            }else if (cur.equals("XXX")){
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
            }else if (cur.equals("XXX")){
                amar++;
            }
        }

        if (xo[0][0].equals("O") && xo[1][1].equals("O") && xo[2][2].equals("O")){
            aneb++;
        }else if (xo[0][0].equals("X") && xo[1][1].equals("X") && xo[2][2].equals("X")){
            amar++;
        }

        if (xo[0][2].equals("O") && xo[1][1].equals("O") && xo[2][0].equals("O")){
            aneb++;
        }else if (xo[0][2].equals("X") && xo[1][1].equals("X") && xo[2][0].equals("X")){
            amar++;
        }

        if ( amar > aneb){
            System.out.println("Amar Menang");
        } else if (aneb > amar) {
            System.out.println("Aneb Menang");
        } else {
            System.out.println("Seri");
        }
    }
}
