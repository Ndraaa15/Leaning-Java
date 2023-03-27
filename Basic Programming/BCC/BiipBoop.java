package BCC;

import java.util.ArrayList;
import java.util.Scanner;

public class BiipBoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        int b = sc.nextInt();
//        ArrayList <Integer> wlek = new ArrayList<>();
//        int [] x = new int[b];
//        int [] y = new int[b];
//
//        for (int i = 0; i < b; i++) {
//            x[i] = sc.nextInt();
//            y[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < b; i++) {
//            int temp = 0;
//            for (int j = x[i]; j < y[i] ; j++) {
//                wlek.add(j);
//            }
//            for (int j = 0; j < wlek.size(); j++) {
//                if (a.charAt(wlek.get(j) - 1) == a.charAt(wlek.get(j))){
//                    temp++;
//                }
//            }
//            System.out.println(temp);
//            wlek.clear();
//        }


        //
        String a = sc.nextLine();
        int b = sc.nextInt();
        int [] x = new int[b];
        int [] y = new int[b];
        int [] dp = new int[a.length()];

        for (int i = 0; i < b; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i=1;i<a.length(); i++){
            if(a.charAt(i)==a.charAt(i-1))dp[i]=dp[i-1]+1;
            else dp[i]=dp[i-1];
        }

        for (int i = 0; i < b; i++) {
            System.out.println(dp[y[i]-1]-dp[x[i]-1]);
        }
    }
}
