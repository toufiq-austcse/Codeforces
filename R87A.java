/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;
import java.util.*;
public class R87A {

	public static void main(String[] arg){
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		int maxPas =0;
		int totalPas =0;
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			int b= sc.nextInt();
			totalPas-=a;
			totalPas +=b;
			if(totalPas>maxPas){
				maxPas = totalPas;
			}
		}
		System.out.println(maxPas);		
				
	}
}
