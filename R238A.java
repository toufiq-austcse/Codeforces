package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class R238A {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
