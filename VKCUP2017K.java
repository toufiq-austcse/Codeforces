package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VKCUP2017K {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		char[] c = sc.nextLine().toCharArray();
		List<Character> list = new ArrayList<>();
		for(int i=0;i<c.length;i++){
			if(c[i]!='a'&&c[i]!='e'&&c[i]!='i'&&c[i]!='o'&&c[i]!='u'&&c[i]!='y'){
				System.out.print(c[i]);
			}
			else  if( c[i]=='e'|| c[i]=='o'){
				list.add(c[i]);
				if(c[i+1]!='a'&&c[i+1]!='i'&&c[i+1]!='u'&&c[i+1]!='y'){
					if(list.size()==2){
						System.out.print(c[i]);
						System.out.print(c[i]);
					}
					else if(list.size()>2){
						System.out.print(c[i]);
					}
				}
				
			}
			
		
	

}
}
}