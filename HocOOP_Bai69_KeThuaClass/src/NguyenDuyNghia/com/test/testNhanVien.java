package NguyenDuyNghia.com.test;
import NguyenDuyNghia.com.model.NhanVienChinhThuc;
import NguyenDuyNghia.com.model.NhanVienThoiVu;

public class testNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc teo=new NhanVienChinhThuc(1, "Nguyễn Văn Tèo");
		NhanVienThoiVu ty=new NhanVienThoiVu(2, "Trần Thị Tý");
		
		System.out.println("Tên của Tèo="+teo.getTen());
		
		teo.tinhLuong();
		ty.tinhLuong();
	}
		

	

}
