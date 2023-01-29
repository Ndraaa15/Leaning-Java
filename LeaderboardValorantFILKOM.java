package HackerRank;

import java.util.Scanner;

public class LeaderboardValorantFILKOM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Team 1
        int a = sc.nextInt();
        int b = sc.nextInt();

        int [] score1 = new int[a];
        int [] score2 = new int[b];

        int temp1, temp2;
        boolean sorted= false;


        for (int i = 0; i < a; i++) {
            score1[i] = sc.nextInt();
            if (score1[i] < score1[i + 1]){
                temp1 = score1[i + 1];
                score1 [i + 1] = score1[i];
                score1[i] = temp1;
            }
        }

        for (int i = 0; i < b; i++) {
            score2[i] = sc.nextInt();
            if (score2[i] < score2[i + 1]){
                temp2 = score2[i + 1];
                score2[i + 1] = score2[i];
                score2[i] = temp2;
            }
        }

    }
}
