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
import java.util.List;
import java.util.Scanner;

public class R283A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		List<Integer> finalList = new ArrayList<>();
		
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		
		for(int i=1;i<n-1;i++){
			int tempo = list.get(i);
			list.remove(i);
			
			List<Integer> temp = new ArrayList<>();
			
			for(int j=0;j<list.size()-1;j++){
				temp.add(list.get(j+1)-list.get(j));
			}
			
		
			Collections.sort(temp);
	//System.out.println(temp);
			finalList.add(temp.get(temp.size()-1));
			
			list.add(i, tempo);
			//System.out.println(list);
			temp.clear();
		}
		
		Collections.sort(finalList);
		System.out.println(finalList.get(0));
	}
}
