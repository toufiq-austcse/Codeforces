package CodeForces;

/*In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
*/
import java.io.*;
import java.util.*;
public class R455A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        List<String> list = new ArrayList<>();

        for(int i=0;i<a[0].length();i++){
            for(int j=0;j<a[1].length();j++){
                list.add(a[0].substring(0,i+1)+a[1].substring(0,j+1));
            }
        }
        Collections.sort(list);

        System.out.println(list.get(0));
    }
}
