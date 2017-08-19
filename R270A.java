package CodeForces;
import java.util.*;
public class R270A {
   static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (!isPrime(i)) {
                list.add(i);
            }
        }
        boolean isFound = false;
       for(int i=0;i<list.size();i++){
            int a = list.get(i);
            int rem = n-a;
            for(int j=0;j<list.size();j++){
                if(list.get(j)==rem){
                    System.out.println(a+" "+list.get(j));
                    isFound = true;
                    break;
                }
            }

            if(isFound){
                break;
            }
       }
    }
}