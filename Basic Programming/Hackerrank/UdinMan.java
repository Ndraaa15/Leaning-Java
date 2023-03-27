package HackerRank;

import java.util.Scanner;

public class UdinMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int l = sc.nextInt();
        int ll = l / 3;
        int k = sc.nextInt();

        for (int i = 0; i < p; i++) {
            if (i  < p - k){
                for (int j = 0; j < ll; j++) {
                    System.out.print("U");
                }
                for (int j = ll; j < 2*ll; j++) {
                    System.out.print(" ");
                }
                for (int j = 2*ll; j < l; j++) {
                    System.out.print("U");
                }
            }else if(i >= p - k){
                for (int j = 0; j < l; j++) {
                    System.out.print("U");
                }
            }
            System.out.println();
        }
    }
}
