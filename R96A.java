package CodeForces;

import java.util.Scanner;

public class R96A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String  s= sc.nextLine();
		if((s.contains("H"))||(s.contains("Q"))||(s.contains("9"))){
			System.out.println("YES");
			
		}
		else{
			System.out.println("NO");
		}
	}
}
