package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *Codeforces,Round 197, Problem - A
 */

import java.util.Arrays;
import java.util.Scanner;

public class R197A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		String[] arr = s.split("\\+");
		//Arrays.sort(arr);
	   int[] a = new int[s.length()];
	   for(int i=0;i<arr.length;i++){
		   a[i] =Integer.parseInt(arr[i]);
	   }
	  Arrays.sort(a);
	  String out ="";
	  for(int i= 0;i<a.length;i++){
		 if(a[i]!=0){
			 if(i!=a.length-1){
			out+=a[i]+"+";
			 }
			 else{
				 out+=a[i];
			 }
		 }
	  }
	  System.out.println(out);
	}
}
