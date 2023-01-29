package HackerRank;

import java.util.Scanner;

public class OcehanAdminIG {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String sentence = sc.nextLine();
            String[] words = sentence.split(" ");

            for (String word : words) {
                char[] s = word.toCharArray();
                for (int j = s.length - 1; j >= 0; j--) {
                    System.out.print(s[j]);
                }
                System.out.print("os" + " ");
            }
        }
    }



