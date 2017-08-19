/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class R54A {
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
	
	public static void main(String[] arg){
	      MyScanner sc = new MyScanner();
	      String s = sc.nextLine();
	      
	      String a= "hello";
	      
	      boolean h = false;
	      boolean e = false;
	      boolean l1 = false;
	      boolean l2 = false;
	      boolean o = false;
	      
	      for(int i=0;i<s.length();i++){
	    	  if(s.charAt(i)=='h'){
	    		  h = true;
	    	  }
	    	  else if(s.charAt(i)=='e' && h){
	    		  e = true;
	    	  }
	    	  else if(s.charAt(i)=='l' && e && h){
	    		if(l1==false && l2==false){
	    			l1 = true;
	    		}
	    		else if(l1== true && l2==false)
	    		  l2 = true;
	    	  }
	    	  else if(s.charAt(i)=='o' && e && h && l1 && l2){
	    		  o = true;
	    	  }
	    	  
	    	 
	      }
	      
	      if(h && e && l1 && l2 && o){
	    	  System.out.println("YES");
	      }
	      else{
	    	 System.out.println("NO");
	      }
		
	}

}
