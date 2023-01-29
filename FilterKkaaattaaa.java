package HackerRank;

import java.util.Scanner;

public class FilterKkaaattaaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char [] alpha = word.toCharArray();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < alpha.length; i++) {
            int temp = 0;
            for (int j = i + 1; j <= alpha.length - 1; j++) {
                if (alpha[i] == alpha[j]){
                    temp++;
                }else {
                    break;
                }
            }
            ans.append(alpha[i]);
            i += temp;
        }
        System.out.println(ans);
    }
}
