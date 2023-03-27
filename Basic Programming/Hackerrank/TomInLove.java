package HackerRank;

import java.util.Scanner;

public class TomInLove {

    static String ans (char[]a){
        StringBuilder ans = new StringBuilder();
        for (int i = a.length - 1; i >=0 ; i--) {
            if (i % 2 == 0){
                ans.append(a[i]);
            }
        }
        return ans.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        char []  z = sentence.toCharArray();
        String ans = ans(z);
        System.out.println(ans);
    }
}
