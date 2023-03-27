package HackerRank;

import java.util.Scanner;

public class KasirFILKOM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        x, yaitu kode barang dengan detail nilai sebagai berikut:
//        1 untuk Sticker Set seharga Rp. 15.000
//        2 untuk Notebook seharga Rp. 25.000
//        3 untuk Buku seharga Rp. 30.000
        int money = sc.nextInt();
        int code = sc.nextInt();

        int price = 0;
        switch (code){
            case 1:
                price += 15000;
                break;
            case 2:
                price += 25000;
                break;
            case 3:
                price += 30000;
                break;
        }

        int ans = money - price;

        int a = ans / 10000;
        int aS = ans % 10000;
        int b = aS / 1000;
        int bS = aS % 1000;
        int c = bS / 500;
        int cS = bS % 500;
        int d = cS / 100;

        if (ans < 0){
            System.out.println("Uang anda belum cukup");
        } else if (ans == 0) {
            System.out.println("Tidak mendapatkan kembalian");
        } else {
            System.out.println("Anda mendapatkan kembalian sebesar");
            System.out.println( a + " uang 10.000");
            System.out.println( b + " uang 1.000");
            System.out.println( c + " uang 500");
            System.out.println( d + " uang 100");
        }
    }
}
