/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;
import java.util.*;
public class R105A {
 public static void main(String[] arg){
	 Scanner sc = new Scanner(System.in);
	 int k = sc.nextInt();
	 int l = sc.nextInt();
	 int m = sc.nextInt();
	 int n = sc.nextInt();
	 int d = sc.nextInt();
	 
	 int count =0;
	 
	 for(int i=1;i<=d;i++){
		 if(i%k==0 || i%l==0||i%m==0 || i%n==0){
			 count++;
		//	 System.out.println(i);
			 
		 }
	 }
	 
	 //System.out.println();
	 System.out.println(count);
 }
	
}
