package BCC;

import java.util.Scanner;

public class DominoKiw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean [][] x = new boolean[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                x[i][j] = true;
            }
            
        }
        int counter = 0;
        if (a >= 2 && b >= 2){
            for (int i = 0; i < a-1; i++) {
                for (int j = 0; j < b-1; j++) {
                    if (x[i][j] && x[i][j + 1] && x[i + 1][j]  && x[i + 1][j + 1] ){
                        counter++;
                        x[i][j] = false;
                        x[i][j + 1] = false;
                        x[i + 1][j] = false;
                        x[i + 1][j + 1] = false;
                    }
                }
            }
        }
        if (a >= 2 && b >= 1){
            for (int i = 0; i < a-1; i++) {
                for (int j = 0; j < b; j++) {
                    if (x[i][j] && x[i + 1][j]){
                        counter++;
                        x[i][j] = false;
                        x[i + 1][j] = false;
                    }
                }
            }
        }
        if (a >= 1 && b >= 2){
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b-1; j++) {
                    if (x[i][j] && x[i][j + 1]){
                        counter++;
                        x[i][j] = false;
                        x[i][j + 1] = false;
                    }
                }
            }
        }
        if (a >= 1 && b >= 1){
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (x[i][j]){
                        counter++;
                        x[i][j] = false;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
