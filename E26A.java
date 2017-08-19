/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Scanner;

public class E26A {
	static int capitalLtrNmbr(String a){
		int total =0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)>='A' && a.charAt(i)<='Z'){
				total++;
			}
		}
return  total;
	}
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] s = sc.nextLine().split(" ");
		int total =0;
		
		for(int j=0;j<s.length;j++){
		int b=	capitalLtrNmbr(s[j]);
		if(b>total){
			total = b;
		}
		}
		
		System.out.println(total);
	}

}
