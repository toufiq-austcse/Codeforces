/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.*;

public class R258B {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr  = new int[n];
		int[] temp  = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt(); 
			
		}
		
		for(int i=0;i<arr.length;i++){
			temp[i] = arr[i];
		}
		
	    Arrays.sort(arr);
		List<Integer> list = new ArrayList<>();
		List<Integer> revrs = new ArrayList<>();
		for(int i=0;i<n;i++){
			if(arr[i]!=temp[i]){
				list.add(i);
				System.out.println(arr[i]);
			}
			
			if(arr[i]==temp[i]){
				break;
			}
		}
		
		
		
	System.out.println(revrs);
	
	}

}
