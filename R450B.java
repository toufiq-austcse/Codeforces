package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.math.*;
import java.util.*;
import java.io.*;
public class R450B {



    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      BigDecimal a = sc.nextBigDecimal();
      BigDecimal b = sc.nextBigDecimal();

      char c = sc.next().charAt(0);

        char[] arr = (a.divide(b,10000,RoundingMode.HALF_UP)).toString().toCharArray();

        int pos =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] =='.'){
                pos = i;
                break;
            }
        }

        int count =1;
        boolean isFound = false;

        for(int i=pos+1;i<(10000-1);i++){
            if(arr[i]==c){
                System.out.println(count);
                isFound = true;
                break;
            }
            count++;
        }

        if(!isFound){
            System.out.println(-1);
        }
    }
}
