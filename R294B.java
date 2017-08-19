package CodeForces;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *CodeForces Round 294 ,probelm B
 */


public class R294B {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int aSum = 0;
		int bSum =0;
		int cSum =0;
		
		int n= sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n-1];
		int[] c = new int[n-2];
		int [] d = new  int[2];
		
		for(int i=0;i<a.length;i++){
		   aSum+= sc.nextInt();
		}
		

		for(int i=0;i<b.length;i++){
			bSum+= sc.nextInt();
		}
		
		list.add(aSum-bSum);
		

		for(int i=0;i<c.length;i++){
			 cSum+= sc.nextInt();
		}
		list.add(bSum-cSum);
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}
}
