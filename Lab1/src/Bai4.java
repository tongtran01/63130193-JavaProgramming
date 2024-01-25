/**
 * 
 */

/**
 * 
 */
import java.util.*;
public class Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ax^2+bx+c=0
		//a=0
		Scanner ptbac2 = new Scanner(System.in);
		System.out.print("Nhập hệ số pt bậc 2:");
		double a = ptbac2.nextDouble();
		double b = ptbac2.nextDouble();
		double c = ptbac2.nextDouble();
		if(a==0){
			if(b==0) {
				if(c==0) {
					System.out.print("Phương trình vô số nghiệm");
					
					
				}
				else {
					System.out.print("Phương trình vô nghiệm");
				}
			}
			else {
				System.out.printf("Phương trình có nghiệm:%f",-c/b);
			}
		}
		else {
			double Delta = Math.pow(b,2)-4*a*c;
			double Caican = Math.sqrt(Delta);
			System.out.printf("Delta = %f", Caican);
		}
	}

}
