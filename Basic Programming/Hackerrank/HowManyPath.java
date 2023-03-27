package HackerRank;
//This code use recursion to find how many path that exist from left top side until right bot side.
public class HowManyPath {

    static int path (int n, int m){
        if (n == 1 || m == 1){
            return 1;
        }else {
            return path(n, m - 1) + path(n - 1, m);
        }

    }


    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(path(n, m));
    }
}
