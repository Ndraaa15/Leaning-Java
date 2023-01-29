package HackerRank;

import java.util.Scanner;

public class benbenII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int ans = 0;

        while (a.contains("b")){
            int index = a.indexOf("b");
            a = String.format("%s%s", a.substring(0, index), a.substring(index + 1));
            System.out.println(a);
            while (a.contains("e")){
                int index2 = a.indexOf("e");
                if (index2 > index){
                    a = String.format("%s%s", a.substring(0, index2), a.substring(index2 + 1));
                    while (a.contains("n")){
                        int index3 = a.indexOf("n");
                        if(index3 > index2){
                            a = String.format("%s%s", a.substring(0, index3), a.substring(index3 + 1));
                            System.out.println(a);
                            ans++;
                            System.out.println(ans);
                        }else {
                            a = String.format("%s%s", a.substring(0, index3), a.substring(index3 + 1));
                        }
                    }
                }else {
                    a = String.format("%s%s", a.substring(0, index2), a.substring(index2 + 1));
                }
                System.out.println(a);
            }
        }
        System.out.println(ans);
        System.out.println(ans/2);
    }
}
