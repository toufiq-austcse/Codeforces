package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round 364,Problem A
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class R364A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		int total =0;
		
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
			total+=a[i];
		}
		
		int givenEach =total/(n/2);
	
		for(int i=0;i<n+1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==givenEach){
					System.out.println((i+1)+" "+(j+1));
					a[j]=0;
					break;
				}
				
			}
		}
		
		
	}

}
