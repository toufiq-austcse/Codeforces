package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class R429B {

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
               long n = sc.nextLong();
               List<Long> list = new ArrayList<>();
               long total =0;
               for(long i=0;i<n;i++){
                   long a = sc.nextLong();
                   list.add(a);
                   total +=a;
               }
               boolean isODD=false,isEven = false;

               for(int i=0;i<list.size();i++){
                   if(list.get(i)%2!=0){
                       isODD =true;
                       break;
                   }
               }

               if(total%2!=0){
                   System.out.println("First");
               }
               else if(isODD){
                   System.out.println("First");
               }
               else{
                   System.out.println("Second");
               }

           }
}
