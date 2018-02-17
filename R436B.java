package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class R436B {


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
               String s = sc.nextLine();
               char[] arr = s.toCharArray();

               Set<Character> set = new TreeSet<>();


               for(int i=0;i<s.length();i++){
                   if(Character.isLowerCase(s.charAt(i))) {
                       set.add(s.charAt(i));
                   }
               }

           //    List<Integer> capitalLetersPosition = new ArrayList<>();

               for(int i=0;i<arr.length;i++){
                   if((Character.isUpperCase(s.charAt(i)))){
                      arr[i]='-';
                   }
               }

               String ss = "";
               for(int i=0;i<arr.length;i++){
                   ss += arr[i];
               }


              String[] parts = ss.split("-");

              Iterator<Character> it = set.iterator();

              String lowercaseLetrs = "";

              while (it.hasNext()){
                  lowercaseLetrs += it.next();
              }
             //  System.out.println(lowercaseLetrs);

               List<String> Strings = new ArrayList<>();
              Set<Character> ch = new TreeSet<>();

              int ans =0;

             for(int i=0;i<parts.length;i++){

                 String b = parts[i];

                 for(int j=0;j<b.length();j++){
                     ch.add(b.charAt(j));
                 }

                 if(ch.size()>ans){
                     ans = ch.size();
                 }
                 ch.clear();


             }

               System.out.println(ans);



               //Hello world










           }
}
