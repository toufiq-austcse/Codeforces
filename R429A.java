package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class R429A {


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
  static  boolean isSame(List<String> l){
    	      String s="" ;
    	      for(int  i=0;i<l.size();i++){
    	          s+=l.get(i);
              }
             // boolean isFOund = false;
        for(int i=0;i<s.length();i++){
            String temp = Character.toString(s.charAt(i));
            for(int j=0;j<s.length();j++){
                if(i==j){
                    continue;
                }
                if(temp.equals(Character.toString(s.charAt(j)))){
                    return true;
                }
            }
        }
        return false;
    }
           public static void main(String[] args) {
               MyScanner sc = new MyScanner();
               int n = sc.nextInt();
               int k = sc.nextInt();

               String s = sc.nextLine();
               char[] arr = s.toCharArray();
               HashMap<String,Integer> map = new HashMap<>();
               for(int i=0;i<arr.length;i++){
                   char temp =arr[i];
                   int count =0;
                   for(int j=0;j<arr.length;j++){

                       if(temp==arr[j] && arr[j]!='-'){
                           count++;
                           arr[j] ='-';
                       }
                   }
                   map.put(Character.toString(temp),count);
               }

              // System.out.println(map);
               map.remove("-");
               List<Integer> list = new ArrayList<>();
               for (String key: map.keySet()) {
                  list.add(map.get(key));
               }
              // System.out.println(list);



            /*   if(map.containsValue(k+1)){
                   System.out.println("NO");
               }
               else{
                   System.out.println("YES");
               }*/

            for(int i=0;i<list.size();i++){
                if(list.get(i)>k){
                    System.out.println("NO");
                    return;
                }
            }

               System.out.println("YES");

           }
}
