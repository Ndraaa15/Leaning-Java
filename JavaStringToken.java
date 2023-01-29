package HackerRank;

import java.util.Scanner;

public class JavaStringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        if(sentence.trim().isEmpty()){
            System.out.println("0");
            return;
        }


        String [] word = sentence.trim().split("[ !,?._'@]+");

        System.out.println(word.length);


            for (int i = 0; i < word.length; i++) {
                System.out.println(word[i]);

        }
    }
}
