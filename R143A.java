package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *Round 143,Problem A
 */


import java.util.*;

public class R143A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][3];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		int[] solve = new int [n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				solve[i]+=a[i][j] ;
			}
		}
		
		int total =0;
		for(int i=0;i<n;i++){
			if(solve[i]>=2){
				total++;
			}
		}
		
		System.out.println(total);
		
		
	}
}
