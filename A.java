//package CodeForces;

import java.util.Scanner;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt(); //column
            int m = in.nextInt(); //row
            int[][] arr = new int[n + 1][m + 1];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            int temp = 1;
            int comlumn = -1;
            int prev = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) { //column
                for (int j = 0; j < m; j++) { //row
                    temp *= arr[j][i];
                }
                if (temp >= prev) {
                    prev = temp;
                    comlumn = i;
                }

                temp = 1;
            }

            System.out.println(comlumn + 1);

        }

    }
}
