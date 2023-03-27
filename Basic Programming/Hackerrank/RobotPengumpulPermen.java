package HackerRank;

import java.util.*;

public class RobotPengumpulPermen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] permen = new int[n][n];
        int[][] memo = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                permen[i][j]= input.nextInt();
            }
        }
        memo[n-1][0] = permen[n-1][0];


        for(int i=n-2; i>=0; i--){
            memo[i][0] = permen[i][0]+memo[i+1][0];

        }
        System.out.println("memo[0][0] : " + memo[0][0]);
        for(int j=1; j<=n-1; j++){
            memo[n-1][j] = permen[n-1][j]+memo[n-1][j-1];
        }
        System.out.println("memo[n - 1][n - 1] : " + memo[n - 1][n - 1]);

        for(int i=n-2; i>=0; i--){
            for(int j=1; j<n; j++){
                System.out.println("1 : " + (permen[i][j]+memo[i+1][j]));
                System.out.println("2 : " + (permen[i][j]+memo[i][j-1]));
                memo[i][j] = Math.max(permen[i][j]+memo[i+1][j], permen[i][j]+memo[i][j-1]);
                System.out.println("i : " + i + " j : " + j + " memo : " + memo[i][j]);
            }
        }
        System.out.println(memo[0][n-1]);

    }
}