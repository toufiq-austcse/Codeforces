package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces VK Cup 2012,Problem-A
 */

import java.util.Scanner;

public class VKCUP2012A {
public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	long n = sc.nextLong();
	long k = sc.nextLong();
	long total =0;
	long[] a = new long[(int)n];
	for(int i=0;i<n;i++){
		a[i] = sc.nextLong();
	}
	
	long temp =  a[(int) (k-1)];
	for(int i =0;i<n;i++){
		if(a[i]>=temp && a[i]!=0){
			total++;
		}
	}
	
	System.out.println(total);
	
}
}
