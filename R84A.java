package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces Round 84,Problem -A
 */

import java.util.Scanner;

public class R84A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int total =0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='4' || s.charAt(i)=='7'){
				total++;
				
			}
		}
		
		if(total>0){
	if(total ==4 || total ==7 || total%47==0 ){
		System.out.println("YES");
	}
	
	else{
		System.out.println("NO");
	}
		}
		else{
			System.out.println("NO");
		}
	
	
		
	}

}
