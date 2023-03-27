package UAP;

import java.util.Arrays;
import java.util.Scanner;

public class f {
    static int max (int p, int [] bus){
        int max = 0;
        while(p>0){
            Arrays.sort(bus);
            max+=bus[bus.length-1];
            bus[bus.length-1]--;
            p--;
        }
        return  max;
    }
    static int min (int p, int [] kursi){
        int min = 0;
        while(p>0){
            Arrays.sort(kursi);
            for(int i=0; i<kursi.length; i++){
                if(kursi[i]>0){
                    min+=kursi[i];
                    kursi[i]--;
                    break;
                }
            }
            p--;
        }
        return min;
    }
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                int x = scan.nextInt();
                int y = scan.nextInt();
                int maks = 0;
                int min = 0;

                int [] bus = new int[y];
                int [] kursi = new int[y];
                for (int i = 0; i < y; i++) {
                    bus[i] = scan.nextInt();
                    kursi[i] = bus[i];
                }
                maks = max(x,bus);
                min = min(x, kursi);
                System.out.println(maks+" "+min);
            }
        }
