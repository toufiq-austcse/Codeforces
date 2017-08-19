/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class R492A {
   
    public static void main(String[] arg){
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int i;
    	int sum=0;
    	for( i=1;sum<=n;i++){
    		int temp =0;
    		for(int j=1;j<=i;j++){
    			temp +=j;
    		}
    		sum+=temp;
    		if(sum>n){
    			System.out.println(i-1);
    			break;
    		}
    		
    	}
    	
    }
	
}
