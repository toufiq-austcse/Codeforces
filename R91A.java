package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces, Round 91,Problem A
 */

import java.util.Scanner;

public class R91A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n%4 ==0 || n%7 ==0 || n%47==0){
			System.out.println("YES");
		}
		else{
			String s = Integer.toString(n);
			boolean isLucky =true;
			for(int i=0;i<s.length();i++){
               if(s.charAt(i)!='4'&& s.charAt(i)!='7'){
            	  isLucky = false;
            	   System.out.println("NO");
            	   break;
               }
                
			}
			if(isLucky){
			System.out.println("YES");
			
			}
			
			
		}
	}

}
