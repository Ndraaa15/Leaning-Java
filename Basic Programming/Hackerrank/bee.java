package HackerRank;

import java.util.*;

public class bee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bab = sc.nextInt();
        int sum = sc.nextInt();
        sc.nextLine();
        String [] name = new String[sum];
        int [] kasta = new int[sum];
        String temp ="";
        for (int i = 0; i < sum; i++) {
            name[i] = sc.nextLine();
            temp = sc.nextLine();
            if (temp.equals("ratu")){
                kasta[i] = 1;
            }else if (temp.equals("pejantan")){
                kasta[i] = 2;
            } else if (temp.equals("pekerja")) {
                kasta[i] = 3;
            }else if (temp.equals("preman")) {
                kasta[i] = 4;
            }
        }
        sc.close();
        
        int tempInt = 0;
        for (int i = 0; i < sum - 1; i++) {
            for (int j = 0; j < sum - i - 1; j++) {
                if (kasta[j] > kasta[j + 1]){
                    tempInt = kasta[j];
                    kasta[j] = kasta[j + 1];
                    kasta[j + 1] = tempInt;
                    
                    temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                }
            }
        }

        System.out.println("Semut yang telah selesai BAB:");
        for (int i = 0; i < bab - 1; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.println();
        System.out.println("Semut yang sedang BAB:");
        for (int i = bab - 1; i < bab; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.println();
        System.out.println("Semut yang kebelet BAB:");
        for (int i = bab; i < sum; i++) {
            System.out.print(name[i] + " ");
        }
    }
}
