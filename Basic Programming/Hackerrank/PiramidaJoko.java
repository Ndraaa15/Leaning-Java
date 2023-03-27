    package HackerRank;

    import java.util.Scanner;

    public class PiramidaJoko {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            for (int i = 0; i < a; i++) {
                for (int j = 0; j <= 2*a - 2*i - 3; j++) {
                    System.out.print(" ");
                }
                for (int j = i + 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2 ; j <= 1 + i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
