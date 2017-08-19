/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ER21B {

	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		long sum =0;
		
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			list.add(a);
			if(i>0 && i<(n-1)){
				sum+= 2*a;
			}
			
		}
		
		if(list.size()==1){
			double res =(double)list.get(0);
			System.out.printf("%.10f",res);
		}
		else{
		double finalRes=(sum+list.get(0)+list.get(list.size()-1))/(double)((n-b)+1);
		System.out.printf("%.10f",finalRes);
		}
		
	}
}
