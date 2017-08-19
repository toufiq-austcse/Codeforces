package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round 304,Problem-A
 */

import java.util.Scanner;

public class R304A {
public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	long k =sc.nextLong();
	long n =sc.nextLong();
	long w =sc.nextLong();
	int total =0;
	for(int i=1;i<=w;i++){
		total+= i*k;
	}
	if(total<n){
		System.out.println("0");
	}
	else{
		
	
	System.out.println(total-n);
	}
	
}
}
