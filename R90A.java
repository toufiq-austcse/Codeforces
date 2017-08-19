package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.util.*;

public class R90A {

    //Code for Faster Input
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
    static int gcd(int n, int k) {
        if (n % k == 0) {
            return k;
        }
        return gcd(k, n % k);
    }

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int count = 1;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        while (true) {

            if(count%2!=0){
                if(n<=0){
                    System.out.println(1);
                    break;
                }
                n-=gcd(a,n);
            }
            else{
                if(n<=0){
                    System.out.println(0);
                    break;
                }
                n-=gcd(b,n);
            }



            count++;


        }
    }
}
