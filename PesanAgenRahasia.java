package HackerRank;


import java.util.ArrayList;
import java.util.Scanner;

public class PesanAgenRahasia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char [] aa= a.toCharArray();
        String [] ss = a.split("");
        int [] argh = new int[a.length()];
        argh[0] = 0;
        int temp = 0;
        for (int i = 0; i < aa.length; i++) {
            for (int j = i + 1; j < aa.length; j++) {
                if (aa[i] == aa[j]){
                    argh[j] = temp;
                }
            }
            temp++;
        }
        for (Integer fakk:
             argh) {
            System.out.println(fakk);
        }
    }
}
