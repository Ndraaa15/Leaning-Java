package HackerRank;

import java.util.Scanner;

public class PhoenixNugget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String [] num = a.split("");

        int ans = 0;
        for (String s : num) {
            if (s.equals("0") || s.equals("9") || s.equals("6") || s.equals("4")) {
                ans += 1;
            } else if (s.equals("8")) {
                ans += 2;
            }
        }

        System.out.println(ans);
    }
}
