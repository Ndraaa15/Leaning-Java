package HackerRank;

import java.util.Scanner;

public class TerbesarTerkecil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int [] num = new int[a];

        for (int i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print(big(num) + " ");
        System.out.print(small(num));

    }

    public static Integer small (int num[]){

        int temp = 0;
        for (int i = 0; i < num.length - 1 ; i++) {
            for (int j = 0; j < num.length - i -  1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num [j + 1] = temp;
                }
            }
        }

        return num[0];
    }

    public static Integer big (int num[]){

        int temp = 0;
        for (int i = 0; i < num.length - 1 ; i++) {
            for (int j = 0; j < num.length - i -  1; j++) {
                if (num[j] < num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num [j + 1] = temp;
                }
            }
        }

        return num[0];
    }


}
