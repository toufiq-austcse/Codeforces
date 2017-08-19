package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round-55,Problem-A
 */

import java.util.Scanner;

public class R55A {
	
	public static void main (String[] arg){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String a = s.toUpperCase();
		int lowarCAse =0;
		int uppercase =0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=a.charAt(i)){
				lowarCAse++;
			}
			else{
				uppercase++;
			}
		}
		
		if(lowarCAse>uppercase){
			System.out.println(s.toLowerCase());
		}
		else if(uppercase>lowarCAse){
			System.out.println(s.toUpperCase());
		}
		else{
			System.out.println(s.toLowerCase());
		}
		
	}

}
