package BCC;

import java.math.BigInteger;
import java.util.Scanner;

public class BelajarMembagi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        BigInteger [] b = new BigInteger[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextBigInteger();
        }
        BigInteger x = new BigInteger(String.valueOf(2));
        BigInteger y = new BigInteger(String.valueOf(3));
        BigInteger z = new BigInteger(String.valueOf(4));
        BigInteger v = new BigInteger(String.valueOf(5));
        BigInteger com = new BigInteger(String.valueOf(0));
        String ans = "";
        for (int i = 0; i < a; i++) {
            if (String.valueOf(b[i].mod(x)).equals("0")){
                ans += "2 ";
            }
            if (String.valueOf(b[i].mod(y)).equals("0")){
                ans += "3 ";
            }
            if (String.valueOf(b[i].mod(z)).equals("0")){
                ans += "4 ";
            }
            if (String.valueOf(b[i].mod(v)).equals("0")){
                ans += "5 ";
            }
            if (ans.equals("")){
                System.out.println(0);
            }else {
                System.out.println(ans);
            }
            ans ="";
        }

    }
}
