package HackerRank;

import java.util.*;


public class JavaStringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String s1 = (word1.substring(0,1).toUpperCase());
        String s2 = (word2.substring(0,1).toUpperCase());

        int length1 = word1.length();
        int length2 = word2.length();

        System.out.println(length1 + length2);

        if (word1.compareTo(word2) > word2.compareTo(word1)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        System.out.println(s1 + word1.substring(1) + " " + s2 + word2.substring(1));


    }
}
