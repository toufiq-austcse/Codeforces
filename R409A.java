package CodeForces;

import java.util.Scanner;

public class R409A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		
		String modString = in.replace("VK", "");
		//System.out.println(modString);
		
		int result = (in.length()-modString.length())/2;
		
		if(in.contains("VV") || in.contains("KK")){
			result++;
		}
		System.out.println(result);
		
	}

}
