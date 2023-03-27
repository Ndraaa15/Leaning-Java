package HackerRank;

import java.util.Scanner;

public class DaffaBelajarMenembak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String [] lapTembak = new String[5];
        for (int i = 0; i < 5 ; i++) {
            lapTembak[i] = "x";
        }
        char lap = 0;
        for (int i = 0; i < a; i++) {
            int temp = 0;
            String s = in.next();
            char [] splitted = s.toCharArray();
            lap = splitted[0];
            if (splitted[1] == '2'){
                temp = 1;
            }else if (splitted[1] == '3'){
                temp = 2;
            }else if (splitted[1] == '4'){
                temp = 3;
            }else if (splitted[1] == '5'){
                temp = 4;
            }
            lapTembak[temp] = "o";
        }
        System.out.print("| ");
        for (int i = 0; i < 5; i++) {
            System.out.print(lapTembak[i] + " ");
        }
        System.out.print("|");
        System.out.println("\n-------------");
        System.out.println("- LAPANGAN " + lap + " -");
    }
}
