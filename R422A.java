/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.math.BigInteger;
import java.util.*;
public class R422A {

	public static BigInteger fact(long a)
	{
	    BigInteger factorial = BigInteger.ONE;

	    BigInteger factz = BigInteger.valueOf(a);

	    if(a == 1)
	    {
	        return factorial;
	    }

	    else
	    {
	        return factz.multiply(fact(a-1));
	    }
	}
	
	public static void main(String[] arg){
		
		Scanner sc = new Scanner(System.in);
	
		long a = sc.nextLong();
		long b = sc.nextLong();
		if(a<b){
		System.out.println(fact(a).toString());
		}
		else{
			System.out.println(fact(b).toString());
		}
	}
}
