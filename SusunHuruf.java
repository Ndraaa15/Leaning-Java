package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class SusunHuruf {

//            static boolean compare(String decider, char[] huruf) {
//                //Do Your Magic Here
//
//            }
//
//            public static void main(String[] args) {
//                Scanner in = new Scanner(System.in);
//                String decider = in.nextLine();
//                char huruf[] = new char[10];
//                for (int i = 0; i < 10; i++) {
//                    huruf[i] = in.next().charAt(0);
//                }
//                if (compare(decider, huruf)) System.out.println("Bisa");
//                else System.out.println("Tidak Bisa");
//            }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String decider = sc.nextLine();
        int length = decider.length();


        String [] hurufDecider = decider.split("");


        ArrayList <String> huruf = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            String s = sc.next();
            huruf.add(s);
        }

        int temp = 0;
        for (int i = 0; i < length ; i++) {
            if (huruf.contains(hurufDecider[i])){
                temp++;
            }else {
                continue;
            }
        }


        if (temp == length){
            System.out.println("Bisa");
        }else {
            System.out.println("Tidak Bisa");
        }
    }
}


