/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.*;
public class R421A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int v0 = sc.nextInt();
		int v1 = sc.nextInt();
		int a = sc.nextInt();
		int l = sc.nextInt();
		
		int days=1;
		int readPage = v0,add = v0;
		
		
		while(readPage<c){
			add = Math.min(v1, add+a);
			readPage += add-l;
			///readPage -=l;
			//System.out.println(readPage);
			
			days++;
			
		}
		
		System.out.println(days);
		
		
		
		
		
	}
}
