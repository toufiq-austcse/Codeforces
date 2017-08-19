package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class R262A {


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
    static int days(int start,int finish,int day){
    	      int count =0;
    	      for(int i=start;i<=finish;i++){
    	          if(i%day==0){
    	              count++;
                  }
              }
              return  count;
    }

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int totalDays = n;
        List<Integer> list = new ArrayList<>();


        int suru =1;
        int ses =n;
        int count =0;
        while (true){
            if(days(suru,ses,m)>0){
                count= days(suru,ses,m);
                list.add(count);
            }
            else {
                break;
            }

            suru = ses+1;
            ses = ses +count;


        }

        if((m-n)==1){
            System.out.println(n);
        }
        else {
            for(int i=0;i<list.size();i++){
                n+=list.get(i);
            }
            System.out.println(n);
        }



		}






}
