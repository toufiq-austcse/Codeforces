/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Scanner;

public class R414A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		
		
		   int total =0;
			for(int i=0;i<n;i++){
				if(arr[i]>b && arr[i]<c){
					total++;
				}
			}
			
			System.out.println(total);
		
		
	}
}
