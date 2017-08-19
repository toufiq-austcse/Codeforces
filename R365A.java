package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round 365,Problem A
 */

import java.util.Scanner;

public class R365A {
 public static void main(String[] arg){
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int[][] rounds = new int[n][2];
	 int m=0,c =0;
	 for(int i=0;i<n;i++){
		 for(int j=0;j<2;j++){
			 rounds[i][j] = sc.nextInt();
		 }
		 if(rounds[i][0]>rounds[i][1]){
			 m++;
		 }
		 else if(rounds[i][0]<rounds[i][1]){
			 c++;
		 }
	 }
	 
	if(m>c){
		System.out.println("Mishka");
	}
	else if(m<c){
		System.out.println("Chris");
	}
	else{
		System.out.println("Friendship is magic!^^");
	}
 }
}
