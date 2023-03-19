package baitapquanlysinhvien;

import java.time.LocalDate;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<KetQuaHocTap> listKQ1 = new ArrayList<KetQuaHocTap>();
		ArrayList<KetQuaHocTap> listKQ2 = new ArrayList<KetQuaHocTap>();
		ArrayList<KetQuaHocTap> listKQ3 = new ArrayList<KetQuaHocTap>();
		ArrayList<KetQuaHocTap> listKQ4 = new ArrayList<KetQuaHocTap>();

		KetQuaHocTap kq1 = new KetQuaHocTap("Hoc Ky 1", 6.5);
		KetQuaHocTap kq2 = new KetQuaHocTap("Hoc Ky 2", 7.5);
		KetQuaHocTap kq3 = new KetQuaHocTap("Hoc Ky 1", 8.5);
		KetQuaHocTap kq4 = new KetQuaHocTap("Hoc Ky 2", 9.5);
		KetQuaHocTap kq5 = new KetQuaHocTap("Hoc Ky 1", 5.5);
		KetQuaHocTap kq6 = new KetQuaHocTap("Hoc Ky 2", 5);
		KetQuaHocTap kq7 = new KetQuaHocTap("Hoc Ky 2", 10);

		listKQ1.add(kq1);
		listKQ1.add(kq2);
		listKQ2.add(kq3);
		listKQ2.add(kq4);
		listKQ3.add(kq5);
		listKQ3.add(kq6);
		listKQ4.add(kq7);
		listKQ4.add(kq7);

		ArrayList<SinhVien> svKhoaTin = new ArrayList<SinhVien>();
		ArrayList<SinhVien> svKhoaToan = new ArrayList<SinhVien>();
		ArrayList<SinhVien> tatCaSinhVien = new ArrayList<SinhVien>();
		SinhVien svChinhquy1 = new ChinhQuy(123, "Nguyen Van A", LocalDate.of(2017, 4, 21), 2017, 9, listKQ1);
		SinhVien svChinhquy2 = new ChinhQuy(124, "Nguyen Thi T", LocalDate.of(2016, 6, 10), 2019, 7.5, listKQ1);
		SinhVien svChinhquy3 = new ChinhQuy(125, "Nguyen Ngoc P", LocalDate.of(2010, 8, 19), 2010, 6, listKQ2);
		SinhVien svTaichuc1 = new TaiChuc(126, "Tran Van Z", LocalDate.of(2012, 5, 1), 2012, 5, "DongNai", listKQ3);
		SinhVien svTaichuc2 = new TaiChuc(127, "Huynh Ba H", LocalDate.of(2005, 3, 5), 2012, 4, "CaMau", listKQ4);

		svKhoaTin.add(svChinhquy1);
		svKhoaTin.add(svChinhquy2);
		svKhoaTin.add(svChinhquy3);
		svKhoaToan.add(svTaichuc1);
		svKhoaToan.add(svTaichuc2);
		tatCaSinhVien.addAll(svKhoaToan);
		tatCaSinhVien.addAll(svKhoaTin);

		ArrayList<Khoa> khoa = new ArrayList<Khoa>();

		khoa.add(new Khoa("Toan", svKhoaTin));
		khoa.add(new Khoa("Anh", svKhoaTin));
		khoa.add(new Khoa("Van", svKhoaToan));

		SinhVien.hienThiSVChinhQuy(tatCaSinhVien);
		System.out.println("=================================");
		SinhVien.hienThidiemtrungbinh(tatCaSinhVien);
		System.out.println("=================================");
		Khoa.hocSinhChinhQuyMoiKhoa(khoa);
		System.out.println("=================================");
		Khoa.thuKhoaMoiKhoa(khoa);
		System.out.println("=================================");
		SinhVien.getSVtheoNoiLienKet(tatCaSinhVien);
		System.out.println("=================================");
		SinhVien.hocSinhGioiKyCuoi(tatCaSinhVien);
		System.out.println("=================================");
		SinhVien.hocSinhGioiNhat(tatCaSinhVien);
		System.out.println("=================================");
		SinhVien.thongke(tatCaSinhVien);
		System.out.println("=================================");
		SinhVien.sapXepPhuongTienGiamdan(tatCaSinhVien);
	}

}