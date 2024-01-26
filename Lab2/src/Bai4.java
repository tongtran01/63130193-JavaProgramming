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
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\n+----------------------------+");
			System.out.println("1. Giải phương trình bậc nhất");
			System.out.println("2. Giải phương trình bậc hai");
			System.out.println("3. Tính tiền điện");
			System.out.println("4. Kết thúc");
			System.out.println("+----------------------------+");
			int select = scanner.nextInt();
			switch(select) {
			case 1:
				PTB1();
				break;
			case 2:
				PTB2();
				break;
			case 3:
				TinhTienDien();
				break;
			case 4:
				System.exit(0);
			}
		}
	}
	//PTB1
	public static void PTB1() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a,b,c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
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
	//PTB2
	public static void PTB2() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a,b,c:");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
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
	//TinhTienDien
	public static void TinhTienDien(){
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
