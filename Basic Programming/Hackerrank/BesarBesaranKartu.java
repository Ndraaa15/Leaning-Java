package HackerRank;

import java.util.Scanner;

public class BesarBesaranKartu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[16];
        String [] card = new String[16];
        for (int i = 0; i < 16; i++) {
            String a = sc.nextLine();
            String [] splt1 = a.split(" ");
            num[i] = Integer.parseInt(splt1[0]);
            card[i] = (splt1[1]);
        }
        int batas = 4;
        for (int i = 0; i < 16; i++) {
            for (int j = i + 1; j < batas; j++) {
                if (card[i].equals(card[j])){
                    num[i] += num[j];
                    num[j] = 0;
                }
            }
            if (i == 3 || i == 7 || i == 11){
                batas += 4;
            }
        }
        int a  = 0;
        int b = 0;
        int c = 0;
        int player = 1;
        for (int i = 0; i < 16; i++) {
            if (num[i] > a){
                c = b;
                b = a;
                a = num[i];
            } else if (num[i] > b) {
                c = b;
                b = num[i];
            } else if (num[i] > c) {
                c = num[i];
            }
            if (i == 3 || i == 7 || i == 11 || i == 15 ){
                System.out.println("Player " + player + " : " + (a - b - c));
                a = 0;
                b = 0;
                c = 0;
                player++;
            }
        }

    }
}
