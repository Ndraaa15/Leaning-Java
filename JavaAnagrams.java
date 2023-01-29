package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {


    public static boolean comparison (String a, String b){

        String newA = a.toLowerCase();
        String newB = b.toLowerCase();

        char [] newAA = newA.toCharArray();
        char [] newBB = newB.toCharArray();

        Arrays.sort(newAA);
        Arrays.sort(newBB);

        String aa = Arrays.toString(newAA);
        String bb = Arrays.toString(newBB);

        return aa.equals(bb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        boolean ans = comparison(a,b);

        if (ans){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
