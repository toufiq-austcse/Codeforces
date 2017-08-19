package CodeForces;

import java.util.Scanner;

public class R411B {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		String in ="";
		for(long i=0;i<n;i++){
			if(i%3==0){
				in+="c";
			}
			else if(i%2==0){
				in+="b";
			}
			else if(i%1==0){
				in+="a";
			}
			
		}
		System.out.println(in);
	}
}
