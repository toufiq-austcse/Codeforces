package CodeForces;
import java.util.*;
public class R258A {
public static void main(String[] arg){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int total = n+m;
    int count =0;
    int malvika=0;
    int akshat =0;
    while(true){
        count++;
        if(n==0 || m==0){
            break;
        }

        n-=1;
        m-=1;

        if(count%2==0){
            malvika++;
        }
        else{
            akshat++;
        }



    }
    if(count%2==0){
        System.out.println("Akshat");
    }
    else {
        System.out.println("Malvika");
    }

}
}
