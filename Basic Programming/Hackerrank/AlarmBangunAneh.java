package HackerRank;

import java.util.Scanner;

public class AlarmBangunAneh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kel1 = sc.nextInt();
        int kel2 = sc.nextInt();
        int batas = sc.nextInt();

        for (int i = 1; i <= batas; i++) {
            if (i%kel1 == 0 && i%kel2 == 0){
                System.out.print("Dorr ");
            } else if (i%kel1 == 0) {
                System.out.print("Dhuar ");
            }else if (i%kel2 == 0) {
                System.out.print("Dum Dum ");
            }else {
                System.out.println(i + " ");
            }
        }

    }
}
