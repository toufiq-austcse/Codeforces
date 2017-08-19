package CodeForces;
import java.util.*;
public class R97A {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <n; i++) {
           list.add(sc.nextInt()-1);
        }

        for(int i=0;i<n;i++){
            int temp = i;
            for(int j=0;j<list.size();j++){
                if(list.get(j)==i){
                    System.out.print(j+1+" ");
                }
            }
        }
        System.out.println();
        //System.out.println(list);

    }
}