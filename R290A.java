package CodeForces;
import java.io.*;
import java.util.*;
/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class R290A {


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

    static void printOne(int column){
    	      for(int i=0;i<column;i++){
                  System.out.print("#");
              }
    }
    static void printTwo(int column){
        System.out.print("#");
        for(int i=1;i<column;i++){
            System.out.print(".");
        }
    }
    static void printThree(int column){

        for(int i=0;i<column-1;i++){
            System.out.print(".");
        }
        System.out.print("#");
    }
           public static void main(String[] args) {
               MyScanner sc = new MyScanner();
               int n = sc.nextInt();
               int m = sc.nextInt();

               int count =1;
               boolean front = false;
               boolean back = true;
               for(int i=1;i<=n;i++){
                   if(i%2!=0){
                       printOne(m);
                       System.out.println();
                   }
                   else{
                       if(back){
                           printThree(m);
                           System.out.println();
                           back = false;
                           front = true;
                           continue;
                       }
                       else if(front){
                           printTwo(m);
                           System.out.println();
                           back = true;
                           front = false;
                           continue;
                       }
                   }
               }
           }
}
