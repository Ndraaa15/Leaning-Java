package HackerRank;
//In this case we use recursion to partioning the number
//N | M
//N -> is the number
//M -> Number to partion
// 3 | 2
// ** + *
// * + * + *
public class Partitioning {

    static int partioning (int n, int m){
        if (n == 0){
            return 1;
        } else if (m == 0 || n < 0) {
            return 0;
        }else {
            return partioning(n - m, m) + partioning(n, m -1);
        }
    }


    public static void main(String[] args) {
        System.out.println(partioning(3,2));
    }
}
