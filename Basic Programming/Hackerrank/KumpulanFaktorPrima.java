package HackerRank;

import java.util.Scanner;

public class KumpulanFaktorPrima{
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int sizePrime = inputUser.nextInt();
        int[] primes = new int[sizePrime];

        for(int i = 0 ; i < primes.length; i++){
            primes[i] = inputUser.nextInt();
        }

        int arrSize = inputUser.nextInt();

        int[] result = KumpulanFaktorPrima(primes, arrSize);

        for(int i = 0 ; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

    }

    public static int[] KumpulanFaktorPrima(int[] primes, int arrSize) {
        //tulis kode anda disini
        int [] ans = new int [arrSize];
        ans[0] = 1;

        int counter = 1;
        for (int i = primes[0]; i <= Integer.MAX_VALUE; i++) {
            if (counter == arrSize){
                break;
            }
            for (int j = 0; j < primes.length; j++) {
                if (i % primes[j] == 0){
                    ans[counter] = i;
                    counter++;
                    break;
                }
            }
        }
        return ans;
    }
}