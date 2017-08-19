package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 *Codeforces,Round 146,Problem-A
 */


import java.util.Scanner;

public class R146A {
public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
		char[] in = s.toCharArray();
		
		String out="";
	
	for(int i=0;i<s.length();i++){
		for(int j=i+1;j<s.length();j++){
			if(in[j]==s.charAt(i)){
				in[i] ='1';
			}
		}
	}
	
	for(int k=0;k<in.length;k++){
		if(in[k]!='1'){
			out+=in[k];
		}
	}
	if(out.length()%2==0){
		System.out.println("CHAT WITH HER!");
	}
	else{
		System.out.println("IGNORE HIM!");
	}
	
	
	
	
	
}
}
