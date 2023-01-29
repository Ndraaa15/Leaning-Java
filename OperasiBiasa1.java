package HackerRank;



import java.util.Scanner;

public class OperasiBiasa1 {

    static long reverseN1 (String n1)
    {
        long hasil1 = 0;
        String [] nn1 = n1.split("");
        for (int i = n1.length() - 1; i >= 0; i--) {
            hasil1 += Integer.parseInt(nn1[i]);
        }

        return hasil1;
    }

    static long reverseN2 (String n2)
    {
        long hasil2 = 0;
        String [] nn1 = n2.split("");
        for (int i = n2.length() - 1; i >= 0; i--) {
            hasil2 += Integer.parseInt(nn1[i]);
        }
        return hasil2;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        String asu = Long.toString(num);
        String [] asuu = asu.split("");
        StringBuilder numSs = new StringBuilder();
        for (int i = asu.length() - 1; i >= 0; i--) {
            numSs.append(asuu[i]);
        }
        String numS = String.valueOf(numSs);
        long numm = Long.parseLong(numS);

        String n1 = "";
        String n2 = "";
        long hasil = 0;

        while (numS.length() !=  1){
            if (numm % 2 == 0){
                n1 = numS.substring(0, numS.length()/2);
                n2 = numS.substring(numS.length()/2);
            }else {
                n1 = numS.substring(0, numS.length()/2 + 1);
                n2 = numS.substring(numS.length()/2 + 1);
            }
            System.out.println("n1 = "+n1);
            System.out.println("n2 = "+n2);
            System.out.println("hasil1 = "+reverseN1(n1));
            System.out.println("hasil2 = "+reverseN2(n2));
            hasil = reverseN1(n1) + reverseN2(n2);
            numS = Long.toString(hasil);
        }

        System.out.println(numS);


    }
}
