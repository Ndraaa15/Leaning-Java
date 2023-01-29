package HackerRank;

import java.util.Scanner;

public class TonyStark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long lenght = sc.nextLong();
        long dotX = sc.nextLong();
        long dotY = sc.nextLong();

        if (dotY > dotX){
            if (dotX + lenght <= dotY){
                System.out.println(dotY - (dotX + lenght));
            } else {
                System.out.println(0);
            }
        } else if (dotX == dotY) {
            System.out.println(0);
        } else if (dotX > dotY) {
            if (dotY + lenght <= dotX){
                System.out.println(dotX - (dotY + lenght));
            }
        }
    }
}
