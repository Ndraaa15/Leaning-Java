package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class BilanganPrimorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        ArrayList <Integer> prime = new ArrayList<>(10);
        for (int i = 0; i <= 100; i++) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    temp++;
                }else {
                    continue;
                }
            }
            if (temp == 2){
                prime.add(i);
            }else {
                continue;
            }
        }

        long ans = 1;
        for (int i = 0; i < a ; i++) {
            ans *= prime.get(i);
        }

        System.out.println(ans);
    }
}
