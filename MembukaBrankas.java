package HackerRank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MembukaBrankas {

    public static List<List<Integer>> combine  (int n, int k){
        if (k > n) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        combine(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private static void combine(int i, int n, int k, List<Integer> comb, List<List<Integer>> result){
        if (k == 0){
            result.add(new ArrayList<>(comb));
            return;
        }
        for (int x = i; x <= n ; x++) {
            comb.add(x);
            combine(x + 1, n, k -1, comb, result);
            comb.remove(comb.size()-1);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<List<Integer>> ans;
        ans = combine(n,k);
        for (List<Integer>answer: ans) {
            String wow = Arrays.toString(new List[]{answer}).replaceAll(",", "");
            String f = wow.substring(2, wow.indexOf("]"));
            System.out.println(f);
        }
    }
}
