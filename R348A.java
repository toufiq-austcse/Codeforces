package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Round 348, Problem A,Little Artem and Presents
 */

/*
	     firstly we need to make the sequence like 1,2,1,2,1,2
       then we need to calculate the number of 3 (1,2) in the sequence
       so n/3 . it will give us the pear of (1,2) ..so wee need to multiply 
        it by 2 so,2*(n/3).. if n%3!=0 then by remaining number we will give
             another birthday present.so else (n/2)*2+1 .
                   example for n=5,5%3!=0
                        so 5/3 = 1
                          1*2 = 2
                           2+1 =3
                        so result is 3
*/

import java.util.Scanner;

public class R348A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);               
		int n= sc.nextInt();
		if(n%3==0){
			System.out.println((n/3)*2);
		}
		else{
			System.out.println((n/3)*2+1);
		}
				
	}

}
