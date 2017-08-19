/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Scanner;

public class R126B {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		double sum =0;
		
		for(int i=0;i<n;i++){
			sum+= a[i]/100.0;
		}
		
	    double res = (sum/n)*100;
	    
	    System.out.printf("%.13f",res);
	}

}
