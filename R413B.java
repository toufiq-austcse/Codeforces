/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class R413B {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] p = new int[n];
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0;i<p.length;i++){
			p[i] = sc.nextInt();
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			map.put(a[i], p[i]);
		}
		
		int m = sc.nextInt();
		
		int[] buy = new int[m];
		
		for(int i=0;i<n;i++){
			buy[i] = sc.nextInt();
		}
		
		List<Integer> list = new ArrayList<>();
		
		Set set = map.keySet();
		
		for(int i=0;i<m;i++){
			if(set.contains(buy[i])){
				System.out.println(map.get(buy[i]));
			}
			
		}
		
		}
		
		
}
