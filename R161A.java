/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;
import java.util.*;
public class R161A {

	public static void main(String[] arg){
		Scanner sc  = new Scanner(System.in);
		int row=0,column=0;
		for(int i=0;i<5;i++){
			String s = sc.nextLine();
			if(s.contains("1")){
				String[] arr = s.split(" ");
				for(int j=0;j<arr.length;j++){
					if(arr[j].equals("1")){
						column = j;
						break;
					}
				}
				row = i;
			}
		}
		
		int ans = Math.abs((row+1)-3)+Math.abs((column+1)-3);
		System.out.println(ans);
	}
}
