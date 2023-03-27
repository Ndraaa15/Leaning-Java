package HackerRank;

import java.util.Scanner;

public class LeaderboardValorantFILKOM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();

        int [] score1 = new int[a];
        int [] score2 = new int[b];
        int [] scoreTotal = new int[a + b];

        //Mengambil Input
        for (int i = 0; i < a; i++) {
            score1[i] = sc.nextInt();
            scoreTotal[i] = score1[i];
        }
        int z = a;
        for (int i = 0; i < b; i++) {
            score2[i] = sc.nextInt();
            scoreTotal[z] = score2[i];
            z++;
        }

        //BubbleSort
        int temp = 0;
        for (int i = 0; i < scoreTotal.length - 1; i++) {
            for (int j = 0; j < scoreTotal.length - i - 1; j++) {
                if (scoreTotal[j] < scoreTotal[j + 1]){
                    temp = scoreTotal[j];
                    scoreTotal[j] = scoreTotal[j + 1];
                    scoreTotal[j + 1] = temp;
                }
            }
        }

        System.out.println("Team || Score");
        System.out.println("=============");
        for (int i = 0; i < scoreTotal.length; i++) {
            int team1 = 0;
            int team2 = 0;
            for (int j = 0; j < score1.length; j++) {
                if (scoreTotal[i] == score1[j]){
                    team1++;
                }
            }
            for (int j = 0; j < score2.length; j++) {
                if (scoreTotal[i] == score2[j]){
                    team2++;
                }
            }
            if (team1 == 1){
                System.out.println("1    || " + scoreTotal[i]);
            }else if (team2 == 1) {
                System.out.println("2    || " + scoreTotal[i]);
            }
        }




    }
}
