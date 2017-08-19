package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces ,Round 85,Problem -A
 */

import java.util.Scanner;

public class R85A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
			String first = sc.nextLine().toLowerCase();
		    String Second = sc.nextLine().toLowerCase();
		    int result =0;
		   if(first.contains(Second)){
		    System.out.println(0);
		   }
		   else{
			   for(int i=0;i<first.length();i++){
				   if(first.charAt(i)>Second.charAt(i)){
					   System.out.println(1);
					   break;
				   }
				   else if(first.charAt(i)<Second.charAt(i)){
					   System.out.println(-1);
					   break;
				   }
			   }
		   }
	}
	
}
