package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * CodeForces,Round 38,Problem A
 */

				
import java.util.Scanner;

public class R38A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n-1;i++){
			
			arr[i] = sc.nextInt();
		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum =0;
		for(int i=a-1;i<b-1;i++){
		sum+=arr[i];
		}
		System.out.println(sum);
	}

}
