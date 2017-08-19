/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class R196A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m];
		for(int i=0;i<m;i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<m-n+1;i++){
			min = Integer.min(min, arr[n+i-1]-arr[i]);
		}
		
		System.out.println(min);
	}
}
