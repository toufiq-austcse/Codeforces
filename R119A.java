package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.util.*;
import java.io.*;
public class R119A {

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
           List<Integer> list = new ArrayList<>();
           int n = sc.nextInt();
           list.add(sc.nextInt());
           list.add(sc.nextInt());
           list.add(sc.nextInt());
           Collections.sort(list);
		   int total=0;
           int count =0;
		   total = n/list.get(0);
		   n =n-(total*list.get(0));
           list.remove(0);
           Collections.sort(list);
           count++;

        //   System.out.println(count);
           if(list.get(0)<=n){
           	total = n/list.get(0);
               n =n-(total*list.get(0));
               list.remove(0);
               count++;
             //  System.out.println(count);
           }
           if(list.get(0)<=n){
			   total = n/list.get(0);
			   n =n-(total*list.get(0));
               list.remove(0);
               count++;
              // System.out.println(count);
           }
           System.out.println(total);

       }
}
