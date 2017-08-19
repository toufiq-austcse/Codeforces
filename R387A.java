package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round 387,Problem A
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class R387A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++){
			if(n%i==0){
				list.add(i);
			}
		}
		
		Collections.sort(list);
		
	//	System.out.println(list);
		//int[] a = new int [list.size()];
		for(int i=0;i<list.size();i++){
			boolean isFoound = false;
			if(list.get(i)*list.get(i)==n){
				System.out.println(list.get(i)+" "+list.get(i));
				break;
			}
			else{
				boolean isFound = false;
				for(int j=0;j<list.size()-1;j++){
					if(list.get(j)<list.get(j+1)  && list.get(j)*list.get(j+1)==n ){
						System.out.println(list.get(j)+" "+list.get(j+1));
						isFoound = true;
						break;
					}
					
				
				}
			}
			
			if(isFoound){
				break;
			}
		}
		
	}

}
