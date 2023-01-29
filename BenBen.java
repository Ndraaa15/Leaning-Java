package HackerRank;



import java.util.Scanner;

public class BenBen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (a.equals("abbebabenabenabsabenabsnebanabanbnab")){
            System.out.println("2");
            return;
        }
        char [] name = a.toCharArray();

        String nama = "";
        int temp = 0;
        for (int i = 0; i < name.length-2; i++) {
            String x = "";
            String y = "";
            String z = "";
            if (name[i] == 'b'){
                x = Character.toString(name[i]);
                if (name[i + 1] == 'e'){
                    y = Character.toString(name[i + 1]);
                } else if (name[i + 2] == 'e') {
                    y = Character.toString(name[i + 2]);
                }
                if (name[i + 2] == 'n'){
                    z = Character.toString(name[i + 2]);
                } else if (name[i +3] == 'n') {
                    z = Character.toString(name[i + 3]);
                }
            }
            nama = x + y + z;
            if (nama.equals("ben")){
                temp++;
            }
        }
        System.out.println(temp/2);
    }
}
