package CodeForces;

import InputOutput.InputReader;
import InputOutput.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s =  in.nextString();

        String first ="";
        String second = "";
        String third = "";

        int firstStringIterator =0;

        while (s.charAt(firstStringIterator)=='a'){
            first += s.charAt(firstStringIterator);
            firstStringIterator++;
        }

        if(first==""){
            firstStringIterator=0;
            while (s.charAt(firstStringIterator)=='b'){
                firstStringIterator++;
            }

            while (s.charAt(firstStringIterator)=='a'){
                first +=s.charAt(firstStringIterator);
                firstStringIterator++;
            }

        }

        System.out.println("First "+first);

       /* int thirdIterator =s.length()-1;

        while (s.charAt(thirdIterator)=='a' && thirdIterator>firstStringIterator-1){
            third += s.charAt(thirdIterator);
            thirdIterator--;
        }

        if(third==""){
            thirdIterator =s.length()-1;

            while (s.charAt(thirdIterator)=='b' && thirdIterator>firstStringIterator-1){
                thirdIterator--;
            }

            while (s.charAt(thirdIterator)=='a' && thirdIterator>firstStringIterator-1){
                third +=s.charAt(thirdIterator);
                thirdIterator--;
            }
        }

        System.out.println("First "+first);
        System.out.println(third);
*/





    }
}
