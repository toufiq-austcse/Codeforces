package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces, Round 166,Problem -A
 */

import java.util.HashSet;
import java.util.Scanner;

public class R166A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isfound = false;
        int i =n+1;
        int total =0;
        HashSet<Character> set = new HashSet<>();
       while(!isfound){
          String s = Integer.toString(i);
          for(int j=0;j<s.length();j++){
        	 set.add(s.charAt(j));
	
        }	
          if(set.size()==4){
        	 
        	  System.out.println(i);
        	  break;
          }
          else{
          i++;
          set.clear();
          }
          
       }
			
	}
		
		
		
	

}
