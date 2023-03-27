package HackerRank;

import java.util.Scanner;

public class JavaVarargs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] number = new int[5];

        for (int i = 0; i < 6; i++) {
            number[i]= sc.nextInt();
        }

        System.out.println(number[0] + "+" + number[1] + "=" + (number[0] + number[1]));
        System.out.println(number[0] + "+" + number[1] + "+" + number[2] + "=" + (number[0] + number[1] + number[2]));
        System.out.println(number[0] + "+" + number[1] + "+" + number[2] + "+" + number[3] + "=" + + (number[0] + number[1] +number[2] + number[3]));
        System.out.println(number[0] + "+" + number[1] + "+" + number[2] + "+" + number[3] + "+" +number[4] + "=" +
                          (number[0] + number[1] +number[2] + number[3] + number[4]));
        System.out.println(number[0] + "+" + number[1] + "+" + number[2] + "+" + number[3] + "+" +number[4] + number[5] + "=" +
                          (number[0] + number[1] +number[2] + number[3] + number[4] + number[5]));
    }
}
