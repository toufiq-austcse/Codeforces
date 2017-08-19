package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class R186A {

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
               String s  = sc.nextLine();
               char[] arr = s.toCharArray();
               String ans1="";
               String ans2="";
               for(int i=0;i<arr.length-1;i++){
                   ans1 +=arr[i];
               }


               for(int i=0;i<arr.length;i++){
                   if(i==arr.length-2){
                       continue;
                   }
                   ans2 +=arr[i];
               }

              List<Integer> list = new ArrayList<>();

                   int temp = Integer.parseInt(ans2);
                   list.add(temp);



                  temp = Integer.parseInt(ans1);
                   list.add(temp);


               list.add(Integer.parseInt(s));

               Collections.sort(list);
               System.out.println(list.get(list.size()-1));

           }
}
