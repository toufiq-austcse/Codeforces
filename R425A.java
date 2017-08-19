/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;
import java.util.*;
public class R425A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		long res = n/k;
		
		if(res%2==0){
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
		}
	}
}
