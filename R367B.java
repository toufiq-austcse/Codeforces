package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *Codeforces,Round 367,Problem -A
 */

import java.util.Arrays;
import java.util.Scanner;

public class R367B {
	
	public int search(int[] a ,int k){
		int startPoint = 0;
		int endpoint =a.length-1;
		while(startPoint<=endpoint){
			int mid = (startPoint+endpoint)/2;
			if(a[mid]== k){
				//System.out.println("Location "+mid);
				return startPoint+1;
			}
			else if(k> a[mid]){
				//System.out.println("Location "+mid);
				startPoint = mid+1;
			}
			else{
				
				endpoint = mid-1;
				//System.out.println("Location "+mid);
			}
		}
		
		return startPoint;
	}
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i=0;i<x.length;i++){
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		int q = sc.nextInt();
		int[] m = new int[q];
		R367B ob = new R367B();
		for(int i=0;i<m.length;i++){
			int in = sc.nextInt();
			System.out.println(ob.search(x, in));
		}
		
		
		
	}

}
