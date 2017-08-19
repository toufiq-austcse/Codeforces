/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.*;
public class R423A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a  =sc.nextLong();
		long b = sc.nextLong()*2;
		
		long totalPrsn=0;
	//	long totalTwoPrson =0;
		
		long[] arr = new long[(int) n];
		
		for(long i=0;i<n;i++){
			arr[(int) i] = sc.nextLong();
			if(arr[(int)i]==1){
				if(a!=0){
					a-=1;
				}
				else if(a==0 && b>0){
					b -=1;
				}
				
				else if(a==0 && b==0){
					totalPrsn++;
				}
			}
			
			else if(arr[(int)i]==2){
				if(b!=0 && b-2>=0){
					b-=2;
				}
				else{
					totalPrsn +=2;
				}
			}
		}
		
		System.out.println(totalPrsn);
		
		
	}
}
