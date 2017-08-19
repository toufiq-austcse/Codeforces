/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.Scanner;

public class R416A {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int vladik = sc.nextInt();
		int valera = sc.nextInt();
		
		int f = 1;
		while(true){
			
			
			if(f%2==0){
				valera -=f;
			}
			else{
				vladik -=f;
			}
			f++;
			
			
			if(valera<0){
				System.out.println("Valera");
				break;
			}
			else if(vladik<0){
				System.out.println("Vladik");
				break;
			}
			
		}
	}

}
