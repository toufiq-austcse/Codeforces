package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *Codeforces,Round 407, Problem -A
 */

/*
 * at first we need to calculate how many pockets need to collect each Type of pebbles.and sum them ,,
 * then ,we know , 2 pockets can use in 1   days
 *                 1 "        "   "   " 1/2   "
 *              so sum "      "    "  "  sum/2  days 
 */

import java.util.Scanner;

public class R407A {

	public static void main(String[] arg){
		Scanner sc  = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		
             
		long total =0;
		for(int i=0;i<n;i++){
			long a = sc.nextLong();
			total += Math.ceil(a/(double)k);
			
			
		}
		
		long ans = (long) Math.ceil(total/(double)2);
		
		
	  System.out.println(ans);
		
	}
		

}
