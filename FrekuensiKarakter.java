package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class FrekuensiKarakter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char [] x = a.toCharArray();
        Arrays.sort(x);
        for (int i = 0; i < x.length; i++) {
            int temp = 0;
            for (int j = 0; j < x.length; j++) {
                if (x[i] == x[j]){
                    temp++;
                }
            }
            i += temp - 1;
            System.out.println(x[i] + ": " + temp);
        }
    }
}
