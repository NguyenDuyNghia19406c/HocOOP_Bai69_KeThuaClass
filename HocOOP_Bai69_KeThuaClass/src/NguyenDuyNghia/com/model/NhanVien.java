package NguyenDuyNghia.com.model;

public class NhanVien {

	protected int ma;
	protected String ten;
	
	public NhanVien(int ma, String ten) {
		
		this.ma = ma;
		this.ten = ten;
	}
	
	public NhanVien() {
		
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public void tinhLuong()
	{
		System.out.println("Nhân Viên "+this.ten+"gọi tính Lương");
	}
}
