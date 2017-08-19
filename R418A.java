/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.util.*;
public class R418A {

	public static void main(String[] arg){
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		List<Integer> nEl = new ArrayList<>();
		List<Integer> kEl = new ArrayList<>();
		
		for(int i=0;i<n;i++){
			nEl.add(sc.nextInt());
		}
		
		for(int i=0;i<k;i++){
			kEl.add(sc.nextInt());
		}
		
		Collections.sort(kEl);
		
		int count = kEl.size()-1;
		for(int i =0;i<nEl.size();i++){
			if(nEl.get(i)==0){
				nEl.remove(i);
				nEl.add(i, kEl.get(count--));
				//System.out.println(i);
			}
		}
		//System.out.println(nEl);
		boolean f = true;
		for(int i=0;i<nEl.size()-1;i++){
			if(nEl.get(i)>nEl.get(i+1)){
				System.out.println("Yes");
				f = false;
				break;
			}
		}
		if(f){
			System.out.println("No");
		}
	}
}
