package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <String> list = new ArrayList<>();
        String eof = "end-of-file";

        while (sc.hasNext()){
            String  a = sc.nextLine();
            list.add(a);

            if (a.contains(eof)){
                break;
            }
        }

        for (int i = 1; i <= list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }

    }
}
