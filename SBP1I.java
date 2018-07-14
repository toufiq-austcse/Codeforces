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
public class SBP1I {

    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        InputReader sc = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);

        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            String s = sc.readLine();

            //{A, H, I, M, O, T, U, V, W, X, Y};
            int count =0;
            String myString = "";

            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='A' || s.charAt(j)=='H' || s.charAt(j)=='I' || s.charAt(j)=='M' || s.charAt(j)=='O' || s.charAt(j)=='T' ||s.charAt(j)=='U' ||s.charAt(j)=='V' ||s.charAt(j)=='W' ||s.charAt(j)=='X' ||s.charAt(j)=='Y' ){
                    myString += s.charAt(j);
                }
                else{
                    myString+=" ";
                    count++;
                }
            }


            if(count==s.length()){
                out.println("0");
            }
        else {


                out.println(longestPalindromicSubString(myString).length());

            }




        }

        out.close();
    }

    static String longestPalindromicSubString(String str){
        int maxLength = 1;

        int start = 0;
        int len = str.length();

        int l ,h;
        String[] arr = {"B","C","D","E","F","G","J","K","L","N","P","Q","R","S","Z"};


        for(int i=1;i<len;++i){

            l = i-1;
            h = i;

            if(str.charAt(l)==' ' || str.charAt(h)==' '){
                continue;
            }


            //for even length palindromic substring
            while (l>=0 && h<len && str.charAt(l)!= ' ' && str.charAt(l) == str.charAt(h)){

                int tempMax = maxLength;
                int tempStart = start;

                if(h-l+1>maxLength){
                    maxLength = h-l+1;
                    start = l;
                }




                --l;
                ++h;
            }



            l = i-1;
            h = i+1;

            while (l>=0 && h<len && str.charAt(l)!= ' ' && str.charAt(l)==str.charAt(h) ){

                    int tempMax = maxLength;
                    int tempStart = start;
                if(h-l+1>maxLength){
                    maxLength = h-l+1;
                    start = l;
                }



                --l;
                ++h;
            }

          //  System.out.println(str.substring(start,start+maxLength));

        }



        return str.substring(start,(start+maxLength-1)+1);

    }


    //Manacher’s Algorithm

    public static String getLongestPalindromicSubString(String s){
        int n = s.length();
        String str = "^";

        for(int i=0;i<n;i++){
            str += "#"+s.substring(i,i+1);
        }

        str +="#$";

        int length = str.length();

        int center = 0;
        int right = 0;

        int[] T = new int[length];

      //  String[] arr = {"B","C","D","E","F","G","J","K","L","N","P","Q","R","S","Z"};
        for(int i=1;i<length-1;i++){
            int i_Symmetric = 2*center - i;

            if(right>i){
                T[i] = Math.min(right-i,T[i_Symmetric]);
            }
            else{
                T[i] = 0;
            }

            while (str.charAt(T[i]+i+1)==str.charAt(i-1-T[i])){
                T[i]++;
            }

            if(i+T[i]>right){
                center = i;
                right = i + T[i];

            }
        }

        int maxLen = 0;
        int centerIndex  = 0;

        for(int i=1;i<length-1;i++){
            if(T[i]>maxLen){
                maxLen = T[i];
                centerIndex = i;
            }
        }

        return s.substring((centerIndex - 1 - maxLen)/2,
                maxLen + (centerIndex - 1 - maxLen)/2);
    }

    static boolean isCOnatinAnyNonMirror(String s){
        //   String[] arr = {"B","C","D","E","F","G","J","K","L","N","P","Q","R","S","Z"};
        if(s.contains("B")){
            return true;
        }
        else if(s.contains("C")){
            return true;
        }
        else if(s.contains("D")){
            return true;
        }
        else if(s.contains("E")){
            return true;
        }
        else if(s.contains("F")){
            return true;
        }
        else if(s.contains("G")){
            return true;
        }
        else if(s.contains("J")){
            return true;
        }
        else if(s.contains("K")){
            return true;
        }
        else if(s.contains("L")){
            return true;
        }else if(s.contains("N")){
            return true;
        }
        else if(s.contains("P")){
            return true;
        }
        else if(s.contains("Q")){
            return true;
        }
        else if(s.contains("R")){
            return true;
        }
        else if(s.contains("S")){
            return true;
        }
        else if(s.contains("Z")){
            return true;
        }


        return false;
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

}
