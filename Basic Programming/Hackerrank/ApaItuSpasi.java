package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ApaItuSpasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        scan.close();
                // 1. Acara +5
                // 2. DDM +3
                // 3. Kestari +7
                // 4. Humas +5
                // 5. Admin +5
                // 6. PIT +3

        ArrayList<String> hasil = new ArrayList<>();
        while (input.contains("acara")) { // boolean
            int x = input.indexOf("acara");
            String a = (input.substring(x, x + 1).toUpperCase() + input.substring(x+1, x+5));
            hasil.add(a);
            // replace

            // kestariacaraddmacarapit
            // jadi -> kestariddmacarapit

            // kestariddmacarapit
            // jadi -> kestariddmpit
            input = String.format("%s%s", input.substring(0, x), input.substring(x + 5, input.length()));
        }
        while (input.contains("ddm")) { // boolean
            int x = input.indexOf("ddm");
            String a = (input.substring(x, x +3).toUpperCase());
            hasil.add(a);
            input = String.format("%s%s", input.substring(0, x), input.substring(x + 3, input.length()));
        }
        while (input.contains("kestari")) { // boolean
            int x = input.indexOf("kestari");
            String a = (input.substring(x, x + 1).toUpperCase() + input.substring(x+1, x+7));
            hasil.add(a);
            input = String.format("%s%s", input.substring(0, x), input.substring(x + 7, input.length()));
        }
        while (input.contains("humas")) { // boolean
            int x = input.indexOf("humas");
            String a = (input.substring(x, x + 1).toUpperCase() + input.substring(x+1, x+5));
            hasil.add(a);
            input = String.format("%s%s", input.substring(0, x), input.substring(x + 5, input.length()));
        }
        while (input.contains("admin")) { // boolean
            int x = input.indexOf("admin");
            String a = (input.substring(x, x + 1).toUpperCase() + input.substring(x+1, x+5));
            hasil.add(a);
            input = String.format("%s%s", input.substring(0, x), input.substring(x + 5, input.length()));
        }
        while (input.contains("pit")) { // boolean
            int x = input.indexOf("pit");
            String a = (input.substring(x, x+3).toUpperCase());
            hasil.add(a);
            input = String.format("%s%s", input.substring(0, x), input.substring(x + 3, input.length()));
        }

        for (String string : hasil) {
            System.out.print(string + " ");
        }

            }
        }

//tinggal ganti ke while loop untuk divisi lain

