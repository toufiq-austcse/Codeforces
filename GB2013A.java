package CodeForces;

import java.io.*;
import java.util.*;
/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class GB2013A {


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
               int a = sc.nextInt();
               int b = sc.nextInt();

               int count =a;
               List<Integer>list = new ArrayList<>();
               int temp=0;

               while (a>1){

                   if(a>=b) {
                       temp = a % b;
                   }
                   else{
                       temp =0;
                   }
                   a = (a-temp)/b;
                  list.add(a);
                   a= a+temp;


                   //System.out.println(a);



               }

               for(int i=0;i<list.size();i++){
                   count += list.get(i);
               }

               System.out.println(count);


           }
}
