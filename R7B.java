package CodeForces;
/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * Codeforces,Round 78,Probelam A,The Time
 */

import java.util.Scanner;

public class R7B {

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int givenmin  = sc.nextInt();
		
		String[] in = s.split(":");
		
		int a =Integer.parseInt(in[0]);
		int b =Integer.parseInt(in[1]);

        for(int i=1;i<=givenmin;i++){
        	b+=1;
        	if(b==60){
        		a = a+1;
        		b=0;
        		
        	}
        	
        }
        int finalhr=0;
      
    	  finalhr= a%24;
       
      /* if(finalhr<10 ){
        System.out.println("0"+finalhr+":"+b);
       }
       else if (b<10){
    	   System.out.println(finalhr+":"+"0"+b);
       }
       else if(finalhr<10 && b<10){
    	   System.out.println("0"+finalhr+":"+"0"+b);
       }*/
    	  String totalhr=Integer.toString(finalhr);
    	  String totalmin =Integer.toString(b);
    	  
    	  if( finalhr<10){
    		  totalhr ="0"+finalhr;
    		  
    	  }
    	  if(b<10){
    		  totalmin = "0"+b;
    	  }
    	  System.out.println(totalhr+":"+totalmin);
        
      
		
	}
	
}
