package HackerRank;

import java.util.Scanner;

public class PembandingHuruf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char [] splWord = word.toCharArray();
        int [] num = new int[splWord.length];
        for (int i = 0; i < splWord.length; i++) {
            num[i] = (int) splWord[i];
        }

    }
}
