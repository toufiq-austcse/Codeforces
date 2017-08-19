package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces ROund 173,Problem A
 */

import java.util.Scanner;

public class R173A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int x =0;
		for(int i=0;i<n;i++){
			String s = sc.nextLine();
			
			if(s.length()==3 && (s.contains("++X") || s.contains("X++"))){
				x++;
			
			}
			else if(s.length()==3 && (s.contains("--X") || s.contains("X--"))){
				x--;
			
			}
		}
		System.out.println(x);
		
		
	}

}
