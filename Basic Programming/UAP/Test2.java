package UAP;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int con = sc.nextInt();
        String [] sam = new String[con];
        for (int i = 0; i < con; i++) {
            sam[i] = sc.nextLine();
        }
    }
}
