package HackerRank;

import java.util.Scanner;

public class MendeteksiFibbonaci {
//    Another method (Quick one) to check if a number Fibonacci number or not, is as below:
//    N is a Fibonacci number if and only if ( 5*N^2 + 4 ) or ( 5*N^2 – 4 ) is a perfect square!
    public static int fib (int num){
        int bil1 = 0;
        int bil2 = 1;
        int ans = 2;
        boolean x = false;
        if (num == bil1){
            ans = 1;
        } else if (num == bil2) {
            ans += 0;
        }

        int c = bil1 + bil2;
        while (c <=  num){
            ans++;
            if (c == num){
                x = true;
                break;
            }
            bil1 = bil2;
            bil2 = c;
            c = bil1 + bil2;
        }

        if(x){
            return ans;
        }else {
            ans = -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fib(a));
    }
}
