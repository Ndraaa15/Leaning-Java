package BCC;

import java.util.Scanner;

public class RudiNyingkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String [] w = new String[a];
        for (int i = 0; i < a; i++) {
            w[i] = sc.next();
        }
        for (int i = 0; i < a; i++) {
            String temp = "";
            if (w[i].length() < 5){
                System.out.println(w[i]);
            }else {
                System.out.println(w[i].charAt(0) + "" + (w[i].length()  - 2) + "" + w[i].charAt(w[i].length() - 1));
            }
        }
    }
}
