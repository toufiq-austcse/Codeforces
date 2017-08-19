package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round 386,Problem A
 */


import java.util.Scanner;

public class R386A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int i=a;
		int total =0;
		while(i!=0){
			if(i*2>b || i*4>c){
				i--;
				total =0;
			}
			else{
				total=i+(i*2)+(i*4);
				break;
			}
		}
		
		System.out.println(total);
	}

}
