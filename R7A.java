package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *Codeforces Round 7,Problem A,Infinite Sequence
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R7A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(); 
		long i=0;
		/*List<Long> list = new ArrayList<>();
		long i=1;
		long k=1;
		
		while(list.size()<=n){
			for(long j=1;j<=i;j++){
				list.add(k);
				k++;
			}
			i++;
			k=1;
		}
		
		System.out.println(list.get((int)n-1));*/
		
		while(n>i){
			
			n-=i;
			
			i++;
			
		}
		System.out.println(n);
		
		
	}
}
