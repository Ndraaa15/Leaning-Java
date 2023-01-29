package HackerRank;

import java.util.Scanner;

public class BanyakKarakter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String [] aa = a.split("");
        String b = sc.nextLine();
        int temp = 0;
        for (int i = 0; i < a.length(); i++) {
            if (b.equals(aa[i])){
                temp++;
            }
        }
        System.out.println(temp);
    }
}
