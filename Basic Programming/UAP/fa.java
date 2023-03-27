package UAP;

import java.util.Scanner;

public class fa {
    static int as (int angka){


            StringBuilder str = new StringBuilder();
            char[] aw = Integer.toString(angka).toCharArray();
            for(int i = aw.length; i > 0; i--){
                str.append(aw[i - 1]);
            }
            int y = Integer.parseInt(String.valueOf(str));


        return y;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        if(x == 196) {
            System.out.println("Bilangan dilarang!");
            System.exit(0);
        }
        boolean f = true;
        while (f){
            int z = x + as(x);
            if(x == as(x)) {
                System.out.println(x + " merupakan bilangan palindrome");
                f = false;
            } else {
                System.out.println(x + " + " + as(x) + " = " + z);
                x = x + as(x);
            }
        }


    }

}
