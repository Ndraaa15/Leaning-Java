package HackerRank;

import java.util.Scanner;

public class KtiptografiCaesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String c = sc.nextLine();
        int temp = Integer.parseInt(String.valueOf(c.charAt(1)));
        char [] spl = word.toCharArray();
        if (c.charAt(0) == '+'){
            for (int i = 0; i < spl.length; i++) {
                int ascii = (int) spl[i];
                int l = ascii + temp;
                System.out.print((char) l);
            }
        } else {
            for (int i = 0; i < spl.length; i++) {
                int ascii = (int) spl[i];
                int l = ascii - temp;
                System.out.print((char) l);
            }
        }


    }
}
