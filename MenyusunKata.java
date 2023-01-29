package HackerRank;

import java.util.Scanner;

public class MenyusunKata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String huruf = sc.nextLine().replaceAll(" ", "");

        String [] splWord = word.split("");


        int ans = 0;
        int i = 0;

        while (i < word.length()){
            if (huruf.contains(splWord[i])){
                ans++;
                int index = huruf.indexOf(splWord[i]);
                huruf = String.format("%s%s", huruf.substring(0, index), huruf.substring(index + 1));
            }
            i++;

            System.out.println(huruf);
            System.out.println("ans" + ans);
            System.out.println("i" + i);
        }
        if (ans == word.length()){
            System.out.println("Bisa");
        }else {
            System.out.println("Tidak");
        }

    }
}
