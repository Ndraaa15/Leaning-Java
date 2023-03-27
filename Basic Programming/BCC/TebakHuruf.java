package BCC;

import java.util.Scanner;

public class TebakHuruf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        String c = sc.nextLine().toLowerCase();

        if (b.equals("belakang")){
            if (String.valueOf(a.charAt(a.length() - 1)).equals(c)){
                System.out.println("Tebakan anda benar.");
            }else {
                System.out.println("Tebakan anda meleset.");
            }
        } else if (b.equals("depan")) {
            if (String.valueOf(a.charAt(0)).equals(c)){
                System.out.println("Tebakan anda benar.");
            }else {
                System.out.println("Tebakan anda meleset.");
            }
        } else if (b.equals("tengah")) {
            if (a.length() % 2 == 1){
                if (String.valueOf(a.charAt(a.length()/2)).equals(c)){
                    System.out.println("Tebakan anda benar.");
                }else {
                    System.out.println("Tebakan anda meleset.");
                }
            }
        }
    }
}
