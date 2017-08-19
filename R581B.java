/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class R581B {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
	    
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		int max = a[n-1];
		
		for(int i=n-2;i>=0;i--){
			if(a[i]<=max){
				b[i] = (max+1)-a[i];
			}
			else{
				max = a[i];
				b[i] =0;
			}
		}
		b[n-1] =0;
		for(int i=0;i<b.length;i++){
		  System.out.print(b[i]+" ");
		}
	}
	
}
