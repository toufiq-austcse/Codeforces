package CodeForces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import java.io.*;
import java.util.*;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
public class R435B {

    List<Integer> adj[];
    int v;
    int[] level;

    R435B(int n ){
        v = n;
        adj = new LinkedList[v];
        level = new int[v];

        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int u,int v){
        adj[u].add(v);
        adj[v].add(u);
    }

    /*boolean isBipertite(int s){
        Queue<Integer> queue = new LinkedList<>();


        for(int i=0;i<coler.length;i++){
            coler[i] =-1;
        }

        queue.add(s);
        coler[s] =1;

        while (queue.size()!=0){
            int u = queue.poll();

            if(adj[u].contains(u)){
                return false;
            }

            Iterator<Integer> it = adj[u].listIterator();
            while (it.hasNext()){
                int n = it.next();
                if(adj[u].contains(n) && coler[n]==-1){
                    coler[n] = 1-coler[u];
                    queue.add(n);
                }

                else if(adj[u].contains(n) && coler[n]==coler[u]){
                    return false;
                }
            }
        }

        return true;
    }

   */
    public void DFS(int s){
        boolean[]  isVisited = new boolean[v];
        Stack<Integer> stack = new Stack<>();

        stack.push(s);
        level[s] =1;
        while(!stack.empty()){
            s = stack.pop();
            //System.out.println("pop "+s);
            if(!isVisited[s]){
           //     System.out.print(s+" ");
                isVisited[s] = true;
            }

            Iterator<Integer> it = adj[s].listIterator();

            while(it.hasNext()){
                int n = it.next();
                if(!isVisited[n]){
                    stack.push(n);
                    level[n] = level[s]+1;
                    ///	System.out.println("push "+n);
                }
                //System.out.println("Stack "+stack);
            }
        }
    }

          //Code for Faster Input
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

    	      String nextLine(){
    	          String str = "";
    		  try {
    		     str = br.readLine();
    		  } catch (IOException e) {
    		     e.printStackTrace();
    		  }
    		  return str;
    	      }

    	   }
    	   //--------------------------------------------------------


    public static void main(String[] args) {

        MyScanner sc = new MyScanner();
        int n = sc.nextInt();
        R435B ob = new R435B(n);

        for (int i = 0; i < n - 1; i++) {
            ob.addEdge(sc.nextInt() - 1, sc.nextInt() - 1);
        }

        ob.DFS(0);

        long odd =0;
        long even =0;

        for(int i=0;i<ob.level.length;i++){
           if(ob.level[i]%2==0){
               odd++;
           }
           else{
               even++;
           }
        }

        System.out.println(odd*even-(n-1));
    }
}
