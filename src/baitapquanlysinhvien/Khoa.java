package baitapquanlysinhvien;

import java.util.ArrayList;

public class Khoa {
	private String tenKhoa;
	ArrayList<SinhVien> ds = new ArrayList<SinhVien>();

	public Khoa(String tenKhoa, ArrayList<SinhVien> ds) {
		this.tenKhoa = tenKhoa;
		this.ds = ds;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public ArrayList<SinhVien> getDs() {
		return ds;
	}

	public void setDs(ArrayList<SinhVien> ds) {
		this.ds = ds;
	}

	public void tongSoHocSinhChinhQuy() {
		int count = 0;
		for (int i = 0; i < ds.size(); i++) {
			SinhVien sv = ds.get(i);
			if (sv instanceof ChinhQuy) {
				count++;
			}
		}
		System.out.println("Tổng số học sinh của Khoa " + tenKhoa + " là: " + count);
	}

	public void thuKhoa() {
		double max = 0;
		for (int i = 0; i < ds.size(); i++) {
			SinhVien sv = ds.get(i);
			if (max < sv.getDiemDauvao()) {
				max = sv.getDiemDauvao();
			}
		}
		System.out.println("Sinh viên có điểm đầu vào cao nhất của khoa " + tenKhoa + " là: ");
		for (int i = 0; i < ds.size(); i++) {
			SinhVien sv = ds.get(i);
			if (max == sv.getDiemDauvao()) {
				sv.hienThithongtin();
			}
		}
	}

	public static void hocSinhChinhQuyMoiKhoa(ArrayList<Khoa> khoa) {
		for (int i = 0; i < khoa.size(); i++) {
			Khoa k = khoa.get(i);
			k.tongSoHocSinhChinhQuy();
		}
	}

	public static void thuKhoaMoiKhoa(ArrayList<Khoa> khoa) {
		for (int i = 0; i < khoa.size(); i++) {
			Khoa k = khoa.get(i);
			k.thuKhoa();
		}
	}
}