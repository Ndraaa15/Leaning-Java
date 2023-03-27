package BCC;

import java.util.Scanner;

public class Hanip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt(); //Jumlah Teman
        long [] jari = new long[a];
        long sum = 0;
        for (int i = 0; i < a; i++) {
            jari[i] = sc.nextLong();
            sum += jari[i];
        }

        while (sum > 0){
            sum -= (a + 1);
        }
        int ans = 0;
        if (a + 1 > 5){
            if ((sum + 1) % (a + 1) != 0){
                ans++;
            }
            if ((sum + 2) % (a + 1) != 0){
                ans++;
            }
            if ((sum + 3) % (a + 1) != 0){
                ans++;
            }
            if ((sum + 4) % (a + 1) != 0){
                ans++;
            }
            if ((sum + 5) % (a + 1) != 0){
                ans++;
            }
        }else {
            if (sum % 2 == 0){
                System.out.println(2);
            }else {
                System.out.println(3);
            }
        }
        System.out.println(ans);
    }
}
