package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class R306A {


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
               String s = sc.nextLine();
              char[] temp = s.toCharArray();
              char[] temp1 = s.toCharArray();

               List<String> list = new ArrayList<>();



              for(int i=0;i<temp.length;i++) {

                  if(i+1<temp.length){
                      if(temp[i]=='A' && temp[i+1]=='B'){
                          list.add("AB");
                          temp[i]='-';
                          temp[i+1] ='-';
                          break;
                      }
                  }
              }






               for(int i=0;i<temp.length;i++) {
                   if(i+1<temp.length){
                       if(temp[i]=='B' && temp[i+1]=='A'){
                           list.add("BA");
                           temp[i]='-';
                           temp[i+1] ='-';
                           break;
                       }
                   }
               }
               boolean isFound = false;


               if(list.contains("AB") && list.contains("BA")){
                   System.out.println("YES");
                   isFound = true;
               }
               else{
                   List<String> list1 = new ArrayList<>();

                   for(int i=0;i<temp1.length;i++) {

                       if(i+1<temp1.length){
                           if(temp1[i]=='B' && temp1[i+1]=='A'){
                               list1.add("BA");
                               temp1[i]='-';
                               temp1[i+1] ='-';
                               break;
                           }
                       }
                   }






                   for(int i=0;i<temp1.length;i++) {
                       if(i+1<temp1.length){
                           if(temp1[i]=='A' && temp1[i+1]=='B'){
                               list1.add("AB");
                               temp1[i]='-';
                               temp1[i+1] ='-';
                               break;
                           }
                       }
                   }

                   if(list1.contains("AB") && list1.contains("BA")){
                       System.out.println("YES");
                       isFound = true;
                   }
                   else{
                       System.out.println("NO");
                   }


               }



           }
}
