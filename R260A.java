package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class R260A {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] price = new int[n];
		int[] quality = new int [n];
		
		for(int i=0;i<n;i++){
			price[i] = sc.nextInt();
			quality[i] = sc.nextInt();
		}
		
		boolean isGrater = false;
		
		for(int i=1;i<n;i++){
			if(price[i]>price[i-1]){
				isGrater = true;
				break;
			}
		}
		
		if(isGrater){
			System.out.println("Happy Alex");
		}
		else{
			System.out.println("Poor Alex");
		}
		

		
	}
}
