package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R410A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		String in = sc.nextLine();
		char[] arr = in.toCharArray();
		int count =0;
		for(int i=0;i<in.length()/2;i++){
			if(arr[i]!=arr[arr.length-(i+1)]){
				count++;
			}
			//System.out.println(arr[i]);
			//System.out.println(arr[arr.length-(i+1)]);
		}
		
		if(count==1){
			System.out.println("YES");
		}
		else if(count==0){
			if(in.length()%2==1){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
		else{
			System.out.println("NO");
		}

	}

}