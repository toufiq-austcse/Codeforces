package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Round 352, Problem A, Summer Camp
 */

import java.util.Scanner;

public class R352A {
	public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String[] a = new String[n+2];
	String s ="";
	for(int i=0;i<n+2;i++){
		a[i]=Integer.toString(i);
		s+=a[i];
	}
	System.out.println(s.charAt(n));
	}

}
