package HackerRank;

import java.util.Scanner;

public class SeleksiTimPKM {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String [] team = new String[a];
        int [][] nilai = new int[a][3];
        String[] hasil = new String[301];


        for (int i = 0; i < a; i++) {
            int temp  = 0;
            team[i] = sc.next();
            for (int j = 0; j < 3; j++) {
                nilai[i][j] = sc.nextInt();
                temp += nilai[i][j];
            }
            hasil[temp] = team[i];
        }
        int z = 0;
        for (int i = 300; i >= 0 ; i--) {
            if (hasil[i] != null){
                System.out.println(hasil[i]);
                z++;
            }
            if (z == b){
                break;
            }
        }
    }
}
