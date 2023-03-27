package HackerRank;

import java.text.NumberFormat;
import java.util.Scanner;

public class Enkripsi {
    public static void main(String[] args) {
        try {
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double f = f1.doubleValue();
            System.out.println(x + b + f);

        }
        catch (NumberFormatException e){
            System.out.println("Bad Number");
        }
    }
}
