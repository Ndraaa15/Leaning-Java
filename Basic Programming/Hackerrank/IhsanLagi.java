package HackerRank;

import java.util.Scanner;

public class IhsanLagi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char [] splitted = a.toCharArray();
        char temp1;
        char temp2;

        temp1 =  splitted[0];
        temp2 = splitted[2];
        splitted[0] = splitted[1];
        splitted [2] = splitted[splitted.length-1];
        splitted[1] = temp1;
        splitted[splitted.length - 1]= temp2;

        for (int i = 0; i < splitted.length; i++) {
            System.out.print(splitted[i]);
        }
    }
}
