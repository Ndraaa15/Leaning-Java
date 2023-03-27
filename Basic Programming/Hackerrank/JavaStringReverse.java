package HackerRank;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String [] wchar = word.split("");

        if (word.length() == 1){
            System.out.println("Yes");
            return;
        }

        String ans = "";
        for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
            if(wchar[i].equals(wchar[j])){
                ans = "Yes";
            }else {
                ans = "No";
                break;
            }
        }

        System.out.println(ans);
    }
}
