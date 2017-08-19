package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class VC2017A {


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
    static boolean isprime(int a){
    	      if(a<=1){
    	          return false;
              }
              for(int i=2;i*i<=a;i++){
    	          if(a%i==0){
    	              return false;
                  }
              }

              return true;
    	  }

           public static void main(String[] args) {
               MyScanner sc = new MyScanner();
               int n = sc.nextInt();
               for(int i=1;;i++){
                   int b= n*i+1;
                   if(!isprime(b)){
                       System.out.println(i);
                       break;
                   }
               }

           }
}
