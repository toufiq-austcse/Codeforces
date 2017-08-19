/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.*;

public class R267A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] p = new int[t];
		int[] q = new int[t];
		
		for(int i=0;i<t;i++){
			p[i] = sc.nextInt();
			q[i] = sc .nextInt();
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<t;i++){
			list.add(q[i]-p[i]);
		}
		int count =0;
		for(int i=0;i<list.size();i++){
			if(list.get(i)>=2){
				count ++;
			}
		}
		
		System.out.println(count);
		
	}
	
}
