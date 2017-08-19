package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Round 95, problem A, cAPS lOCK
 */

import java.util.Scanner;

public class R95A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		boolean islowaercase = false;
		int count =0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
				count++;;
			}
			
		}
		if(count==s.length()){
			System.out.println(s.toLowerCase());
		}
		else if(count==s.length()-1 && s.charAt(0)>='a' && s.charAt(0)<='z'){
		// if(s.charAt(0)>='a' && s.charAt(0)<='z'){
			String[] a = new String[s.length()];
			for(int i=0;i<s.length();i++){
				a[i] = Character.toString(s.charAt(i));
				if(i==0){
					a[i]=a[i].toUpperCase();
				}
				else{
					a[i]=a[i].toLowerCase();
				}
				
			}
			for(int i=0;i<s.length();i++){
				System.out.print(a[i]);
			}
			System.out.println();
		//}
		}
		else{
			System.out.println(s);
		}
		
	}

}
