/**
 * 
 */

/**
 * 
 */
import java.util.*;
public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số điện:");
		double soDien = scanner.nextDouble();
		if(soDien<=50) {
			System.out.printf("Tiền: %.2f",soDien*1000);
			
		}
		else {
			System.out.printf("Tiền: %.2f",50*1000+(soDien-50)*1200);
		}

	}

}
