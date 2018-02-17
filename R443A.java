package CodeForces;

import InputOutput.InputReader;
import InputOutput.OutputWriter;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class R443A   {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
       int[] s = new int[n];
       int[] d = new int[n];
       for(int i=0;i<n;i++){
           s[i]  = in.nextInt();
           d[i] = in.nextInt();

       }

       int min = s[0];

        for(int i=1;i<n;i++){
            int j=0;
            while (s[i]+j*d[i]<=min){
                j++;
            }
            min = s[i]+j*d[i];
        }

        out.println(min);

    }


}
