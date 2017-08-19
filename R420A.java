/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;
import java.util.*;
public class R420A {
	
	public static boolean isValid(int[][] arr,int row,int column){
		if(arr[row][column]==1){
			return true;
		}
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[row][column]== arr[row][i]+arr[j][column]){
					return true;
				}
			}
		}
		
		return false;
	}
	
	

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(isValid(a, i, j)==false){
					System.out.println("No");
					return;
				}
			}
		}
		
		System.out.println("Yes");
		
		
	}
}
