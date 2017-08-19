/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.*;
public class R424B {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String lay1 = sc.nextLine();
		String lay2 = sc.nextLine();
		String in = sc.nextLine();
		String small = in.toLowerCase();
		
		String out ="";
		for(int i=0;i<small.length();i++){
			
			if(small.charAt(i)>='0' && small.charAt(i)<='9'){
				out += small.charAt(i);
			}
			else{
			int ch =lay1.indexOf( small.charAt(i));
			
			if(in.charAt(i)>='A' && in.charAt(i)<='Z'){
			out += Character.toString(lay2.charAt(ch)).toUpperCase();
			}	
			else{
				out += lay2.charAt(ch);
			}
			//System.out.println(lay2.charAt(ch));
			}
		}
		System.out.println(out);
		
	}
}
