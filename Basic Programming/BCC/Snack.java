package BCC;

import java.util.Scanner;

public class Snack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long [] num = new long[a];
        for (int i = 0; i < a; i++) {
            num[i] = sc.nextLong();
        }
        long [] ans = new long[a];
        for (int i = 0; i < a; i++) {
            if (num[i] % 2 == 1){
                ans[i] = num[i] /2;
            }else {
                ans[i] = (num[i] /2) - 1;
            }
        }
        for (long z : ans){
            System.out.println(z);
        }
    }
}
