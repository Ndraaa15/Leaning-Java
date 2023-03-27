package BCC;

import java.util.Scanner;

public class CariIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] num = new int[a];
        for (int i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }

        String sen = " terulang pada indeks :";
        String index = "";
        for (int i = 0; i < a; i++) {
            int temp = 0;

            for (int j = i + 1; j < a; j++) {
                if (num[j] == -1){
                    continue;
                } else if (num[i] == num[j]){
                    temp++;
                    index += " " + j +" ,";
                    num[j] = -1;
                }
            }
            if (temp > 0){
                System.out.println(num[i] + sen + index);
            }
            index = "";
        }
    }
}
