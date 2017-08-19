/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Scanner;

public class R172A {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		ch[0] = Character.toUpperCase(ch[0]);
		
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
		System.out.println();
	}
}
