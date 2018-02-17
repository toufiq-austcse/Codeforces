package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class R392B {


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



              List<Integer> list = new ArrayList<>();

             String temp ="";
              int i=0;

               while(s.charAt(i)=='!'){
                   i+=4;

               }


              temp += Character.toString(s.charAt(i));
              i=1;

               while(s.charAt(i)=='!'){
                   i+=4;

               }

               temp += Character.toString(s.charAt(i));

               i=2;
               while(s.charAt(i)=='!'){
                   i+=4;

               }
               temp += Character.toString(s.charAt(i));

               i=3;

               while(s.charAt(i)=='!'){
                   i+=4;

               }
               temp += Character.toString(s.charAt(i));

               String temp1 ="";

               while (temp1.length()<=s.length()){
                   temp1+=temp;
               }

              int r=0,b=0,y=0,g=0;

               for(int k=0;k<s.length();k++){
                   if(s.charAt(k)=='!' && temp1.charAt(k)=='R'){
                       r++;
                   }
                   else  if(s.charAt(k)=='!' && temp1.charAt(k)=='B'){
                       b++;
                   }
                   else  if(s.charAt(k)=='!' && temp1.charAt(k)=='Y'){
                       y++;
                   }
                   else  if(s.charAt(k)=='!' && temp1.charAt(k)=='G'){
                       g++;
                      // System.out.println(temp1.charAt(k));
                   }


               }

               System.out.println(r+" "+b+" "+y+" "+g);


           }
}
