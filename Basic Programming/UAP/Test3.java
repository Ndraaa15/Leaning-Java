package UAP;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ant = sc.nextInt();
        int bu = sc.nextInt();
        int [] kosong = new int[bu];
        int [] aa = new int[bu];

        for (int i = 0; i < bu; i++) {
            kosong[i] = sc.nextInt();
            aa[i] = kosong[i];
        }
        int max = 0;
        int min = 0;
        int i = 0;
        int jj = ant;
            while (jj > 0){
                while (kosong[i] > 0){
                    min += kosong[i];
                    kosong[i]--;
                    jj--;
                }
                i++;
            }

            int j = 0;
            int ff = ant;
        while (ff > 0){
                while (aa[j] > 0){
                    max += kosong[j];
                    aa[j] --;
                    ff--;
                    j++;
                    if(j == bu - 1){
                        j = 0;
                    }
                }

            }
        System.out.print(max + " " + min);
    }
}
