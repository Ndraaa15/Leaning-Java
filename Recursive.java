package HackerRank;

import java.io.*;
import java.util.*;
public class Recursive {

        // gunain method recursive lebih baik, biar belajar persiapan uap :D
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            long a = sc.nextInt();
            System.out.println(recursive(a));
        }


        //----------------------
        static long recursive(long x){
            if(x == 0){
                return 1;
            }
            return recursive(x - 1)*x;

        }
    }

