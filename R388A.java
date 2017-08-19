package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round 388,Problem-A
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R388A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		if(n==2){
			System.out.println(1);
			System.out.println(2);
		}
		else{
		
		if(n%2==0){
		           int a = n/2;
		           System.out.println(a);
		           for(int i=0;i<a;i++){
		        	   System.out.print(2+" ");
		           }
		           System.out.println();
		        		 
		}
		else{
			int i=n-3;
			int b =  i/2+1;
			System.out.println(b);
			while(i!=0){
				System.out.print(2+" ");
				i=i-2;
			}
			System.out.println("3");
		}
		}
	}

}
