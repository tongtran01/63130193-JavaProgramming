/**
 * 
 */

/**
 * 
 */
import java.util.*;
public class Bai1 {

	/**
	 * @param args
	 */
	//ax+b=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ptbacnhat = new Scanner(System.in);
		System.out.print("Nhập hệ số a,b,c: ");
		double a = ptbacnhat.nextDouble();
		double b = ptbacnhat.nextDouble();
		if(a==0) {
			if(b==0) {
				System.out.print("Phương trình vô số nghiệm");
			}
			else {
				System.out.print("Phương trình vô nghiệm");
			}
		}
		else {
			System.out.printf("Kết quả:%f", -b/a);
		}
	}

}
