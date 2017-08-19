package CodeForces;

import java.io.*;
import java.util.*;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class R268A {
             /*
    		  Code for faster input
    		 */


    public static class MyScanner {

        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

    //--------------------------------------------------------
    static int binarySearch(int[] arr, int left, int right, int x) {

        if (left <= right) {
            int mid = (left + (right - left)) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = right - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int t = sc.nextInt();
        int p = sc.nextInt();
        int[] X = new int[p];
        for (int i = 0; i < p; i++) {
            X[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] Y = new int[q];
        for (int i = 0; i < q; i++) {
            Y[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            list.add(i);
        }

        for (int i = 0; i < X.length; i++) {
            if (list.contains(X[i])) {
                list.remove(new Integer(X[i]));
            }
        }


        for (int i = 0; i < Y.length; i++) {
            if (list.contains(Y[i])) {
                list.remove(new Integer(Y[i]));
            }
        }


        if (list.isEmpty()) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }

}
