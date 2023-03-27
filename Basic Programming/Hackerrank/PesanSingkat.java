package HackerRank;

import java.util.Scanner;

public class PesanSingkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentences = sc.nextLine();

        char [] huruf = sentences.toCharArray();

        if (huruf.length > 50){
            String sentences2  = sentences.replaceAll("yang", "yg");
            String sentences3 = sentences2.replaceAll("enggak bisa", "gbs");
            String sentences4 = sentences3.replaceAll("enggak", "g");
            String sentences5 = sentences4.replaceAll("bisa", "bs");
            System.out.println(sentences5);
        }else {
            System.out.println(sentences);
        }
    }
}
