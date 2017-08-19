package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round 346,Problem A
 */


import java.util.Scanner;

public class R346A {

	public static void main(String[] arg){
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[n];
		
		int count=0;
		int i=0;
		if(b>0){
			
		for( i=a;;i++){
			count++;
		//	System.out.println(i);
            if(i==n){
            	i=0;
            }
            if(count==b){
            	System.out.println(i+1);
            	break;
            }
		}
	//	System.out.println("I "+i);
		
		}
		
		else if(b<0){
			for(i=a;;i--){
				count++;
				//System.out.println(i);
				if(i==1){
					i = n+1;
				}
				if(count ==Math.abs(b)){
					System.out.println(i-1);
					break;
				}
				
			}
		}
		else{
			System.out.println(a);
		}
		
	}
}
