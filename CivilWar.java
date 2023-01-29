package HackerRank;

import java.util.Scanner;

public class CivilWar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("Draw");
        } else if (a != 1 && b != 1 && a > b) {
            System.out.println("Captain America");
        } else if (a == 1 && b != 1) {
            System.out.println("Captain America");
        } else if (a != 1 && b == 1) {
            System.out.println("Iron Man");
        } else {
            System.out.println("Iron Man");
        }
    }
}
