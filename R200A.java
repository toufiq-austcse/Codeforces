package CodeForces;

import java.util.*;
import java.io.*;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class R200A {


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

             List<String> list = new ArrayList<>();
               for(int i=0;i<n;i++){
                 list.add(sc.nextLine());
               }


              int count =0;
               for(int i=0;i<list.size()-1;i++){
                   if(list.get(i).charAt(1)==list.get(i+1).charAt(0)){
                       count++;
                   }
               }

               System.out.println(count+1);



           }
}
