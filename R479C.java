package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/


import java.io.*;
import java.util.*;
import java.math.*;
public class R479C {
    public static void main(String[] args) {
        InputReader sc = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);

        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
       sort(arr,0,arr.length-1);
        HashMap<Long,Integer> map = new HashMap<>();

        List<Long> list = new ArrayList<>();

        long val = 0;

        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);

            map.put(arr[i],list.size());

            if(list.size() == k){
                val = arr[i];
            }

        }

        Set<Long> keys = map.keySet();

        Iterator<Long> it = keys.iterator();

        HashSet<Integer> values = new HashSet<>();

        while (it.hasNext()){
            values.add(map.get(it.next()));
        }

        //out.println(values);
        if(k==0){
            long temp = arr[0];
            if((temp-1)==0){
                out.println("-1");
            }
            else{
                out.println(temp-1);
            }
        }
        else{
            if(values.contains(k)){
                if(val ==0){
                    out.println("-1");
                }
                else{
                    out.println(val);
                }
            }
            else{
                out.println("-1");
            }
        }



        out.close();

    }

    public static void marge(long [] arr,int l ,int m,int r){

        //size of two array

        int n1 = m-l+1;
        int n2 = r-m;

        // create two temporaray array
        long[] L = new long[n1];
        long[] R = new long[n2];

        //copy Data to temporary array
        for(int i=0;i<n1;++i){
            L[i] = arr[l+i];
        }

        for(int j=0;j<n2;++j){
            R[j] = arr[m+j+1];
        }

		/*Marge the temporary arrays */
        //initial index of left and right subarrays
        int i=0 , j = 0;

        //initial index of marged subarrays
        int k =l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }



    }

    public static void sort(long[] arr,int l,int r){
        if(l<r){
            int mid =(l+r)/2;

            sort(arr, l, mid);
            sort(arr,mid+1,r);

            marge(arr, l, mid, r);
        }
    }
    public static List<String> getAllSubStringLengthTwo(String s){
        List<String> list = new ArrayList<>();
        for(int i=-0;i<s.length()-1;i++){
            list.add(s.substring(i,i+2));
        }

        return list;
    }

    public static class InputReader {
        private boolean finished = false;

        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int peek() {
            if (numChars == -1) {
                return -1;
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    return -1;
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private String readLine0() {
            StringBuilder buf = new StringBuilder();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r') {
                    buf.appendCodePoint(c);
                }
                c = read();
            }
            return buf.toString();
        }

        public String readLine() {
            String s = readLine0();
            while (s.trim().length() == 0) {
                s = readLine0();
            }
            return s;
        }

        public String readLine(boolean ignoreEmptyLines) {
            if (ignoreEmptyLines) {
                return readLine();
            } else {
                return readLine0();
            }
        }

        public BigInteger readBigInteger() {
            try {
                return new BigInteger(nextString());
            } catch (NumberFormatException e) {
                throw new InputMismatchException();
            }
        }

        public char nextCharacter() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            return (char) c;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E') {
                    return res * Math.pow(10, nextInt());
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E') {
                        return res * Math.pow(10, nextInt());
                    }
                    if (c < '0' || c > '9') {
                        throw new InputMismatchException();
                    }
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public boolean isExhausted() {
            int value;
            while (isSpaceChar(value = peek()) && value != -1) {
                read();
            }
            return value == -1;
        }

        public String next() {
            return nextString();
        }

        public SpaceCharFilter getFilter() {
            return filter;
        }

        public void setFilter(SpaceCharFilter filter) {
            this.filter = filter;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
        public int[] nextIntArray(int n){
            int[] array=new int[n];
            for(int i=0;i<n;++i)array[i]=nextInt();
            return array;
        }
        public int[] nextSortedIntArray(int n){
            int array[]=nextIntArray(n);
            Arrays.sort(array);
            return array;
        }
        public int[] nextSumIntArray(int n){
            int[] array=new int[n];
            array[0]=nextInt();
            for(int i=1;i<n;++i)array[i]=array[i-1]+nextInt();
            return array;
        }
        public long[] nextLongArray(int n){
            long[] array=new long[n];
            for(int i=0;i<n;++i)array[i]=nextLong();
            return array;
        }
        public long[] nextSumLongArray(int n){
            long[] array=new long[n];
            array[0]=nextInt();
            for(int i=1;i<n;++i)array[i]=array[i-1]+nextInt();
            return array;
        }
        public long[] nextSortedLongArray(int n){
            long array[]=nextLongArray(n);
            Arrays.sort(array);
            return array;
        }
    }
    public static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(char[] array) {
            writer.print(array);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void print(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(array[i]);
            }
        }

        public void print(double[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(array[i]);
            }
        }

        public void print(long[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(array[i]);
            }
        }

        public void println(int[] array) {
            print(array);
            writer.println();
        }

        public void println(double[] array) {
            print(array);
            writer.println();
        }

        public void println(long[] array) {
            print(array);
            writer.println();
        }

        public void println() {
            writer.println();
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void print(char i) {
            writer.print(i);
        }

        public void println(char i) {
            writer.println(i);
        }

        public void println(char[] array) {
            writer.println(array);
        }

        public void printf(String format, Object... objects) {
            writer.printf(format, objects);
        }

        public void close() {
            writer.close();
        }

        public void flush() {
            writer.flush();
        }

        public void print(long i) {
            writer.print(i);
        }

        public void println(long i) {
            writer.println(i);
        }

        public void print(int i) {
            writer.print(i);
        }

        public void println(int i) {
            writer.println(i);
        }

        public void separateLines(int[] array) {
            for (int i : array) {
                println(i);
            }
        }
    }

}
