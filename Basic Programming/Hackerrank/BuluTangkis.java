package HackerRank;

import java.util.Scanner;

public class BuluTangkis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cuaca = sc.nextLine();
        String suhu = sc.nextLine();
        String klmpbn = sc.nextLine();
        String angin = sc.nextLine();
        String hari = sc.nextLine();
        String mood = sc.nextLine();


        if (mood.equals("bagus")){
            System.out.println("Toni pergi berlatih ");
            return;
        }
        if (cuaca.equals("hujan")){
            System.out.println("Toni tidak pergi berlatih");
            return;
        }
        if (cuaca.equals("cerah") && suhu.equals("panas") && hari.equals("siang")){
            System.out.println("Toni tidak pergi berlatih");
            return;
        }
        if (suhu.equals("sedang") && angin.equals("labil")){
            System.out.println("Toni pergi berlatih ");
            return;
        }

        int ans = 0;
        //Cuaca
        if (cuaca.equals("cerah") || cuaca.equals("mendung")){
            ans++;
        }else {

        }
        //Suhu
        if (suhu.equals("sedang")){
            ans++;
        }else {

        }
        //Kelembapan
        if (klmpbn.equals("normal")){
            ans++;
        }else {

        }

        if (angin.equals("stabil")){
            ans++;
        }else {

        }
        if (hari.equals("pagi") || hari.equals("siang")){
            ans++;
        }else {

        }
        if (mood.equals("bagus")){
            ans++;
        }else {

        }

        if (ans == 3){
            System.out.println("Toni pergi berlatih ");
        }else {
            System.out.println("Toni tidak pergi berlatih ");
        }

    }
}
