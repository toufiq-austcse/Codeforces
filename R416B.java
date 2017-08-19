/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class R416B {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
	   int n = sc.nextInt();
	   int m = sc.nextInt();
	   
	   int[] arr = new int[n];
	   
	   for(int i=0;i<n;i++){
		   arr[i] = sc.nextInt();
	   }
	   
	   
	   for(int i=0;i<m;i++){
		   int l = sc.nextInt();
		   int r = sc.nextInt();
		   int x = sc.nextInt();
		   
		   int count =0;
		   for(int j=l-1;j<r;j++){
			   if(arr[j]<arr[x-1]){
				  count++; 
			   }
			  
		   }
		   
		   if(count==x){
			   System.out.println("Yes");
		   }
		   else{
			   System.out.println("No");
		   }
		  
	   }
		
		
		

     
		
		
		
			
		
	}
}
