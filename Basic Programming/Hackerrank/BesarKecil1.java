    package HackerRank;

    import java.util.*;

    public class BesarKecil1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();
            String a = x.toLowerCase();
            char [] huruf = a.toCharArray();
            for (int i = 0; i < huruf.length; i++) {
                if (i % 2 == 0){
                    huruf[i] = Character.toUpperCase(huruf[i]);
                }else {
                    huruf[i] = Character.toLowerCase(huruf[i]);
                }
            }
            for (int i = 0; i < huruf.length; i++) {
                System.out.print(huruf[i]);
            }
        }
    }