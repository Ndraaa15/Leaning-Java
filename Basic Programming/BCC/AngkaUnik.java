package BCC;

import java.util.Scanner;

public class AngkaUnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        while (a.length() != 1){
            char [] num = a.toCharArray();
            long ans = 0;
            for (int i = 0; i < num.length; i++) {
                ans+= Math.pow((Integer.parseInt(String.valueOf(num[i]))), 2);
            }
            a = String.valueOf(ans);
        }
        if (a.equals("1")){
            System.out.println("1");
        }else {
            System.out.println("-1");
        }
    }
}
