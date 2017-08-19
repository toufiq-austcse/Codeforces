package CodeForces;
import  java.util.*;
public class R274A {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add((a+b)*c);
        list.add(a+(b*c));
        list.add((a*b)+c);
        list.add(a*b*c);
        list.add(a+b+c);
        list.add(a*(b+c));

        Collections.sort(list);
        System.out.println(list.get(list.size()-1));



    }
}
