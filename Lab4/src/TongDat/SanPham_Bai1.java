/**
 * 
 */
package TongDat;

/**
 * 
 */
import java.util.*;
public class SanPham_Bai1 {
	String tenSp;
	double donGia;
	double giamGia;
	
	// Constructor
	public SanPham_Bai1() {
		
	}
	public SanPham_Bai1(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	// phuong thuc tinh thue nhap khau
	public double getThueNhapKhau() {
		return 0.1 * donGia;
		
	}
	// pt xuất thông tin ra màn hình
	public void Xuat() {
		System.out.println("Tên sản phẩm:" + tenSp);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Giảm giá:" + giamGia);
		System.out.println("Thuế nhập khẩu:" + getThueNhapKhau());
	}
	// Phương thức nhập thông tin sản phẩm từ bàn phím
	
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.println("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }
	
	
	
	
 // Getter và Setter
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public static void main(String[] args) {
        SanPham_Bai1 sp = new SanPham_Bai1();
        sp.Nhap();
        sp.Xuat();
    }

}
