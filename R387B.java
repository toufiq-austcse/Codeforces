package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round 387,Problem A
 */

import java.util.Scanner;

public class R387B {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		
		
		
		if(n%4==0){
			int perALpha = n/4;
			
			int qs = 0;
			int a =0;
			int g =0;
			int c =0;
			int t =0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='?'){
					qs++;
				}
				else if(s.charAt(i) =='A'){
					a++;
				}
				else if(s.charAt(i) =='G'){
					g++;
				}
				else if(s.charAt(i) =='C'){
					c++;
				}
				else if(s.charAt(i) =='T'){
					t++;
				}
			}
			
			//System.out.println("QS "+qs+" A  "+a+" G "+g+" C "+c+" T "+t);
			for(int i=0;i<n;i++){
				if(ch[i]=='?'){
					
					
					if(a!=perALpha){
						ch[i]='A';
						a++;
					}
					else if(g!=perALpha){
						ch[i]='G';
						g++;
					}
					else if(c!=perALpha){
						ch[i]='C';
						c++;
					}
					else	if(t!=perALpha){
						ch[i]='T';
						t++;
					}
				}
			}
			if(a==perALpha && g==perALpha && c==perALpha && t==perALpha){
				for(int i=0;i<ch.length;i++){
					System.out.print(ch[i]);
				}
				System.out.println();
			}
			else{
				System.out.println("===");
			}
			
		}
		else{
			System.out.println("===");
		}
		
	}
}
