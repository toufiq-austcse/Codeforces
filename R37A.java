package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class R37A {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int count =0;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<a.length;i++){
			for(int j = 0;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
				
			}
			if(count>1){
				map.put(a[i], count);
				
			}
			count = 0;
		}
		
		/*ArrayList<Integer> list = new ArrayList<>();
		Set<Integer> keys = map.keySet();		
		for (Integer integer : keys) {
			list.add(map.get(integer));
		}
		
		Collections.sort(list);
		if(list.size()!=0){
		System.out.println(list.get(list.size()-1)+" "+(a.length-list.size()));
		}
		else{
			System.out.println(1+" "+a.length);
		}
		System.out.println(list);*/
		System.out.println(map);
	}

}
