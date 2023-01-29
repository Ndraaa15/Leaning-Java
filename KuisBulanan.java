package HackerRank;

import java.util.Scanner;

public class KuisBulanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int ans = a/30;

        System.out.println(ans + " kali kuis");
    }
}
