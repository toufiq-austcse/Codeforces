package CodeForces;


import java.util.*;
import  java.io.*;
/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class R340A {

    	/*
    		  Code for faster input
    		 */


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
    	 static int binarySearch(int[] arr,int left,int right,int x ){

    	        if(left<=right){
    	            int mid = (left+(right-left))/2;
    	            if(arr[mid]==x){
    	                return  mid;
    	            }
    	            if(arr[mid]<x){
    	                left = mid+1;
    	            }
    	            else{
    	                right = right-1;
    	            }
    	        }
    	        return -1;
    	    }

    public static void main(String[] args) {
    	     MyScanner sc = new MyScanner();
    	     long n = sc.nextLong();
    	     List<Long> list = new ArrayList<>();

    	    for(int i=5;i>=1;i--){
    	        list.add(n/i);
    	        n = n%i;
            }


            long total = 0;
         for(int i=0;i<list.size();i++){
    	        total += list.get(i);
        }
        System.out.println(total);


    }

}
