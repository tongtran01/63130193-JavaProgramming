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
			System.out.print("+----------------------------+");
			System.out.print("1. Giải phương trình bậc nhất");
			System.out.print("2. Giải phương trình bậc hai");
			System.out.print("3. Tính tiền điện");
			System.out.print("4. Kết thúc");
			System.out.print("+----------------------------+");
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
	


}
