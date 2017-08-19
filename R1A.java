package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces round 1,Problem- A
 */

import java.util.Scanner;

public class R1A {
public static void main(String[] arg){
	long a,b,n;
	Scanner sc = new Scanner(System.in);
	a = sc.nextLong();
	b = sc.nextLong();
	n = sc.nextLong();
	if(n==1){
		System.out.println(a*b);
	}
	else{
  
    double temp1 =	 Math.ceil( a/(double)n);
    double temp2 =	 Math.ceil( b/(double)n);
    long ans = (long) (temp1*temp2);
    
    System.out.println(ans);
	}
}
}
