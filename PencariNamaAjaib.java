package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class PencariNamaAjaib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names = sc.nextLine();
        String [] name = names.split(" ");
        String huruf  = sc.next();
        char [] hur = huruf.toCharArray();
        ArrayList <String> nameSorted = new ArrayList<>();

        int temp = 0;
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length(); j++) {
                if (name[i].charAt(j) == hur[0] ){
                    nameSorted.add(name[i]);
                    temp++;
                }
            }
        }

        if (temp == 0){
            System.out.println("TIDAK ADA NAMA YANG DITEMUKAN!!");
        }else if (temp == 1){
            System.out.println(nameSorted.get(0));
            System.out.println("ANTON INGAT NAMANYA!");
        } else {
            for (int i = 0; i < temp ; i++) {
                System.out.println(nameSorted.get(i));
            }
            System.out.println("ANTON PUSING!!");
        }
    }
}

