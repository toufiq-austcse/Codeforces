package CodeForces;

 /*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * Codeforces,Educational Round 3,Problem A
 */

			

import java.util.Arrays;
import java.util.Scanner;

public class E3 {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int sum =0;
		int i=0;
		int count =0;
		for( i=n-1;i>=0;i--){
			sum +=arr[i];
			
			count++;
			if(sum>=m){
				break;
			}
			
			
		}
		
		System.out.println(count);
	}
}
