package HackerRank;

import java.util.Scanner;

public class CariBilanganPrima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    temp++;
                }
            }
            if (temp == 2){
                System.out.print(i + " ");
            }
        }
    }
}
