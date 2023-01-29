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

        boolean amar = false;
        boolean aneb = false;

        for (int i = 0; i < 3; i++) {
            int tempO = 0;
            int tempX = 0;
            for (int j = 0; j < 3; j++) {
                if (xo[i][j].equals("O")){
                    tempO++;
                } else if (xo[i][j].equals("X")) {
                    tempX++;
                }
            }
            if (tempO == 3){
                aneb = true;
            } else if (tempX == 3) {
                amar = true;
            }
        }

        if (amar == true && aneb == true){
            System.out.println();
        }
    }
}
