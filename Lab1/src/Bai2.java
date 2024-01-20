/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner hcn = new Scanner(System.in);
		System.out.print("Chieu dai:");
		double chieudai = hcn.nextDouble();
		System.out.print("Chieu rong:");
		double chieurong = hcn.nextDouble();
		double chuvi = (chieudai+chieurong)*2;
		double dientich =chieudai*chieurong;
		double canhnhonhat = Math.min(chieudai,chieurong);
		System.out.printf("Chu vi hcn: %.2f",chuvi);
		System.out.printf("\nDien tich hcn: %.2f",dientich);
		System.out.printf("\nCanh nho nhat hcn: %.2f",canhnhonhat);
		
	}

}
