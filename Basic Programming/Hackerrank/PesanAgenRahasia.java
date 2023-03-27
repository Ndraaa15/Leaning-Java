package HackerRank;


import java.util.ArrayList;
import java.util.Scanner;

public class PesanAgenRahasia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        String fak = sen;
        String [] splSen = sen.split("");
        ArrayList <Integer> fu = new ArrayList<>();
        ArrayList <String> fuk = new ArrayList<>();

        for (int i = 0; i < sen.length(); i++) {
            fuk.add(splSen[i]);
        }
        int [] asw = new int[sen.length()];


        int temp = 0;

        for (int i = 0; i < sen.length(); i++) {
            if (splSen[i].equals(" ")){
                asw[i] = 32;
            }else {
                for (int j = 0; j < sen.length(); j++) {
                    if (splSen[i].equals(fuk.get(j))){
                        asw[j] = temp;
                        System.out.println(temp);
                    }

                }

                temp++;
            }
        }



        for (int a: asw) {
            if (a == 32){
                System.out.print(" ");
            }else {
                System.out.print(a + " ");
            }
        }



    }
}
