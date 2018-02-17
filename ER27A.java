package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class ER27A {


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
               List<Integer> list = new ArrayList<>();
               for(int i=0;i<2*n;i++){
                   list.add(sc.nextInt());
               }
               Collections.sort(list);
               List<Integer> first = new ArrayList<>();
               List<Integer> second = new ArrayList<>();
               for(int i=list.size()-1;i>n/2;i--){
                   first.add(list.get(i));
               }

               for(int i=0;i<n;i++){
                   second.add(list.get(i));
               }

               boolean isNo = false;

              for(int i=0;i<first.size();i++){
                   for(int j=0;j<second.size();j++){
                       if(first.get(i)<=second.get(j)){
                           System.out.println("NO");
                           isNo= true;
                        //   System.out.println("Hello");
                           break;
                       }
                   }
                   if(isNo){
                       break;
                   }
              }

              if(!isNo)
               System.out.println("YES");

           }
}
