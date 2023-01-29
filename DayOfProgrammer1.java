package HackerRank;

import java.util.Scanner;

public class DayOfProgrammer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year>= 1700 && year<=1917){
            int hasil;
            if (year%4 ==0){
                hasil = 256 - 244;
            }else {
                hasil = 256 - 243;
            }
            System.out.println(hasil + ".09."+ year);
        }else if (year>=1919) {
            int hasil;
            if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0){
                hasil = 256 - 244;
            }else {
                hasil = 256 - 243;
            }
            System.out.println(hasil + ".09."+ year);
        }
    }
}
