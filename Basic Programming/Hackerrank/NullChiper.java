package HackerRank;

import java.util.Scanner;

public class NullChiper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String [] word = sentence.split(" ");
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < word.length-1; i++) {
            if (word[i].length() < length){
                length = word[i].length();
            }
        }


        StringBuilder ans = new StringBuilder();
        for (String s : word) {
            String[] alphabet = s.split("");
            ans.append(alphabet[length - 1]);
        }

        System.out.println(ans.toString().toUpperCase());
    }
}
