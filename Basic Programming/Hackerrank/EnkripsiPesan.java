package HackerRank;


import java.util.Arrays;
import java.util.Scanner;

public class EnkripsiPesan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a  = sc.nextLine();
        if (a.length() == 1){
            int z = a.charAt(0);
            System.out.print (z);
            return;
        }
        String [] word = a.split(" ");
        for (int i = 0; i < word.length; i++) {
            char [] huruf = word[i].toCharArray();
            int x = huruf[0];
            char temp = huruf[1];
            huruf[1] = huruf[huruf.length - 1];
            huruf[huruf.length - 1] = temp;
            System.out.print(x);
            for (int j = 1; j < huruf.length; j++) {
                System.out.print(huruf[j]);
            }
            System.out.print(" ");
        }
    }
}
