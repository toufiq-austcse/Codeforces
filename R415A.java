/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Scanner;

public class R415A {

	public static void main(String[] arg){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		int sum =0;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
			sum  +=arr[i];
		}
		
		
		int total =sum;
		
		if((Math.round(total/(double)(n))==k)){
			System.out.println(0);
			
		}
		else{
		
		for(int i=1;;i++){
			total +=k;
			if((Math.round(total/(double)(n+i))==k)){
				System.out.println(i);
				break;
			}
		}
		}
	}
}
