/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Scanner;

public class R272A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n<m){
		  System.out.println("-1");
		}
		
		else{
			int steps;
			
			if(n%2==0){
				steps = n/2;
			}
			else{
				steps = n/2+1;
			}
			
			
			if(steps%m==0){
				System.out.println(steps);
			}
			else{
				while(steps%m!=0){
					steps++;
				}
				
				System.out.println(steps);
			}
			
		}
	}
}