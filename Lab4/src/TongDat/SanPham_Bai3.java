/**
 * 
 */
package TongDat;

/**
 * 
 */
import java.util.*;
public class SanPham_Bai3 {
	 String tenSp;
     double donGia;
     double giamGia;
    
    // Hàm tạo thứ nhất có 3 tham số: tên, đơn giá và giảm giá
    public SanPham_Bai3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
 // Hàm tạo thứ hai có 2 tham số: tên và đơn giá
    public SanPham_Bai3(String tenSp, double donGia) {
        this(tenSp, donGia, 0); // Gọi hàm tạo thứ nhất và mặc định giảm giá là 0
    }
    
    public double getThueNhapKhau() {
        return 0.1 * donGia;
    }
    
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // Tạo sản phẩm có giảm giá
	        System.out.println("Nhập thông tin sản phẩm có giảm giá:");
	        System.out.println("Nhập tên sản phẩm: ");
	        String tenSp1 = scanner.nextLine();
	        System.out.println("Nhập đơn giá: ");
	        double donGia1 = scanner.nextDouble();
	        System.out.println("Nhập giảm giá: ");
	        double giamGia1 = scanner.nextDouble();
	        scanner.nextLine(); // Đọc bỏ kí tự '\n'
	        SanPham_Bai3 sp1 = new SanPham_Bai3(tenSp1, donGia1, giamGia1);
	        
	        // Tạo sản phẩm không giảm giá
	        System.out.println("Nhập thông tin sản phẩm không giảm giá:");
	        System.out.println("Nhập tên sản phẩm: ");
	        String tenSp2 = scanner.nextLine();
	        System.out.println("Nhập đơn giá: ");
	        double donGia2 = scanner.nextDouble();
	        scanner.nextLine(); // Đọc bỏ kí tự '\n'
	        SanPham_Bai3 sp2 = new SanPham_Bai3(tenSp2, donGia2);
	        
	        // Xuất thông tin sản phẩm
	        System.out.println("Thông tin sản phẩm có giảm giá:");
	        sp1.xuat();
	        
	        System.out.println("Thông tin sản phẩm không giảm giá:");
	        sp2.xuat();
	    }
	}