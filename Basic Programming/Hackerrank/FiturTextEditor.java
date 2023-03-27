    package HackerRank;

    import java.util.Scanner;

    public class FiturTextEditor {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            String [] bracket = new String[a];
            for (int i = 0; i < a; i++) {
                bracket[i]  = sc.next();
            }

            for (int i = 0; i < a; i++) {
                boolean aw = true;
                char [] splitted = bracket[i].toCharArray();
                for (int j = 0; j < bracket[i].length()/2 ; j++) {
                    for (int k = bracket[i].length()-1 ; k >= bracket[i].length()/2; k--) {
                        if (splitted[j] != splitted[k]){
                            aw = false;
                            break;
                        }
                    }
                }
                if (aw){
                    System.out.println("YA");
                }else {
                    System.out.println("TIDAK");
                }
            }
        }
    }
