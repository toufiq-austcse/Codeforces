/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.*;
public class R304B {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int count =0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					arr[j]++;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
