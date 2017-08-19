package CodeForces;

import java.util.*;

public class R428A {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 5];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();

        }

        int count = 0;
        int total = 0;
        boolean isStop = false;

        for (int i = 1; i <= n; i++) {
            count++;
            if (arr[i] > 8) {
                total += 8;
                arr[i + 1] += arr[i] - 8;
            } else {
                total += arr[i];

            }
            // System.out.println(total);
            if (total >= k) {
                System.out.println(i);
                isStop = true;
                break;
            }
        }

        if (!isStop) {
            System.out.println(-1);
        }


    }

}
