package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round 40,problem -A
 */

import java.util.Scanner;

public class R40A {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		String rev = new StringBuffer(t).reverse().toString();
		
		if(s.matches(rev)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}

}
