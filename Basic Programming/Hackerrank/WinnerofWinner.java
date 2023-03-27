package HackerRank;

import java.util.Scanner;

public class WinnerofWinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String [] name = new String[a];
        for (int i = 0; i < a; i++) {
            name [i] = sc.next();
        }

        int jumlah = 0;
        String max = "";
        for (int i = 0; i < name.length; i++) {
            int temp=0;
            for (int j = 0; j < name.length; j++) {
                if (name[i].equals(name[j])){
                    temp++;
                }
            }
            if (temp > jumlah){
                jumlah = temp;
                max = name[i];
            }
        }

        System.out.println(max);
    }
}
