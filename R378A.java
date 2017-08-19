package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round 3778,Problem -A
 */

import java.util.Scanner;

public class R378A {

	public static void main(String[] main){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] a = new int[s.length()+1];
		int high =0;
		for(int  i=0;i<s.length();i++){
			if(s.charAt(i)!='A'||s.charAt(i)!='E'||s.charAt(i)!='I'||s.charAt(i)!='O'||s.charAt(i)!='U'||s.charAt(i)!='Y'){
				high = Math.max(high, i-high);
			}
			else{
				high  =0;
			}
		}
		
		System.out.println(high);
	}
}
