package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * codeforces,Round 357, Problem-A
 */

import java.util.Scanner;

public class R357A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String [] a = new String[n];
		for(int i=0;i<n;i++){
			
			a[i]= sc.nextLine();
			
			
		}
	boolean isIncreased = true;
		
		for(int i=0;i<a.length;i++){
			String[] s = a[i].split(" ");
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
		//	System.out.println(s[1]+" "+s[2]);
			if(b>=2400 && c>b){
				System.out.println("YES");
				isIncreased = true;
				break;
				
			}
			else{
				isIncreased = false;
			}
			
			
			
		}
		
		if(!isIncreased){
			System.out.println("NO");
		}
	}
}
