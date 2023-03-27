package HackerRank;

import java.util.Scanner;

public class PermenBuPanji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMurid = sc.nextInt();
        int [] nilaiMurid = new int[jumlahMurid];
        int [] permen = new int[jumlahMurid];
        permen[0] = 1;

        int temp = 1;
        int k = 1;
        int ans = 0;
        for (int i = 0; i < jumlahMurid; i++) {
            nilaiMurid[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMurid.length - 1; i++) {
            if (nilaiMurid[i] < nilaiMurid[i + 1]){
                permen[k] = ++temp;
                k++;
            }else if (nilaiMurid[i] > nilaiMurid[i + 1]){
                temp = 1;
                permen[k] = temp;
                k++;
            } else {
                if (temp == 1){
                    permen[k] = temp;
                }else {
                    temp = 1;
                    permen[k] = 1;
                }
                k++;
            }
        }
        for (int a: permen) {
            System.out.println(a);
            ans+=a;
        }
        System.out.println(ans);
    }
}
