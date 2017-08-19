/*
 * In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

				
package CodeForces;

/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;*/


import java.util.*;

public class R415B {
	
	int product;
	int client;
	
	public R415B(int product, int client) {
		
		this.product = product;
		this.client = client;
	}
	
	public R415B() {

	}

	public R415B createPair(int pro,int cli){
		R415B  ob = new R415B(pro,cli);
		return ob;
	}
	
	public int getPro(){
		return product;
	}
	
	public int getCli(){
		return client;
	}
	
	public void setPro(int a){
		this.product = a;
	}
	
	public void setClie(int a){
		this.client = a;
	}
  
	public static void main(String[] arg){
		
		Scanner sc = new Scanner(System.in);
		R415B o = new R415B();
		ArrayList<R415B> list = new ArrayList<>();
		ArrayList<Integer> client = new ArrayList<>();
		ArrayList<Integer> checkPre = new ArrayList<>();
		
		
		
		int n = sc.nextInt();
		int f = sc.nextInt();
		
		
		
		for(int i=0;i<n;i++){
			int p = sc.nextInt();
			int c = sc.nextInt();
			
			
			list.add(o.createPair(p, c));
			
			
		}
		
		
		for(int i=0;i<list.size();i++){
			client.add(list.get(i).getCli());
		}
		
		
	   Collections.sort(client);
	  
	   boolean isZero = false;
	   for(int i=0;i<f;i++){
		  
		   int large = client.get((client.size()-1)-i);
		  // System.out.println(large);
		
		  for(int j=0;j<list.size();j++){
			  if(list.get(j).getCli()==large ){
				
				  if(!checkPre.contains(large) ){
				
				  list.get(j).setPro(2*list.get(j).getPro());
				
				  }
				  if(list.get(j).getPro()==0){
					  f = f+1;
					  isZero = true;
					  break;
				  }
				 
			  }
			
		  }
		  checkPre.add(large);
		 // System.out.println("I "+i);
	   }
	 
	   int total =0;;
	   for(int i=0;i<list.size();i++){
		 if(list.get(i).getCli()>=list.get(i).getPro()){
			 total+=list.get(i).getPro();
		 }
		 else{
			 total+=list.get(i).getCli();
			 }
	   }
	   
	   System.out.println(total);
  
	}
}
