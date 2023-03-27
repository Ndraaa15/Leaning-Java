package HackerRank;

import java.util.Scanner;

public class DriverOjol {
    static double getJarak(double x1, double x2, double y1, double y2){
        /* Tuliskan rumus sesuai contraints dibawah ini */
        return Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
    }

    public static void main(String[] args) {
        /* Tuliskan kodemu dibawah ini */
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        int jumlah = sc.nextInt();
        sc.nextLine();
        double [] ojolX = new double[jumlah];
        double [] ojolY = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < jumlah; j++) {
                ojolX[i]= sc.nextDouble();
                ojolY[i] = sc.nextDouble();
            }
        }
        sc.close();

        double [] rad = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            rad[i] = getJarak(x, ojolX[i], y, ojolY[i]);
        }

        double ans = 0;
        int ojolKe = 0;
        for (int i = 0; i < rad.length; i++) {
            if (rad[i] < 20 && rad[i] < ans){
                ans = rad[i];
                ojolKe = i + 1;
            }
        }
        if (ans == 0){
            System.out.println("Tidak ada driver yang mengambil order");
            System.out.println("Order diluar jangkauan");
        }else {
            System.out.println("Driver yang mengambil order adalah ojek ke-" + ojolKe);
            System.out.println("Jarak yang ditempuh : " + ans);
        }
    }
}
