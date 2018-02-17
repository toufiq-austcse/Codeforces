package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class R301A {


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
    static int forword(int from,int to){
    	      int count =0;
    	      while(from!=to) {

                  if (from == 9) {
                      from = 0;
                      count++;
                      continue;
                  }
                  from++;
                  count++;

              }
         return  count;
    }

    static int backword(int from,int to){

        int count =0;
        while(from!=to) {

            if (from == 0) {
                from = 9;
                count++;
                continue;
            }
            from--;
            count++;

        }

        return count;

    }
           public static void main(String[] args) {
               MyScanner sc = new MyScanner();

               int n = sc.nextInt();

              String in1 = sc.nextLine();
              String in2 = sc.nextLine();
              int steps =0;
              for(int i=0;i<n;i++){
                  int nm1 = Integer.parseInt(Character.toString(in1.charAt(i)));
                  int nm2 = Integer.parseInt(Character.toString(in2.charAt(i)));

                  steps +=Math.min(forword(nm1,nm2),backword(nm1,nm2));
               }

               System.out.println(steps);
           }
}
