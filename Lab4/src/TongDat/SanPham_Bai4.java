/**
 * 
 */
package TongDat;

/**
 * 
 */
import java.util.*;
public class SanPham_Bai4 {
	 String tenSp;
     double donGia;
     double giamGia;
     
    // Getter và setter cho trường tenSp
    public String getTenSp() {
        return tenSp;
    }
    
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    
    // Getter và setter cho trường donGia
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    // Getter và setter cho trường giamGia
    public double getGiamGia() {
        return giamGia;
    }
    
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    // Hàm tạo không tham số
    public SanPham_Bai4() {
        // Khởi tạo các trường dữ liệu mặc định
        this.tenSp = "";
        this.donGia = 0;
        this.giamGia = 0;
    }
    
    // Hàm tạo có tham số
    public SanPham_Bai4(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    // Phương thức tính thuế nhập khẩu
    public double getThueNhapKhau() {
        return 0.1 * donGia;
    }
    
    // Phương thức xuất thông tin sản phẩm
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
    
    
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // Tạo đối tượng sản phẩm mới
	        SanPham_Bai4 sp = new SanPham_Bai4();
	        
	        // Nhập thông tin sản phẩm từ bàn phím
	        System.out.println("Nhập tên sản phẩm: ");
	        sp.setTenSp(scanner.nextLine());
	        System.out.println("Nhập đơn giá: ");
	        sp.setDonGia(scanner.nextDouble());
	        System.out.println("Nhập giảm giá: ");
	        sp.setGiamGia(scanner.nextDouble());
	        
	        // Xuất thông tin sản phẩm ra màn hình
	        sp.xuat();
	    }
	}
