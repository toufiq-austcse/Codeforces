package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/

import java.io.*;
import java.util.*;
public class Codefest2017A {


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

	static class Reader
	{
	    final private int BUFFER_SIZE = 1 << 16;
	    private DataInputStream din;
	    private byte[] buffer;
	    private int bufferPointer, bytesRead;

	    public Reader()
	    {
	        din = new DataInputStream(System.in);
	        buffer = new byte[BUFFER_SIZE];
	        bufferPointer = bytesRead = 0;
	    }

	    public Reader(String file_name) throws IOException
	    {
	        din = new DataInputStream(new FileInputStream(file_name));
	        buffer = new byte[BUFFER_SIZE];
	        bufferPointer = bytesRead = 0;
	    }

	    public String readLine() throws IOException
	    {
	        byte[] buf = new byte[64]; // line length
	        int cnt = 0, c;
	        while ((c = read()) != -1)
	        {
	            if (c == '\n')
	                break;
	            buf[cnt++] = (byte) c;
	        }
	        return new String(buf, 0, cnt);
	    }

	    public int nextInt() throws IOException
	    {
	        int ret = 0;
	        byte c = read();
	        while (c <= ' ')
	            c = read();
	        boolean neg = (c == '-');
	        if (neg)
	            c = read();
	        do
	        {
	            ret = ret * 10 + c - '0';
	        }  while ((c = read()) >= '0' && c <= '9');

	        if (neg)
	            return -ret;
	        return ret;
	    }

	    public long nextLong() throws IOException
	    {
	        long ret = 0;
	        byte c = read();
	        while (c <= ' ')
	            c = read();
	        boolean neg = (c == '-');
	        if (neg)
	            c = read();
	        do {
	            ret = ret * 10 + c - '0';
	        }
	        while ((c = read()) >= '0' && c <= '9');
	        if (neg)
	            return -ret;
	        return ret;
	    }

	    public double nextDouble() throws IOException
	    {
	        double ret = 0, div = 1;
	        byte c = read();
	        while (c <= ' ')
	            c = read();
	        boolean neg = (c == '-');
	        if (neg)
	            c = read();

	        do {
	            ret = ret * 10 + c - '0';
	        }
	        while ((c = read()) >= '0' && c <= '9');

	        if (c == '.')
	        {
	            while ((c = read()) >= '0' && c <= '9')
	            {
	                ret += (c - '0') / (div *= 10);
	            }
	        }

	        if (neg)
	            return -ret;
	        return ret;
	    }

	    private void fillBuffer() throws IOException
	    {
	        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
	        if (bytesRead == -1)
	            buffer[0] = -1;
	    }

	    private byte read() throws IOException
	    {
	        if (bufferPointer == bytesRead)
	            fillBuffer();
	        return buffer[bufferPointer++];
	    }

	    public void close() throws IOException
	    {
	        if (din == null)
	            return;
	        din.close();
	    }
	}


	//------------------------------------------------------------------------
           public static void main(String[] args) throws IOException {
               MyScanner sc = new MyScanner();

             //  Reader sc = new Reader();

               int n = sc.nextInt();
               Set<String> set = new TreeSet<>();

               for(int i=0;i<n;i++){
                   String s = sc.nextLine();

                   if(set.contains(new String(s))){
                       System.out.println("YES");
                   }
                   else{
                       System.out.println("NO");
                       set.add(s);
                   }
               }


           }
}
