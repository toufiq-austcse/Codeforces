/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Scanner;

public class ER21A {

	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		if(s.length()>1){
			
			int len = s.length();
			String firstCh= Character.toString(s.charAt(0));
			
			String first = Integer.toString(Integer.parseInt(firstCh)+1);
			
			for(int i=0;i<len-1;i++){
				first+="0";
			}
			
			int res = Integer.parseInt(first)-Integer.parseInt(s);
			System.out.println(res);
			
		}
		
		else if(s.length()==1){
			int next  = Integer.parseInt(s)+1;
			
			int res =next-Integer.parseInt(s);
			System.out.println(res);
		}
		
	}
}
