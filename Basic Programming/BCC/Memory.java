package BCC;

import java.util.Scanner;

public class Memory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] num = new int[b];
        int sum = 0;
        for (int i = 0; i < b; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
        }
        System.out.println("Memori dialokasikan : " + sum + " MB") ;
        System.out.println("Memori terbuang : " + " 0 MB ");
        if (sum < 2*1024){
            System.out.println("Rekomendasi ram : 2 GB");
        } else if (sum < 4*1024) {
            System.out.println("Rekomendasi ram : 4 GB");
        } else if (sum < 8*1024) {
            System.out.println("Rekomendasi ram : 8 GB");
        } else if (sum < 16*1024) {
            System.out.println("Rekomendasi ram : 16 GB");
        }


    }
}
