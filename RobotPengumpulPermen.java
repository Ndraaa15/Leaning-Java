package HackerRank;

import java.util.Scanner;

public class RobotPengumpulPermen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [][] candy = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                candy[i][j] = sc.nextInt();
            }
        }

        int temp = 0;
        int x = 3;
        int y = 0;
        int z = 4;
        int u = 1;
        for (int i = 0; i < 25; i++) {
            if (candy[x][y] >  candy[z][u]){
                temp += candy[x][y];
                x -= 1;
                y -= 0;
                z -= 1;
                u -= 0;
            } else if (candy[x][y] <  candy[z][u]) {
                x += 0;
                y += 1;
                z += 0;
                u += 2;
            } else if (x == 0 && y == 4 || z == 0 && u == 4){
                break;
            }
        }
        System.out.println(temp);
    }
}
