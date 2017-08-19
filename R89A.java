package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *Codeforces,Round 89,Problem A
 */

import java.util.Scanner;

public class R89A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		String o ="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='y'){
				
			}
			else{
				o+=s.charAt(i);
			}
		}
		for(int i=0;i<o.length();i++){
			System.out.print("."+o.charAt(i));
		}
		System.out.println();
		
	}

}
