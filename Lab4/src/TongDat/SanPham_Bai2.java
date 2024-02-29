/**
 * 
 */
package TongDat;

/**
 * 
 */
import java.util.*;
public class SanPham_Bai2 {
	private String tenSp;
    private double donGia;
    private double giamGia;
    
    public double getThueNhapKhau() {
        return 0.1 * donGia;
    }
    public void Xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.println("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }
	public static void main(String[] args) {
		
		SanPham_Bai2 sp1 = new SanPham_Bai2();
		SanPham_Bai2 sp2 = new SanPham_Bai2();
        
        System.out.println("Thông tin sản phẩm thứ nhất:");
        sp1.Nhap();
        
        System.out.println("Thông tin sản phẩm thứ hai:");
        sp2.Nhap();
        
        System.out.println("Thông tin sản phẩm thứ nhất:");
        sp1.Xuat();
        
        System.out.println("Thông tin sản phẩm thứ hai:");
        sp2.Xuat();
    }
}