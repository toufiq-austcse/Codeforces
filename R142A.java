package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.util.*;
import java.io.*;
public class R142A {

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

    static class Dragon implements Comparable<Dragon> {
    	      long strength;
    	      long bonas;

        public Dragon(long strength, long bonas) {
            this.strength = strength;
            this.bonas = bonas;
        }

        @Override
        public int compareTo(Dragon dragon) {
            return (int) (this.strength-dragon.strength);
        }
    }
           public static void main(String[] args) {
               MyScanner sc = new MyScanner();
               List<Dragon> dragons = new ArrayList<>();
               long s = sc.nextLong();
               long n = sc.nextLong();
               for(int i=0;i<n;i++){
                   Dragon dragon = new Dragon(sc.nextLong(),sc.nextLong());
                   dragons.add(dragon);
               }
               Collections.sort(dragons);
               boolean isWin = true;
              for(int i=0;i<n;i++) {


                  for(int j=0;j<dragons.size();j++){
                      Dragon d = dragons.get(j);

                      if(d.strength<s){
                          s+=d.bonas;
                          dragons.remove(d);
                      }
                  }

              }
              if(dragons.size()!=0){
                  System.out.println("NO");
              }
              else{
                  System.out.println("YES");
              }
           }
}
