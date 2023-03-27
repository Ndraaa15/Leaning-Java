package HackerRank;

import java.util.Scanner;

public class PakDengklek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] num = new int[a];

        for (int i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < a; i++) {
            temp += num[i];
        }
        double ans = (double) temp / a;
        String aa = String.valueOf(ans);
        int z = aa.indexOf(".");
        String as = aa.substring(z + 1);
        if (as.equals("0")){
            System.out.print(aa.substring(0, z));
        }else if (as.length() > 3){
            System.out.printf("%.3f", ans);
        }else {
            System.out.print(ans);
        }
    }
}

