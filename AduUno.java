package HackerRank;

import java.util.Scanner;

public class AduUno {

    static int uno (int x, String [] kartu){
        int sumRev = 0;
        int temp = 0;
        for (int i = 0; i < kartu.length; i++) {
            if (sumRev % 2 == 0){
                temp++;
                if (temp > x){
                    temp = 1;
                }
                if(kartu[i].equals("reverse")){
                    sumRev++;
                }

            }else if (sumRev % 2 == 1){
                temp--;
                if (temp == 0){
                    temp = x;
                }
                if(kartu[i].equals("reverse")){
                    sumRev++;
                }
            }
            System.out.println(temp);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SumCard = sc.nextInt();
        int player = sc.nextInt();
        String [] card = new String[SumCard];
        for (int i = 0; i < SumCard; i++) {
            card[i] = sc.next();
        }
        int ah = (uno(player, card));
        System.out.println(ah);
    }
}
