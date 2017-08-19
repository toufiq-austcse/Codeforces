/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Scanner;

public class R80A {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[1];
		
		for(int i=n+1;i<=m;i++){
			boolean isPrime = true;
			
			for(int j=2 ; j<i;j++){
				if(i%j==0){
					isPrime = false;
					break;
				}
			}
			
			if(isPrime){
				a[0] = i;
				break;
			}
		}
		
		if(a[0]==0){
			System.out.println("NO");
		}
		else if(a[0]==m){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
	}

}
