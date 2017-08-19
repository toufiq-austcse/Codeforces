package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,ROund 384,Problem A
 */

import java.util.Scanner;

public class R384A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		if(s.charAt(a-1)==s.charAt(b-1)){
			System.out.println("0");
		}
		else{
			System.out.println("1");
		}
		
	}

}
