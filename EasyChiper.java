package HackerRank;

import java.util.Scanner;

public class EasyChiper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String chars = sc.nextLine();

        char [] list = chars.toCharArray();
        int [] ascii = new int[number];
        int [] ans = new int[number];

        for (int i = 0; i < number; i++) {
            ascii[i] = (int) list[i];
        }

        for (int i = 0; i < number; i++) {
            ans[i] = ascii[i] + number;
        }

        for (int i = 0; i < number; i++) {
            char anss = (char) ans[i];
            System.out.println(anss);
        }
    }
}
