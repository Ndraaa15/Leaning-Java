package HackerRank;

import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] bob = new int [3];
        int [] alice = new int [3];

        int b = 0;
        int a = 0;
        for (int i = 0; i < 3; i++) {
            bob[i] = sc.nextInt();
        }

        for (int i = 0; i < 3 ; i++) {
            alice[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (bob[i] > alice[i]){
                b++;
            }else if (bob[i] < alice[i]){
                a++;
            }else{
                b += 0;
                b += 0;
            }
        }

        System.out.print(a + " " + b);
    }
}
