package baitapquanlysinhvien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private LocalDate ngayThang;
	private int namNhaphoc;
	private double diemDauvao;
	ArrayList<KetQuaHocTap> kq = new ArrayList<KetQuaHocTap>();

	public SinhVien(int maSV, String hoTen, LocalDate ngayThang, int namNhaphoc, double diemDauvao,
			ArrayList<KetQuaHocTap> kq) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngayThang = ngayThang;
		this.namNhaphoc = namNhaphoc;
		this.diemDauvao = diemDauvao;
		this.kq = kq;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public LocalDate getNgayThang() {
		return ngayThang;
	}

	public void setNgayThang(LocalDate ngayThang) {
		this.ngayThang = ngayThang;
	}

	public int getNamNhaphoc() {
		return namNhaphoc;
	}

	public void setNamNhaphoc(int namNhaphoc) {
		this.namNhaphoc = namNhaphoc;
	}

	public double getDiemDauvao() {
		return diemDauvao;
	}

	public void setDiemDauvao(double diemDauvao) {
		this.diemDauvao = diemDauvao;
	}

	public ArrayList<KetQuaHocTap> getKq() {
		return kq;
	}

	public void setKq(ArrayList<KetQuaHocTap> kq) {
		this.kq = kq;
	}

	public void hienThithongtin() {
		System.out.println("SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", ngayThang=" + ngayThang + ", namNhaphoc="
				+ namNhaphoc + ", diemDauvao=" + diemDauvao + ", kq=" + kq + "]");
	}

	public static void hienThiSVChinhQuy(ArrayList<SinhVien> dsSV) {
		System.out.println("Danh sách sinh viên chính quy là: ");
		for (int i = 0; i < dsSV.size(); i++) {
			SinhVien sv = dsSV.get(i);
			if (sv instanceof ChinhQuy) {
				sv.hienThithongtin();
			}
		}
	}

	public static void hienThidiemtrungbinh(ArrayList<SinhVien> dsSV) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên bạn muốn hiển thị điểm trung bình: ");
		int maSV = sc.nextInt();
		for (int i = 0; i < dsSV.size(); i++) {
			SinhVien sv = dsSV.get(i);
			if (maSV == sv.maSV) {
				System.out.println(sv.hoTen);
				for (int j = 0; j < sv.kq.size(); j++) {
					KetQuaHocTap kq = sv.kq.get(j);
					kq.hienThiDiem();
				}
			}
		}
	}

	public static void getSVtheoNoiLienKet(ArrayList<SinhVien> dsSV) {
		ArrayList<TaiChuc> svTaiChuc = new ArrayList<TaiChuc>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập nơi liên kết bạn muốn tìm kiếm: ");
		String noiLienKet = sc.nextLine();
		for (int i = 0; i < dsSV.size(); i++) {
			SinhVien sv = dsSV.get(i);
			if (sv instanceof TaiChuc) {
				svTaiChuc.add((TaiChuc) sv);
			}
		}
		for (int i = 0; i < svTaiChuc.size(); i++) {
			TaiChuc svtc = svTaiChuc.get(i);
			if (svtc.getNoiLienKet().equals(noiLienKet)) {
				svtc.hienThithongtin();
			}
		}
	}

	public static void hocSinhGioiKyCuoi(ArrayList<SinhVien> dsSV) {
		System.out.println("Danh sách sinh viên ở học kỳ cuối có điểm trung bình từ 8.0 là: ");
		for (int i = 0; i < dsSV.size(); i++) {
			SinhVien sv = dsSV.get(i);
			KetQuaHocTap kq = sv.kq.get(sv.kq.size() - 1);
			if (kq.getDiemTrungbinh() >= 8) {
				sv.hienThithongtin();
			}
		}
	}

	public double getMaxDiemTrungBinh() {
		double max = 0;
		for (int i = 0; i < kq.size(); i++) {
			if (max < kq.get(i).getDiemTrungbinh()) {
				max = kq.get(i).getDiemTrungbinh();
			}
		}
		return max;
	}

	public static void hocSinhGioiNhat(ArrayList<SinhVien> dsSV) {
		double max = 0;
		System.out.println("Sinh viên có điểm trung bình học kỳ cao nhất là: ");
		for (int i = 0; i < dsSV.size(); i++) {
			SinhVien sv = dsSV.get(i);
			if (max < sv.getMaxDiemTrungBinh()) {
				max = sv.getMaxDiemTrungBinh();
			}
		}

		for (int i = 0; i < dsSV.size(); i++) {
			SinhVien sv = dsSV.get(i);
			if (max == sv.getMaxDiemTrungBinh()) {
				sv.hienThithongtin();
			}
		}
		System.out.println(max);
	}

	public static void thongke(ArrayList<SinhVien> dsSV) {
		ArrayList<Integer> namHoc = new ArrayList<Integer>();
		ArrayList<Integer> soLuong = new ArrayList<Integer>();
		System.out.println("Thống kê số lượng sinh viên theo năm vào học là: ");
		for (int i = 0; i < dsSV.size(); i++) {
			SinhVien sv = dsSV.get(i);
			if (namHoc.contains(sv.namNhaphoc)) {
				int index = namHoc.indexOf(sv.namNhaphoc);
				soLuong.set(index, soLuong.get(index) + 1);
			} else {
				namHoc.add(sv.namNhaphoc);
				soLuong.add(1);
			}
		}

		for (int i = 0; i < namHoc.size(); i++) {
			System.out.println(namHoc.get(i) + ": " + soLuong.get(i));
		}
	}

	public static void sapXepPhuongTienGiamdan(ArrayList<SinhVien> dsSV) {
		Collections.sort(dsSV, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return o1.getNamNhaphoc() > o2.getNamNhaphoc() ? -1 : 1;
			}
		});
		System.out.println("Sắp xếp thứ tự sinh viên giảm dần theo năm học:");
		for (int i = 0; i < dsSV.size(); i++) {
			SinhVien sv = dsSV.get(i);
			sv.hienThithongtin();
		}
	}
}