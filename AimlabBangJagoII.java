package HackerRank;

import java.util.*;


public class AimlabBangJagoII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int [] score = new int [a];

        for (int i = 0; i < a; i++) {
            score[i] = sc.nextInt();
        }


        int temp;

        for (int i = 0; i < a; i++) {
            if (score[i] < score[i + 1]){
                temp = score[i];
                score[i] = score[i + 1];
                score [i + 1] = temp;
            }
        }


        for (int i = 0; i < a; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(score[i]);
            }
            if (i == a - 1){
                System.out.print("");
            }else{
                System.out.print(" > ");
            }

        }


    }
}
