package HackerRank;

import java.util.Scanner;

public class RubahDanAyam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char [] z= a.toCharArray();
        String [] word = a.trim().split("[ ]");
        int b = 0;
        int c = 0;
        int d =0;
        while (a.contains("R")) {
            int e = a.indexOf("R");
            if (e < a.indexOf("[") || e >  a.indexOf("]")){
                a.replace("A", ".");
            }
        }
        System.out.println(a);



        }
    }

