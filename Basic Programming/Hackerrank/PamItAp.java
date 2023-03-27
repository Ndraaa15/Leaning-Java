package HackerRank;

import java.util.Scanner;

public class PamItAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String langkah = sc.next();
        char [] num = langkah.toCharArray();

        int kiri = 0;
        boolean x = false;
        int kanan = 0;
        boolean y = false;

        for (int i = 0; i < a-1; i++) {
            if (i == 0){
                if (num[0] == 1 || num[0] == 5 || num[0] == 7){
                    kiri = Integer.parseInt(Character.toString(num[0]));
                    x = true;
                }else {
                    kanan = Integer.parseInt(Character.toString(num[0]));;
                    y = true;
                }
            }
            if (x){
                if (num[i] != num[i + 1]){
                    kanan = Integer.parseInt(Character.toString(num[i + 1]));;
                    y = true;
                }else {
                    kiri = Integer.parseInt(Character.toString(num[i + 1]));;
                    y = false;
                }
            } else if (y){
                if (num[i] != num[i + 1]){
                    kiri = Integer.parseInt(Character.toString(num[i + 1]));
                    x = true;
                }else {
                    kanan =Integer.parseInt(Character.toString(num[i + 1]));
                    x = false;
                }
             }
        }
        System.out.println(kiri + " " + kanan);
    }
}
