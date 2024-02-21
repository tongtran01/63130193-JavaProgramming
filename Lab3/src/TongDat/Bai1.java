/**
 * 
 */
package TongDat;

/**
 * 
 */
import java.util.*;
public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SNT= new Scanner(System.in);
		System.out.println("Nhập vào n:");
		int n = SNT.nextInt();
		boolean ok = true;
		for(int i=2;i<n-1;i++) {
			if(n%i==0) {
				ok=false;
				break;
			}
		}
		if(ok && n>1) System.out.printf(n+" là số nguyên tố");
		else System.out.printf(n+"không phải là số nguyên tố");

	}

}
