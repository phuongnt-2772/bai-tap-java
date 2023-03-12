package baitapquanlysieuthi;

import java.time.LocalDate;

public class HangThucPham extends Product{
	LocalDate ngaySX;
	LocalDate ngayHH;
	String nhaCC;
	
	public HangThucPham() {
		super();
	}

	public HangThucPham(int maHang, int soLuong, int tonKho, float donGia, LocalDate ngaySX, LocalDate ngayHH,
			String nhaCC) {
		super(maHang, soLuong, tonKho, donGia);
		this.ngaySX = ngaySX;
		this.ngayHH = ngayHH;
		this.nhaCC = nhaCC;
	}

	@Override
	public void danhGiatieuthu() {
		if (tonKho>0&& LocalDate.now().isAfter(ngayHH)) {
			System.out.println("Hang Thuc Pham Kho Ban");
		};	
	}
}
