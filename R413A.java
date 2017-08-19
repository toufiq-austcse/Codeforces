/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Scanner;

public class R413A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //total cake needed
		
		
		int t = sc.nextInt();
		int k = sc.nextInt();
		int d = sc.nextInt();
		
		int totalTime = 0;
		int sum =0;
		
		boolean isExtraOvenNeeded = true;
		
		while(totalTime<=d){
			totalTime +=t;
			sum+=k;
			
			if(sum>=n){
				isExtraOvenNeeded = false;
			}
		}
		
		if(isExtraOvenNeeded){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	
	}
}
