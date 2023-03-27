package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class IhsanBesardanKecil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] num = new int[a];
        for (int i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        for (int i = 0; i < 2; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        for (int i = a - 1; i > a - 3; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
