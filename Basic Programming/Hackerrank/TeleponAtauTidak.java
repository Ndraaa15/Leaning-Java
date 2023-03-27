package HackerRank;

import java.util.Scanner;

public class TeleponAtauTidak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine().replaceAll(",", ".");
        String b = sc.nextLine().replaceAll(",", ".");
        double negaraAsal = Double.parseDouble(t);
        double negaraJojo = Double.parseDouble(b);
        int jam = sc.nextInt();
        int menit = sc.nextInt();
        int jamS = jam;

        //Mencari perbedaan waktu
        double a = 0;
        if (negaraJojo > negaraAsal){
            a = (negaraJojo - negaraAsal);
        } else if (negaraAsal > negaraJojo) {
            a = negaraAsal - negaraJojo;
        }

        //Mencari waktu di negara asal
        if (negaraJojo > negaraAsal){
            double zz = a * 60;
            int z = (int) zz;
            menit -= z%60;
            if (menit < 1){
                menit = 60 + menit;
                jam -= Math.ceil(a);
                jam %= 24;
                if (jam < 1){
                    int temp = jam - (z/60);
                    jam = 24 + temp;
                }
            }else {
                jam -= (z/60);
                jam %= 24;
                if (jam < 1){
                    int temp = jam - (z/60);
                    jam = 24 + temp;
                }
            }
            System.out.println(jam);
            System.out.println(menit);
        } else if (negaraJojo < negaraAsal) {
            int z = (int) a * 60;
            jam += (z/60);
            jam %= 24;
            menit += z%60;
            if (menit > 60){
                jam += menit/60;
                menit %= 60;
            }
        }

        if (jam < 10){
            if (menit < 10){
                System.out.println("0" + jam + ":" + "0"+menit);
            }else {
                System.out.println("0" + jam + ":" +menit);
            }
        }else {
            if (menit < 10){
                System.out.println(jam + ":" + "0"+menit);
            }else {
                System.out.println(jam + ":" +menit);
            }
        }

        if (jam >= 7 && jam <= 12 || jam >= 13 && jam <= 16 || jamS >= 22 || jamS <= 4){
            System.out.println("Tunda dulu");
        }else {
            System.out.println("Menelepon");
        }

    }
}
