package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Educational Round 18, Problem A
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class ER18A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int[] diff = new int[n-1];
		for(int i=0;i<n-1;i++){
			diff[i] = Math.abs(a[i]- a[i+1]);
		}
		
		
		Arrays.sort(diff);
		int small =diff[0];
		int count =0;
		for(int i=0;i<diff.length;i++){
			if(small == diff[i]){
				count++;
			}
		}
		
		System.out.println(small+" "+count);
		
	}
}
