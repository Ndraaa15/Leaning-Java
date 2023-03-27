package HackerRank;

import java.util.Scanner;

public class TemanmuInginDiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int berat = sc.nextInt();
        int target = sc.nextInt();
        int second = sc.nextInt();
        int km = sc.nextInt();

        int hour = second/3600;
        int minutes = (second % 3600) / 60;
        double minutess = (double) (second  % 3600) / 60;
        int seconds = (second % 3600) % 60;
        double secondss = (double) (second % 3600) % 60;

        if (hour < 10){
            if (minutes < 10){
                if (seconds < 10){
                    System.out.println("0" + hour + ":0" + minutes + ":0" + seconds );
                }else {
                    System.out.println("0" + hour + ":0" + minutes + ":" + seconds );
                }
            }else {
                if (seconds < 10){
                    System.out.println("0" + hour + ":" + minutes + ":0" + seconds );
                }else {
                    System.out.println("0" + hour + ":" + minutes + ":" + seconds );
                }
            }
        }else {
            if (minutes < 10){
                if (seconds < 10){
                    System.out.println(hour + ":0" + minutes + ":0" + seconds );
                }else {
                    System.out.println(hour + ":0" + minutes + ":" + seconds );
                }
            }else {
                if (seconds < 10){
                    System.out.println(hour + ":" + minutes + ":0" + seconds );
                }else {
                    System.out.println(hour + ":" + minutes + ":" + seconds );
                }
            }
        }

        double kalori = 0;
        double time = (hour + (minutess / 60) + (secondss / 3600));
        System.out.println(time);
        double vel = Math.round(km / time);
        System.out.println(vel);

        if (vel <= 4){
            kalori = Math.round(6 * berat * time);
            System.out.printf("%.0f\n", kalori);
        } else if (vel == 5) {
            kalori = Math.round(8.3 * berat * time);
            System.out.printf("%.0f\n", kalori);
        }else if (vel == 6) {
            kalori = Math.round(Math.round(9.8 * berat* time));
            System.out.printf("%.0f\n", kalori);
        }else if (vel == 7) {
            kalori = Math.round(11.0 * berat* time);
            System.out.printf("%.0f\n", kalori);
        }else if (vel >= 9) {
            kalori = Math.round(11.8 * berat* time);
            System.out.printf("%.0f\n", kalori);
        }


        int selisih = berat- target;
        double totalKal = selisih * 7700;
        System.out.println(totalKal);
        double ans = Math.round(totalKal / kalori);
        System.out.printf("%.0f", ans);




    }
}
