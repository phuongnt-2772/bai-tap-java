package baitapquanlysinhvien;

import java.time.LocalDate;
import java.util.ArrayList;

public class ChinhQuy extends SinhVien {
	public ChinhQuy(int maSV, String hoTen, LocalDate ngayThang, int namNhaphoc, double diemDauvao,
			ArrayList<KetQuaHocTap> kq) {
		super(maSV, hoTen, ngayThang, namNhaphoc, diemDauvao, kq);
	}
}