package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class R428B {

    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------]

    public static boolean sittIngArrengMent(int[] team,int n,int k ){

        int fourSit = n;
        int twoSit = n*2;
        int oneSit = 0;

        for(int i=0;i<k;i++){
            int menCount = team[i];
            while(menCount>0){
                if(menCount>=4){
                    if(fourSit>0){
                        fourSit--;
                        menCount-=4;
                        continue;
                    }
                    if(twoSit>0){
                        twoSit--;
                        menCount -=2;
                        continue;
                    }
                    if(oneSit>0){
                        oneSit--;
                        menCount--;
                        continue;
                    }

                    return false;
                }

                if(menCount==3){
                    if(fourSit>0){
                        fourSit--;
                        menCount-=3;
                        continue;
                    }

                    if(twoSit>0){
                        twoSit--;
                        menCount -=2;
                        continue;

                    }
                    if(oneSit>0){
                        oneSit--;
                        menCount--;
                        continue;
                    }

                    return false;
                }

                if(menCount==2){
                    if(twoSit>0){
                        twoSit--;
                        menCount -=2;
                        continue;
                    }
                    if(fourSit>0){
                        fourSit--;
                        menCount-=2;
                        oneSit++;
                        continue;
                    }

                    if(oneSit>0){
                        oneSit--;
                        menCount--;
                        continue;
                    }

                    return false;
                }

                if(menCount==1){
                    if(oneSit>0){
                        oneSit--;
                        menCount--;
                        continue;
                    }


                    if(fourSit>0){
                        fourSit--;
                        menCount--;
                        twoSit++;
                        continue;
                    }
                    if(twoSit>0){
                        twoSit--;
                        menCount--;
                        continue;
                    }

                    return false;
                }

            }
        }

        return  true;

    }


    public static void main(String[] arg) {
        MyScanner sc = new MyScanner();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        if(sittIngArrengMent(arr,n,k)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }




//        int fourSit = n;
//        int twoSit = n * 2;
//
//        for (int i = 0; i < k; i++) {
//            int val = Math.min(fourSit, arr[i] / 4);
//            fourSit = fourSit-val;
//            arr[i] -= val*4;
//
//        }
//
//        twoSit = twoSit+fourSit;
//
//        for(int i=0;i<k;i++){
//            int val = Math.min(twoSit,arr[i]/2);
//            twoSit = twoSit -val;
//            arr[i] -=val*2;
//        }
//
//        int oneSit = twoSit+fourSit;
//
//        for(int i=0;i<k;i++){
//            int val = Math.min(oneSit,arr[i]/1);
//            oneSit = oneSit -val;
//            arr[i] -=val;
//        }
//
//        for(int i=0;i<k;i++){
//            if(arr[i]>0){
//              //  System.out.println(arr[i]);
//                System.out.println("NO");
//                return;
//            }
//        }
//
//        System.out.println("YES");
    }
}