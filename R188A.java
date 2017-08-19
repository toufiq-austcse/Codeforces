package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces, Round 188,Problem-A
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class R188A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long numberOfOddNumber = (n - n/2);
		//System.out.println(numberOfOddNumber);
		
		if(k<=numberOfOddNumber){
			System.out.println((2*k)-1);
		}
		else{
			System.out.println((k-numberOfOddNumber)*2);
		}
		
			}
	
	

}
