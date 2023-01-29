package HackerRank;

import java.util.*;

public class KalkulatorSederhana {
            public static float penjumlahan(float a, float b){
                return a+b;
            }

            public static float pengurangan(float a, float b){
                return a-b;
            }

            public static float perkalian(float a, float b){
                return a*b;
            }

            public static float pembagian(float a, float b){
                return a/b;
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
                int u = sc.nextInt();
                int w = sc.nextInt();
                float x = (float) u;
                float y = (float) w;
                String z = sc.nextLine();
                if (z.equals("penjumlahan")){
                    System.out.println(penjumlahan(x, y));
                }else if (z.equals("pengurangan")){
                    System.out.println(pengurangan(x, y));
                } else if (z.equals("perkalian")){
                    System.out.println(perkalian(x, y));
                } else if (z.equals("pembagian")){
                    System.out.println(pembagian(x, y));
                }
            }
        }

