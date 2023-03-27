package HackerRank;

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = 0;
        for (int i = 1; i < num ; i++) {
            if (num % i == 0){
                temp += i;
            }
        }

        if (temp == num){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
