package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.util.*;
public class R430A {


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

    	      String nextLine(){
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
           public static void main(String[] args) {
               MyScanner sc = new MyScanner();
               long l = sc.nextLong();
               long r = sc.nextLong();
               long x = sc.nextLong();
               long y = sc.nextLong();
               long k = sc.nextLong();


               if((r-l+1)*(y-x+1)==0){

                   System.out.println("NO");
               }
               else {
                   boolean flag = false;

                   for(long i = x;i<=y;i++){

                       if(i*k>=l && i*k<=r){
                           flag = true;
                           break;
                       }
                   }

                   if(flag){
                       System.out.println("YES");
                   }
                   else {
                       System.out.println("NO");
                   }

               }
           }
}
