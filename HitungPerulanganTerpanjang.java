package HackerRank;

import java.util.Scanner;

public class HitungPerulanganTerpanjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char [] huruf = a.toCharArray();
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            int temp = 0;
            for (int j = i; j < a.length(); j++) {
                if (huruf[i] == huruf[j]){
                    temp++;
                }else {
                    break;
                }
            }
            i += temp - 1;
            if (temp > sum){
                sum = temp;
            }
        }
        System.out.println(sum);
    }
}
