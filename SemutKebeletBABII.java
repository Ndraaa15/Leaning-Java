package HackerRank;

import java.util.Scanner;

public class SemutKebeletBABII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iterasi = scan.nextInt();
        int bab = scan.nextInt();
        scan.nextLine();
        String[] namaSemut = new String[bab];
        String temp = "";
        int[] kasta = new int[bab];
        for(int i = 0; i < bab; i++) {
            namaSemut[i] = scan.nextLine();
            temp = scan.nextLine();
            kasta[i] = (temp.equalsIgnoreCase("ratu") ? 1 : temp.equalsIgnoreCase("pejantan") ? 2 : temp.equalsIgnoreCase("pekerja") ? 3 : 4);
        }
        scan.close();

        //sorting
        int tempInt;
        for(int i = 1; i < kasta.length; i++) {
            while(kasta[i] < kasta[i-1]) {

                tempInt = kasta[i];
                kasta[i] = kasta[i-1];
                kasta[i-1] = tempInt;

                temp = namaSemut[i];
                namaSemut[i] = namaSemut[i-1];
                namaSemut[i-1] = temp;

                i--;
                if(i == 0)
                    break;
            }
        }
        //

        //bab iterasi
        System.out.println("Semut yang telah selesai BAB:");
        int last;
        for(last = 0; last < iterasi-1; last++) {
            System.out.print(namaSemut[last] + " ");
        }
        System.out.print("\n\n");

        System.out.println("Semut yang sedang BAB:");
        System.out.println(namaSemut[last]+"\n");
        last++;

        System.out.println("Semut yang kebelet BAB:");
        for(; last < namaSemut.length; last++) {
            System.out.print(namaSemut[last] + " ");
        }
    }
}
