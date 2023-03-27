package HackerRank;

import java.util.Scanner;

public class HilangkanHurufVokal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senteces = sc.nextLine();

        char [] alphabet = senteces.toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == ' '){
                System.out.print(" ");
            }else if (alphabet[i] == 'a' || alphabet[i] == 'A'){
                System.out.print("");
            }else if (alphabet[i] == 'i' || alphabet[i] == 'I'){
                System.out.print("");
            }else if (alphabet[i] == 'u' || alphabet[i] == 'U'){
                System.out.print("");
            }else if (alphabet[i] == 'e' || alphabet[i] == 'E'){
                System.out.print("");
            }else if (alphabet[i] == 'o' || alphabet[i] == 'O'){
                System.out.print("");
            }else {
                System.out.print(alphabet[i]);
            }
        }
    }
}
