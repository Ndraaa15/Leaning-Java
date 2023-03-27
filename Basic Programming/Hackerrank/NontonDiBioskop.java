package HackerRank;


import java.util.Scanner;

public class NontonDiBioskop {
    public static void main(String[] args) {
//input
//5
//C4 A3 B2 D4 E5
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String [][] bioskop = new String[5][5];
        String [] seat = new String[a];


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 ; j++) {
                bioskop [i][j] = "o ";
            }
        }

        for (int i = 0; i < a; i++) {
            seat [i] = sc.next();
            String [] splittedSeat = seat[i].split("");
            int row = 0;
            int col = Integer.parseInt(splittedSeat[1]);
            if (seat[i].charAt(0) == 'A'){
                row = 1;
            }else if (seat[i].charAt(0) == 'B'){
                row = 2;
            }else if (seat[i].charAt(0) == 'C'){
                row = 3;
            }else if (seat[i].charAt(0) == 'D'){
                row = 4;
            }else if (seat[i].charAt(0) == 'E'){
                row = 5;
            }

            bioskop [row - 1][col - 1] = "x ";
        }
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < 5; i++) {
            if (i == 0){
                System.out.print("A ");
            }else if (i == 1) {
                System.out.print("B ");
            }else if (i == 2) {
                System.out.print("C ");
            }else if (i == 3) {
                System.out.print("D ");
            }else {
                System.out.print("E ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print(bioskop[i][j]);
            }
            System.out.println();
        }
        System.out.println("  L-A-Y-A-R ");

    }
}
