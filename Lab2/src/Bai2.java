/**
 * 
 */

/**
 * 
 */
import java.util.*;
public class Bai2 {

	/**
	 * @param args
	 */
	//ax^2+bx+c=0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ptbac2 = new Scanner(System.in);
		System.out.print("Nhập hệ số a,b,c:");
		double a = ptbac2.nextDouble();
		double b = ptbac2.nextDouble();
		double c = ptbac2.nextDouble();
		if(a==0) {
			System.out.printf("Giai phuong trinh bac nhat: %f",-c/b);
			
		}
		else {
			double Delta = Math.pow(b,2)-4*a*c;
			if(Delta<0) {
				System.out.print("Phương trình vô nghiệm!");
				
			}
			else if(Delta ==0) {
				System.out.printf("Phương trình có nghiệm kép:%f",-b/(2*a));
			}
			else{
				double can = Math.sqrt(Delta);
				System.out.printf("Phương trình có 2 nghiệm phân biệt: x1=%.2f x2=%.2f", (-b+can)/(2*a),(-b-can)/(2*a));
				
			}
			
			
		}

	}

}
