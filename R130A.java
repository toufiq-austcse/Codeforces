/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;
import java.util.*;
public class R130A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
	 /*   s = s.replace("WUB", " ");
	       System.out.println(s.trim());*/
		String[] parts = s.split("WUB");
		for(String a:parts){
			if(a.contains("A")||a.contains("B")||a.contains("C")||a.contains("D")||a.contains("E")||a.contains("F")||a.contains("G")||a.contains("H")||a.contains("I")||a.contains("J")||a.contains("K")||a.contains("L")||a.contains("M")||a.contains("N")||a.contains("O")||a.contains("P")||a.contains("Q")||a.contains("R")||a.contains("S")||a.contains("T")||a.contains("U")||a.contains("V")||a.contains("W")||a.contains("X")||a.contains("Y")||a.contains("Z")){
				System.out.print(a+" ");
			}
		}
		
	}
}
