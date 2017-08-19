package CodeForces;

import java.util.*;
public class R103A {
    static int binarySearch(int[] arr,int left,int right,int x ){

        if(left<=right){
            int mid = (left+(right-left))/2;
            if(arr[mid]==x){
                return  mid;
            }
            if(arr[mid]<x){
                left = mid+1;
            }
            else{
                right = right-1;
            }
        }
        return -1;
    }

    static  List<Integer> position(List<Integer> arr,int n){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==n){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            list.add(a);
            temp.add(a);

        }
        Collections.sort(temp);

        int large = temp.get(temp.size()-1);
        int min = temp.get(0);

        List<Integer> largevPos = position(list,large);
        List<Integer> minvPos = position(list,min);
      Collections.sort(largevPos);
      Collections.sort(minvPos);

      int posL = largevPos.get(0);
      int posMi = minvPos.get(minvPos.size()-1);
      int ans;
      if(posL>posMi) {
           ans = (posL - 0) + ((list.size() - 1) - posMi)-1;
      }
      else{
           ans = (posL - 0) + ((list.size() - 1) - posMi);
      }
        System.out.println(ans);



    }
}
