package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.util.*;
import java.io.*;
public class R266A {

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
           MyScanner sc =  new MyScanner();
           int n = sc.nextInt();
           int m = sc.nextInt();
           int a = sc.nextInt();
           int b = sc.nextInt();

           int onlyA = (n*a);
           int onlyB =(n/m)*b+b;

		  int BageApore = (n/m)*b+(n-m*(n/m))*a;
		  List<Integer> list = new ArrayList<>();
		  list.add(onlyA);
		   list.add(onlyB);

		   list.add(BageApore);

		  // System.out.println(list);
		   Collections.sort(list);
		   System.out.println(list.get(0));

       }
}
