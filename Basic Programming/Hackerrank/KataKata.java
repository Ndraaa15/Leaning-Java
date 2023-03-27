package HackerRank;

import java.util.Scanner;

public class KataKata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String [] words = new String [a];
        for (int i = 0; i < a; i++) {
            words[i] = sc.next();
        }

        for (int i = 0; i < words.length ; i++) {
            int temp = 0;
            char [] chars  = words[i].toCharArray();
            for (char aChar : chars) {
                if ((int) aChar >= 97 && (int) aChar <= 122) {
                    continue;
                } else {
                    temp++;
                }
            }
            if(temp == 0){
                System.out.println("BAIK");
            }else{
                System.out.println("RUSAK");
            }
        }
    }
}
