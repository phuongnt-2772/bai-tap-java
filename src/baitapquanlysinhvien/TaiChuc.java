package baitapquanlysinhvien;

import java.time.LocalDate;
import java.util.ArrayList;

public class TaiChuc extends SinhVien {
	private String noiLienKet;

	public TaiChuc(int maSV, String hoTen, LocalDate ngayThang, int namNhaphoc, double diemDauvao, String noiLienKet,
			ArrayList kq) {
		super(maSV, hoTen, ngayThang, namNhaphoc, diemDauvao, kq);
		this.noiLienKet = noiLienKet;
	}

	public String getNoiLienKet() {
		return noiLienKet;
	}

	public void setNoiLienKet(String noiLienKet) {
		this.noiLienKet = noiLienKet;
	}
}