package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        char [] a1 = a.toLowerCase().toCharArray();
        char [] b1 = b.toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        String x = Arrays.toString(a1);
        String y = Arrays.toString(b1);

        if(x.equals(y)){
            System.out.println(a + " adalah anagram dari " + b);
        }else {
            System.out.println(a + " bukan anagram dari " + b);
        }
    }
}
