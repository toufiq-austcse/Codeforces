/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.*;
public class R424A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		
		for(int i=0;i<list.size();i++){
			if(i+1<list.size()){
				if(list.get(i)<list.get(i+1)){
					list1.add(1);
				}
				
				else if(list.get(i)==list.get(i+1)){
					list1.add(2);
				}
				
				else if(list.get(i)>list.get(i+1)){
					list1.add(3);
				}
			}
			
			
		}
		
		System.out.println(list1);
		
		boolean isRight = true;
		for(int i=0;i<list1.size();i++){
			if(i+1<list1.size()){
				if(list1.get(i)>list1.get(i+1)){
					isRight = false;
				}
			}
		}
		
		if(isRight){
			System.out.println("YES");
		}
		
		else{
			System.out.println("NO");
		}
		
}
}
