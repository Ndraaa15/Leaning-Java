package HackerRank;

import java.sql.SQLOutput;
import java.text.NumberFormat;

public class BitWise {
    public static void main(String[] args) {
//        int h = 3;
//        int a = ++h  * 2;
//        System.out.println(h);
//        int s = h >= 3? -1 * (h-- * h + 90) : h-- * --a;
//        System.out.println(h);
//        System.out.println(s);

//        int h = 3;
//        int b = h--;
//        System.out.println(b);
//        int b1 = --h;
//        System.out.println(b1);

//        double hasilHitung;
//        double z;
//        double hasil = 4;
//        double hasil1 = 5;
//        hasilHitung = hasil*3/5;
//        z = hasil1/2;
//        System.out.println(hasilHitung);
//        System.out.println(z);

//        int abc = 10;
//        if (abc > 12){
//            if (abc < 15)
//                System.out.println("BLUE");
//
//        }else
//            System.out.println("GREEN");
//
//        System.out.println("JEANS");

//        int A = 5;
//        switch (A/2){
//            case 1:
//                System.out.println("a");
//                break;
//            case 2:
//                System.out.println("b");
//                break;
//            case 3:
//                System.out.println("c");
//                break;
//            default:
//                System.out.println("d");
//        }
        int []num = {5};
        modify(num);
        System.out.println(num[0]);

//        for (int i = 0; i < 3;) {
//            System.out.println("Halo");
//            i++;a
//        }
//        boolean [][] data = new boolean[3][];
//        System.out.println(data.length);
//        double [][] num = {{1},{2}};
//        int x = 5;
//        int y = 5;
//        if(x == 10 && y++ == 5){
//
//        }
//        System.out.printf("%d, %d", x, y);;
    }
    static void modify (int [] num){
        num[0] += 10;
        System.out.println(num[0]);
    }
}
