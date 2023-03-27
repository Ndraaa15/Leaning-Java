package HackerRank;

import java.util.Scanner;

public class MultiSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (sc.hasNext()){
            ans+= sc.nextInt();
        }
        System.out.println(ans);
    }
}
