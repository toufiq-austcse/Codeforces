package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class R324A {


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
               int n = sc.nextInt();
               int k = sc.nextInt();
               String s="";
               for(int i=0;i<n;i++){
                   if(i==0){
                       s+="1";
                   }
                   else{
                       s+="0";
                   }
               }

               BigInteger a = new BigInteger(String.valueOf(s));

               for(BigInteger i=a;;i=i.add(new BigInteger("1"))){
                 if(i.toString().length()>n){

                      System.out.println(-1);
                      break;
                  }
                  if((i.mod(new BigInteger(String.valueOf(k)))).toString().equals("0")){
                      System.out.println(i);
                      break;
                  }
                   //System.out.println(i);



               }
           }
}
