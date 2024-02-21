/**
 * 
 */
package TongDat;

/**
 * 
 */
import java.util.*;
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=8;
		for(int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d\n",x,i,x*i);
		}
		for(int j=1;j<=9;j++) {
			for(int k=1;k<=10;k++) {
				System.out.printf("%d x %d = %d",j,k,j*k);
				System.out.println();
			}
		}

	}

}
