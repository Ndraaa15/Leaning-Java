package HackerRank;

import java.util.Scanner;

public class methodFibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long [] ans;
        ans = fib(a);
        for (int i = 0; i < a; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static long [] fib (int x){
        long bil1 = 0;
        long bil2 = 1;
        long [] fibNum = new long[x];
        fibNum[0] = 0;
        fibNum[1] = 1;
        for (int i = 2; i < x; i++) {
            long bil3 = bil1 + bil2;
            fibNum[i] = bil3;
            bil1 = bil2;
            bil2 = bil3;
        }
        return fibNum;
    }
}
