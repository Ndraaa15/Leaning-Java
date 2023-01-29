package HackerRank;

import java.util.Scanner;

public class BagiBagiPermen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int child = sc.nextInt();
        int candy = sc.nextInt();
        int first_Child = sc.nextInt();

        while(candy > 1){
            candy--;
//            System.out.println(first_Child);
//            if (candy == 0){
//                break;
//            }
            if (first_Child == child){
                first_Child = 1;
            }else {
                first_Child++;
            }
        }
        System.out.println(first_Child);
    }
}
