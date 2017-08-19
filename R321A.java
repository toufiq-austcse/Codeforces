package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class R321A {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();

        int count =0;
        for(int i=0;i<arr.length;i++){
            if(i+1<arr.length){
                if(arr[i+1]>=arr[i]){
                    count++;
                }
                else{
                    list.add(count+1);
                    count =0;
                }
            }

        }

        list.add(count+1);
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
}
