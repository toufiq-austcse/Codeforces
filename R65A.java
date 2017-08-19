package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Round 65,Problem A,Way Too Long Words
 */

import java.util.Scanner;

public class R65A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
		String s = sc.nextLine();
		if(s.length()>10){
			int len = s.length()-2;
			String first =Character.toString(s.charAt(0));
			String last =Character.toString(s.charAt(s.length()-1));
			System.out.println(first+len+last);
			
		}
		else{
			System.out.println(s);
		}
		}
	}

}
