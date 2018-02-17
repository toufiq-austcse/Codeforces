package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class AIMTECHROUND4B {


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
               int m = sc.nextInt();
              int[][] arr = new int[n][m];
               for(int i=0;i<n;i++){
                   for(int j=0;j<m;j++){
                       arr[i][j] = sc.nextInt();
                   }
               }

               int total = n*m;
               for(int i=0;i<m;i++){
                   int oneCount =0;
                   int zeroCount =0;

                   for(int j=0;j<n;j++){
                       if(arr[j][i]==1){
                           oneCount++;
                       }
                       else if(arr[j][i]==0){
                           zeroCount++;
                       }
                   }

                   if(oneCount>1){
                       total +=(oneCount-1);
                   }
                   if(zeroCount>1){
                       total +=(zeroCount-1);
                   }
               }

               for(int i=0;i<n;i++){
                   int oneCount =0;
                   int zeroCount =0;
                   for(int j=0;j<m;j++){
                       if(arr[i][j]==1){
                           oneCount++;
                       }
                       else if(arr[i][j]==0){
                           zeroCount++;
                       }
                   }

                   if(oneCount>1){
                       total +=(oneCount-1);
                   }
                   if(zeroCount>1){
                       total +=(zeroCount-1);
                   }
               }

               System.out.println(total);
           }
}
