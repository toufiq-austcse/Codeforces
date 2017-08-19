/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class R101A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		String first = sc.nextLine();
		String second = sc.nextLine();
		String third = sc.nextLine();
		
		if(first.length()+second.length()==third.length()){
			
			
			char[] thirdAr = third.toCharArray();
			
			String firstplusSecond = first.concat(second);
			char[] firstplusSecondArr = firstplusSecond.toCharArray();
			
		//	System.out.println(firstplusSecond);
			
			//Arrays.sort(firstAr);
		//	Arrays.sort(secondAr);
			Arrays.sort(firstplusSecondArr);
			Arrays.sort(thirdAr);
			
			boolean isFound = true;
			for(int i=0;i<thirdAr.length;i++){
				if(thirdAr[i]!=firstplusSecondArr[i]){
					System.out.println("NO");
					isFound = false;
					break;
				}
			}
			
			if(isFound){
				System.out.println("YES");
			}
			
			
			
			
				
			
			
			
		}
		else{
			System.out.println("NO");
		}
		
	   
	}
}
