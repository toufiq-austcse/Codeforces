package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces Round 271,Problem-A
 */

import java.util.Scanner;

public class R271A {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String def = "qwertyuiopasdfghjkl;zxcvbnm,./";
		String s = sc.nextLine();
		String inp = sc.nextLine();
		String out = "";

		
			if (s.contains("R")) {
				for (int i = 0; i < inp.length(); i++) {
				if (inp.charAt(i) == 'q' || inp.charAt(i) == 'a' || inp.charAt(i) == 'z') {
					out += inp.charAt(i);
				} 
				else {
					char c = inp.charAt(i);
					int pos = def.indexOf(c);
					char ch = def.charAt(pos - 1);
					out += ch;
				}
				}
				System.out.println(out);
			}
			
			else if(s.contains("L")){
				for (int i = 0; i < inp.length(); i++) {
				
				/*if (inp.charAt(i) == 'q' || inp.charAt(i) == 'a' || inp.charAt(i) == 'z') {
					out += inp.charAt(i);
				} */
				//else {
					char c = inp.charAt(i);
					int pos = def.indexOf(c);
					char ch = def.charAt(pos + 1);
					out += ch;
					
			///	}
				}
				System.out.println(out);	
			}
		

		
	}

}
