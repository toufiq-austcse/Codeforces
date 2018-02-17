package CodeForces;

import InputOutput.InputReader;
import InputOutput.OutputWriter;

public class R442A {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.nextString();

        int count =0;

        count+=times(s,"Danil");
        count+=times(s,"Olya");
        count+=times(s,"Slava");
        count+=times(s,"Ann");
        count+=times(s,"Nikita");

        if(count==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }



    }
    static int times(String s,String a ){
        int start = 0;
        int end  = a.length()-1;
        int count =0;

        while (end<s.length()){
            String temp ="";

            for(int i= start;i<=end;i++){
               temp +=s.charAt(i);
            }
            if(temp.equals(a)){
                count++;
            }
            start++;
            end++;


        }
        return end;
    }
}
