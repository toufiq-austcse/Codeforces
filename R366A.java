package CodeForces;

import java.util.Scanner;

public class R366A {
public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	String s="";
	int n= sc.nextInt();
	if(n==1){
		System.out.println("I hate it");
	}
	else if(n==2){
		System.out.println("I hate that I love it");
	}
	else{
	for(int i=0;i<n;i++){
		if(i%2!=0 && i!=n-1){
			s+="I love that ";
		}
		else if(i==n-1 && i%2==0){
			s+="I hate it ";
		}
		else if(i==n-1 && i%2!=0){
			s+="I love it ";
		}
		else{
			s+="I hate that ";
		}
	}
	System.out.println(s.trim());
	}
	
}
}
