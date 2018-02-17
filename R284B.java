package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class R284B {


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

    static int index(String s,String[] arr){
    	      for(int i=0;i<arr.length;i++){
    	          if(arr[i].equals(s)){
    	              return i;
                  }
              }
              return -1;
    }
           public static void main(String[] args) {
               MyScanner sc = new MyScanner();
               int n = sc.nextInt();
               int m = sc.nextInt();
              // sc.nextLine();

               String[] first = new String[m];
               String[] second = new String[m];

               for(int i=0;i<m;i++){
                   String [] part = sc.nextLine().split(" ");
                   first[i] = part[0];
                   second[i] = part[1];
                /* first[i] = sc.nextLine();
                 second[i] = sc.nextLine();*/
               }

               String[] in = sc.nextLine().split(" ");
               List<String> list = new ArrayList<>();

               for(int i=0;i<in.length;i++){
                   int index = index(in[i],first);
                   String firstS = first[index];
                   String secondS = second[index];

                   if(firstS.length()==secondS.length()){
                       list.add(firstS);
                   }
                   else if(firstS.length()<secondS.length()){
                       list.add(firstS);
                   }
                   else if(secondS.length()<firstS.length()){
                       list.add(secondS);
                   }
               }

               for(int i=0;i<list.size();i++){
                   System.out.print(list.get(i)+" ");
               }
               System.out.println();
           }
}
