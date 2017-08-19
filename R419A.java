/*
 *In the name of Allah the Most Merciful.
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 */

package CodeForces;

import java.util.*;

public class R419A {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();

		String[] parts = in.split(":");

		int hr = Integer.parseInt(parts[0]);
		int min = Integer.parseInt(parts[1]);

		String hrRev = new StringBuffer(parts[0]).reverse().toString();

		int inthrRev = Integer.parseInt(hrRev);

		if ((hr * 60 + min) <= (hr * 60 + inthrRev) && inthrRev < 60) {
			System.out.println((hr * 60 + inthrRev) - (hr * 60 + min));
		}

		else if (hr == 23) {
			System.out.println(24 * 60 - (hr * 60 + min));
		}

		else {
			int hrbara = hr;
			while (true) {
				hrbara++;
				hrRev = new StringBuffer(Integer.toString(hrbara)).reverse().toString();
				if (hrRev.length() == 1) {
					hrRev += "0";
				}
				// System.out.println(hrRev);
				if (Integer.parseInt(hrRev) <= 59) {
					System.out.println((hrbara * 60 + Integer.parseInt(hrRev)) - (hr * 60 + min));

					break;

				}
			}
		}

	}

}
