package BCC;

import java.util.Scanner;

public class SimulasiPerang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] box = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                box[i][j] = sc.next();
            }
        }
        int a = sc.nextInt();
        int [] x = new int[a];
        int [] y = new int[a];

        for (int i = 0; i < a; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            if (x[i] < 10 && y[i] < 10){
                if (box[x[i]][y[i]].equals("a")){
                    System.out.println("Terkena altileri");
                } else if (box[x[i]][y[i]].equals("k")) {
                    System.out.println("Meleset");
                }else if (box[x[i]][y[i]].equals("p")) {
                    System.out.println("Terkena prajurit");
                }else if (box[x[i]][y[i]].equals("t")) {
                    System.out.println("Terkena tank");
                }
            }else {
                System.out.println("Tidak terjangkau");
            }

        }
    }
}
