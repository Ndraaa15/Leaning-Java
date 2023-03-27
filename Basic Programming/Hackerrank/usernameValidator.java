package HackerRank;

import java.util.Scanner;

class usernameValidator {
    public static final String regularExpresion = "^[a-zA-Z][\\w]{7,29}$";

    public static class ValidUsernameRegulerExpresion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            for (int i = 0; i < a; i++) {
                String username = sc.next();
                if(username.matches(regularExpresion)){
                    System.out.println("Valid");
                }else {
                    System.out.println("Invalid");
                }
            }
        }
    }
}
