package HackerRank;

import java.util.Scanner;

public class benbenII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String [] splA = a.split("");

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (splA[i].equals("b") || splA[i].equals("e") || splA[i].equals("n") ){
                str.append(splA[i]);
            }
        }
        String filtered = String.valueOf(str);
        String [] splFiltered = filtered.split("");
        StringBuilder temp = new StringBuilder();
        int ans = 0;

        for (int i = 0; i < splFiltered.length; i++) {
            if (temp.toString().equals("") && splFiltered[i].equals("b")){
                temp.append(splFiltered[i]);
            } else if (String.valueOf(temp).equals("b") && splFiltered[i].equals("e")) {
                temp.append(splFiltered[i]);
            } else if (String.valueOf(temp).equals("be") && splFiltered[i].equals("n")) {
                temp.append(splFiltered[i]);
            }else if (String.valueOf(temp).equals("ben") && splFiltered[i].equals("b")) {
                ans++;
                temp = new StringBuilder("");
                temp.append(splFiltered[i]);
            }else if (String.valueOf(temp).equals("ben")) {
                ans++;
                temp = new StringBuilder("");
            }
        }
        if (String.valueOf(temp).equals("ben")){
            ans++;
        }

        System.out.println(ans/2);
    }
}
