package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.util.*;
public class R436A {


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
               int[] arr = new int[n];

               Set<Integer> set = new TreeSet<>();

               for(int i=0;i<n;i++){
                   arr[i] = sc.nextInt();
                   set.add(arr[i]);
               }

               if(set.size()==2){
                   List<Integer> list = new ArrayList<>();
                   List<Integer> list1 = new ArrayList<>();

                   Iterator<Integer> it = set.iterator();

                   while (it.hasNext()){
                       int a = it.next();
                       list1.add(a);
                       int count =0;

                       for(int i=0;i<n;i++){
                           if(arr[i]==a){
                             count++;
                           }
                       }

                       list.add(count);

                   }

                   if(list.get(0)+list.get(1)!=n){
                       System.out.println("NO");
                   }
                   else if(list.get(0)+list.get(1)==n){
                       if(list.get(0)==list.get(1)){
                           System.out.println("YES");
                          for(int i=0;i<list1.size();i++){
                              System.out.print(list1.get(i)+" ");
                          }
                       }
                       System.out.println();
                   }
               }
               else{
                   System.out.println("NO");
               }
           }
}
