/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

				
package CodeForces;
import java.util.*;
public class R422B {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();
		String x = sc.nextLine();
		String y = sc.nextLine();
		int i=-1;
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, String> map = new HashMap<>();
		
		int sd = Integer.MAX_VALUE;
		
	while(true){
		int count=0;
		String pos ="";
			for(int j=0;j<x.length();j++){
				/*System.out.println("j "+j+"  i "+(++i));
				System.out.println(x.charAt(j)==y.charAt(i));*/
				
				
				if(x.charAt(j)!=y.charAt(++i)){
					count++;
					//System.out.println("COunt "+count);
					pos +=Integer.toString(j+1)+" ";
				}
			}
			
			//System.out.println("COunt "+count);
			list.add(count);
			
			if(count<sd){
				sd  = count;
				map.put(sd, pos);
				//k = i
			}
			//listst.add(pos);
			if(i==y.length()-1){
				break;
			}
			i-=( x.length()-1);
		}
	
	//Collections.sort(list);
	//System.out.println(list);
	String getS = map.get(sd);
	System.out.println(sd);
	
	System.out.println(getS.trim());
	}

}
