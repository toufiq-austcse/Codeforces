package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * CodeForces,ROund-269,Problem A
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//6254545
public class R269A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
	    int[] a = new int[6];
	    HashMap<Integer, Integer> map =  new HashMap<>();
	    for(int i=0;i<6;i++){
		 a[i] = sc.nextInt();
	   }
	    
	   int total=1;
	   for(int i=0;i<a.length;i++){
		   for(int  j=i+1;j<a.length;j++){
			   if(a[i]!=-1&& a[i]==a[j]){
				   total++;
				   a[j] =-1;
				  
		   }
	   }
		   if(a[i]!=-1){
			   map.put(a[i], total);
		   }
		   total=0;
	    
	   }
	   
	   System.out.println(map);
}
}