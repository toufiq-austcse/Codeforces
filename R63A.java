/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;
import java.util.*;
public class R63A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		int tx=0,ty=0,tz=0;
		for(int i=0;i<t;i++){
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			tx+=x;
			ty +=y;
			tz+=z;
		}
		if(tx==0 && ty==0 && tz==0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
	}
}
