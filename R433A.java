package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.util.*;

public class R433A {


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
    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);

    }

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();

        int a =0;
        int b = 0;
        int  prev =Integer.MAX_VALUE;

        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n){
                    if(gcd(i,j)==1  && i<j && Math.abs(i-j)<prev){
                        //System.out.println(i+" "+j);
                        a= i;
                        b = j;

                      prev = Math.abs(i-j);
                    }
                }
            }
        }

        System.out.println(a+" "+b);
    }

}
