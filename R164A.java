package CodeForces;

import java.io.*;
import java.util.*;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class R164A {

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
               List<Integer> h = new ArrayList<>();
               List<Integer> g = new ArrayList<>();
               for(int i=0;i<n;i++){
                   h.add(sc.nextInt());
                   g.add(sc.nextInt());

               }
               int count =0;
               for(int i=0;i<h.size();i++){
                   int home = h.get(i);
                   for(int j=0;j<g.size();j++){
                       if(i==j){
                           continue;
                       }
                       if(home==g.get(j)){
                           count ++;
                       }
                   }
               }

               System.out.println(count);
           }
}
