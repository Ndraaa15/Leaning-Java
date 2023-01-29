package HackerRank;

import java.util.Scanner;

public class PosisiYanto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String arah = sc.next();


        String [] c = arah.split("");


        for (int i = 0; i < arah.length(); i++) {
            if (c[i].equals("U")){
                b += 1;
            }else if (c[i].equals("T")){
                a += 1;
            } else if (c[i].equals("S")) {
                b -= 1;
            } else {
                a -= 1;
            }
        }

        System.out.print(a + " ");
        System.out.print(b);
    }
}
