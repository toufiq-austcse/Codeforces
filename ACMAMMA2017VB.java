package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class ACMAMMA2017VB {

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
    static String aftermarari(String a,String b){
    	      char[] arr = b.toCharArray();
    	      for(int i=0;i<a.length();i++){
    	          char charoffirstWord = a.charAt(i);
    	          for(int j=0;j<arr.length;j++){
    	              if(charoffirstWord==arr[j] && arr[j]!='-'){
    	                  arr[j] ='-';
                      }
                  }
              }

              String out ="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='-'){
                out +=arr[i];
            }
        }
        return out;
    }
           public static void main(String[] args) {
               MyScanner sc = new MyScanner();

               int t = sc.nextInt();
               for(int i=0;i<t;i++) {
                   String[] s = sc.nextLine().split(" ");

                   String c = aftermarari(s[0],s[1]);

                   System.out.println(s[1].length()-c.length());
               }

           }
}
