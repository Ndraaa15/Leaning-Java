package HackerRank;

import java.util.Scanner;

public class BerapaLaman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int page = sc.nextInt();
        int a = sc.nextInt();
        int range = sc.nextInt();
        if (a == 1){
            int x = a + range;
            for (int i = 1; i <= x; i++) {
                System.out.print(i + " ");
            }
            if (x < page){
                System.out.print("Next");
            }
        }else if (a == page){
            int x = page - range;
            if (x < page){
                System.out.print("Prev ");
            }
            for (int i = x; i <= page; i++) {
                System.out.print(i + " ");
            }
        }else {
            int x = range/2;
            int y = range - x;
            int x1 = a+x;
            int azy = 0;
            if (x1 > page){
                azy = x1 - page;
                x1 -= azy;
            }
            int y1 = a-y-azy;
            if (y1 < 1){
                y1 = 1;
                x1 += y - 1;
            }
            System.out.print("Prev ");
            for (int i = y1; i < a; i++) {
                System.out.print(i + " ");
            }
            for (int i = a; i <= x1 ; i++) {
                System.out.print(i + " ");
            }

            System.out.print("Next");

        }
    }
}
