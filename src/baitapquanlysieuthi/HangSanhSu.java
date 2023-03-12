package baitapquanlysieuthi;

import java.time.LocalDate;

public class HangSanhSu extends Product{
	String nhaSX;
	LocalDate ngayNK;

	public HangSanhSu() {
		super();
	}

	public HangSanhSu(int maHang, int soLuong, int tonKho, float donGia, String nhaSX, LocalDate ngayNK) {
		super(maHang, soLuong, tonKho, donGia);
		this.nhaSX = nhaSX;
		this.ngayNK = ngayNK;
	}

	@Override
	public void danhGiatieuthu() {
		// TODO Auto-generated method stub
		if (tonKho > 50 && ngayNK.plusDays(10).isBefore(LocalDate.now())) {
			System.out.println("Hang Sanh Su ban cham");
		}
	}
}
