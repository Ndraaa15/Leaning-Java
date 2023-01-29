package HackerRank;

import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {

            String b = sc.next();

            if (b.equals("Lingkaran")){
                int c = sc.nextInt();
                double luas = 3.14 * c * c;
                System.out.println(luas);

            } else if (b.equals("Persegi")) {
                int d = sc.nextInt();
                double luas = d * d;
                System.out.println(luas);

            } else if (b.equals("Segitiga")) {
                int e = sc.nextInt();
                int f = sc.nextInt();

                double luas = e * f / 2;
                System.out.println(luas);

            } else if (b.equals("Trapesium")) {
                int g = sc.nextInt();
                int h = sc.nextInt();
                int j = sc.nextInt();

                double luas = (g + h) * j / 2;
                System.out.println(luas);
            }

        }
    }
}
