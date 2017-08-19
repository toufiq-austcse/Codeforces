package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Round 163,Problem A,Stones On the Table
 */

import java.util.Scanner;

public class R163A {
	public static void main(String[] arg){
		Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s =sc.nextLine();
		int total =0;
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				total++;
			}
		}
		System.out.println(total);
	}

}
