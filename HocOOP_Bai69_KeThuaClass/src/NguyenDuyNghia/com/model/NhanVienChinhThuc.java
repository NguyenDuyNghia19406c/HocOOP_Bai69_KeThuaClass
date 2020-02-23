package NguyenDuyNghia.com.model;

public class NhanVienChinhThuc extends NhanVien {
	public NhanVienChinhThuc() {
		// TODO Auto-generated constructor stub
		super();
	}

	public NhanVienChinhThuc(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}
	public void tinhLuong() {
		super.tinhLuong();
		System.out.println("==>Đây là nhân viên chính thức");
	}
	

}
