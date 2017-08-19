package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *Codeforces,Round-14 ,Problem -A
 */

import java.util.Scanner;

public class R14A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		if(a.length==1 && a[0]==0){
			System.out.println("NO");
		}
		if(a.length==1 && a[0]==1){
			System.out.println("YES");
		}
		else if(a.length>1){
			
				int total =0;
				for(int i=0;i<a.length;i++){
					if(a[i]==0){
						total++;
					}
				}
				if(total==1){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
				
			
		}
		
	}

}
