/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class R412A {

	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a= new int[n+1];
		int[] newRating = new int[n+1];
		
		for(int i =1;i<n+1;i++){
			a[i] = sc.nextInt();
			newRating[i] = sc.nextInt();
		}
		
		
		boolean isRated = false;
		
		
		for(int i=1;i<n+1;i++){
			if(a[i]!=newRating[i]){
				System.out.println("rated");
				isRated = true;
				
				break;
			}
			
		}
		
	
		boolean isUnrated = false;		
		if(!isRated){
			for(int i=1;i<n;i++){
				if(newRating[i]<newRating[i+1]){
					System.out.println("unrated");
					isUnrated = true;
					break;
				}
			}
			
			if(!isUnrated){
				System.out.println("maybe");
			}
		}


	
}
}
