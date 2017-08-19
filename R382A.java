package CodeForces;

/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round 382,Problem A
 */


import java.util.Scanner;

public class R382A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
	
		int k = sc.nextInt();
		sc.nextLine();
		String s= sc.nextLine();
		
		int gIndex =-1;
		int tIndex =-1;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='G'){
			gIndex = i;	
		
			}
			else if(s.charAt(i)=='T'){
				tIndex = i;
			}
		}
	//	System.out.println(s.length());
		
	//	System.out.println(gIndex+" "+tIndex);
		/*100 20
.....G................................................................................T.............
		 * 
		 */
		
		int l=gIndex;
		if(gIndex<tIndex){
			
			while(l<=s.length()){
				try{
				if(s.charAt(l)=='T'){
					System.out.println("Yes");
					break;
				}
				else if(s.charAt(l)=='#'){
					System.out.println("NO");
					break;
				}
				else if(l>tIndex){
					System.out.println("NO");
					break;
				}
			//	System.out.println(l);
				l+=k;
				}catch(Exception e){
					System.out.println("NO");
					break;
				}
			
				
			}
			if(l>s.length()){
				  System.out.println("NO");
			  }
			
			
		}
		else if(gIndex>tIndex){
		   String rev = new StringBuilder(s).reverse().toString();
		 
		   int newGindex = rev.indexOf("G");
		   int newTindex = rev.indexOf('T');
		   l = newGindex;
		   while(l<=rev.length()){
				try{
				if(rev.charAt(l)=='T'){
					System.out.println("YES");
					break;
				}
				else if(rev.charAt(l)=='#'){
					System.out.println("NO");
					break;
				}
				else if(l>newTindex){
					System.out.println("NO");
					break;
				}
			//System.out.println(l);
				l+=k;
				}catch(Exception e){
					System.out.println("NO");
					break;
				}
				
				
			}
		  if(l>rev.length()){
			  System.out.println("NO");
		  }
		}
	
		
		
		
			
	}
}
