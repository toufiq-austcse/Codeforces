/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R163B {
	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		for(int i=1;i<=t;i++){
			List<Integer> list = new ArrayList<>();
			
			for(int j=0;j<arr.length;j++){
				if(arr[j]=='B'){
					list.add(j);
				}
			}
			
			for(int j=0;j<list.size();j++){
				int index = list.get(j);
				if(index+1<arr.length){
					if(arr[index+1]=='G'){
						char temp = arr[index];
						arr[index] = arr[index+1];
						arr[index+1] = temp;
					}
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}

}
