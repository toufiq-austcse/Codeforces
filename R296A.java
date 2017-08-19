/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Scanner;

public class R296A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		int count =0;
		while(a>0 && b>0){
			if(a>=b){
				a = a-b;
			}
			else{
				b = b-a;
			}
			
			count++;
		}
		
		System.out.println(count);
	}
}
