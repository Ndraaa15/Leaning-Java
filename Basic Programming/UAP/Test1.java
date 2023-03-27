package UAP;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (a.equals("196")){
            System.out.println("Bilangan dilarang!");
            System.exit(0);
        }
        boolean x = true;
        String abc = a;
        String zzz = "";
        while (x){

            StringBuilder str = new StringBuilder();
            long bil1 = Long.parseLong(abc);
            String [] aaa = abc.split("");

            for (int i = aaa.length - 1; i >=0 ; i--) {
                zzz += aaa[i];
            }
            Long bil2 = Long.parseLong(zzz);
            Long bil3 = bil1 + bil2;
            char[] cot = Long.toString(bil3).toCharArray();
            for(int i = cot.length; i > 0; i--){
                str.append(cot[i - 1]);
            }
            int kwek = Integer.parseInt(String.valueOf(str));
            System.out.println(bil1 + " + " + bil2 + " = " + bil3);
            if (bil3 == kwek){
                x = false;
                System.out.println(bil3 + " merupakan bilangan palindrome");
            }else {
                abc = String.valueOf(bil3);
                zzz = "";
            }
        }
    }
}
