package HackerRank;

import java.util.*;

public class PembuatGame {
    static float kick (int sisaHP){
        double dmg = (0.1 * sisaHP);
        int u = (int) dmg;
        return sisaHP - u;
    }
    static float punch (int sisaHP){
        return sisaHP - 30;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        String [] atk = new String[x];
        int sisaHP = a;
        for (int i = 0; i < x; i++) {
            atk[i] = sc.next();
            if (atk[i].equals("Kick")){

                sisaHP = (int) kick(sisaHP);
            }else {
                sisaHP = (int) punch(sisaHP);
            }
        }
        if (sisaHP > 0){
            System.out.println(sisaHP);
        }else {
            System.out.println("Monster mati");
        }
    }
}