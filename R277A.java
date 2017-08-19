package CodeForces;

import java.util.Scanner;
/*
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *CodeForces Round 277 ,Problem A
 */

public class R277A {
 
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++){
			double a = (double)i;
			sum+= Math.pow(-1, a)*i;
			
					
		
		}
		System.out.println((int)sum);
		
		
	}

}
