package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces Round 77,Problem A
 */

import java.util.Scanner;

public class R77A {

	public static void main(String[] arg){
		Scanner sc = new  Scanner(System.in);
		String s = sc.nextLine();
		boolean isDen = false;
		int total=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='0'){
				total++;
			}
			else{
				total=0;
			}
			if(total>=7){
				break;
			}
		}
		if(total>=7){
          System.out.println("YES");
		}
		else	if(total!=7){
			int total1=0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='1'){
					total1++;
				}
				else{
					total1=0;
				}
				if(total1>=7){
					break;
				}
			}
			if(total1>=7){
			System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}
