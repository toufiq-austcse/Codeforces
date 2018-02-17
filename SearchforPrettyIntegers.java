package CodeForces;

import InputOutput.InputReader;
import InputOutput.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchforPrettyIntegers {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for(int i=0;i<n;i++){
            listA.add(in.nextInt());
        }
        for(int i=0;i<m;i++){
            listB.add(in.nextInt());
        }

        Collections.sort(listA);
        Collections.sort(listB);

        int a = listA.get(0);
        int b = listB.get(0);

        boolean isContain = false;

        for(int i=0;i<listA.size();i++){
            int temp = listA.get(i);
           if(listB.contains(temp)){
               System.out.println(temp);
               isContain = true;
               break;
           }
        }

        if(!isContain){
           String s = Integer.toString(a)+Integer.toString(b);
           String s1 = Integer.toString(b)+Integer.toString(a);

           int sI = Integer.parseInt(s);
           int s1I = Integer.parseInt(s1);
            System.out.println(sI<s1I ? sI:s1I);
        }




    }
}
