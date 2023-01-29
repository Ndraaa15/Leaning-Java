package HackerRank;

import java.util.Scanner;

public class GoblinFighter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] goblin = new int[a];
        for (int i = 0; i < a; i++) {
            goblin[i] = sc.nextInt();
        }
        int b = 1;
        int sum = 0;
        for (int j = 0; j < goblin.length ; j++) {
            for (int i = 0; i < goblin.length; i++) {
                if (b == goblin[i]){
                    sum += goblin[i];
                    goblin[i] = 0;
                    b++;
                }
            }
        }
        System.out.println(sum);
    }
}
