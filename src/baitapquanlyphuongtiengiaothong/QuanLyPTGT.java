package baitapquanlyphuongtiengiaothong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyPTGT {
	int soLuongOto = 0;
	int soLuongXeMay = 0;
	int soLuongXeTai = 0;
	private ArrayList<PhuongTienGiaoThong> ds = new ArrayList<PhuongTienGiaoThong>();

	public void nhapPhuongTien(Scanner sc) {
		System.out.print("Nhập loại phương tiện giao thông: ");
		String loaiXe = sc.nextLine();
		switch (loaiXe) {
		case "OTo":
			OTo oTo = new OTo();
			oTo.nhap(sc);
			ds.add(oTo);
			soLuongOto++;
			break;
		case "XeMay":
			XeMay xeMay = new XeMay();
			xeMay.nhap(sc);
			ds.add(xeMay);
			soLuongXeMay++;
			break;
		case "XeTai":
			XeTai xeTai = new XeTai();
			xeTai.nhap(sc);
			ds.add(xeTai);
			soLuongXeTai++;
			break;
		default:
			System.out.println("Không có loại xe bạn cần nhập!");
			System.out.println("Vui lòng nhập lại: ");
			nhapPhuongTien(sc);
		}
	}

	public void themnhieuPhuongtien(Scanner sc) {
		while (true) {
			nhapPhuongTien(sc);
			System.out.println("=======================================");
			System.out.print("Bạn có muốn thêm phương tiện giao thông không? (y/n): ");
			String xacNhan = sc.nextLine();
			if (xacNhan.equals("n")) {
				break;
			}
		}
	}

	public void timPhuongTienTheoSoXe(Scanner sc) {
		System.out.print("Nhập số xe muốn tìm kiếm: ");
		int soXe = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < ds.size(); i++) {
			PhuongTienGiaoThong phuongTien = ds.get(i);
			if (phuongTien.getSoXe() == soXe) {
				phuongTien.hienThongTin();
			}
		}
	}

	public void timPhuongTienTheoCMND(Scanner sc) {
		System.out.print("Nhập số CMND muốn tìm kiếm: ");
		int cmnd = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < ds.size(); i++) {
			PhuongTienGiaoThong phuongTien = ds.get(i);
			if (phuongTien.getChuXe().getSoCMND() == cmnd) {
				phuongTien.hienThongTin();
			}
		}
	}

	public void xoaPhuongTienTheoNSX(Scanner sc) {
		System.out.print("Nhập tên NSX muốn xóa: ");
		String nsx = sc.nextLine();
		for (int i = 0; i < ds.size(); i++) {
			PhuongTienGiaoThong phuongTien = ds.get(i);
			if (phuongTien.getNhaSX().equals(nsx)) {
				ds.remove(i);
				i -= 1;
			}
		}
		System.out.println("Số lượng phương tiện còn lại sau khi xóa là: " + ds.size());
	}

	public void sapXepPhuongTienGiamdan() {
		Collections.sort(ds, new Comparator<PhuongTienGiaoThong>() {
			@Override
			public int compare(PhuongTienGiaoThong o1, PhuongTienGiaoThong o2) {
				return o1.getSoXe() > o2.getSoXe() ? -1 : 1;
			}
		});
		System.out.println("Danh sách phương tiện giao thông theo thứ tự giảm dần:");
		for (PhuongTienGiaoThong element : ds) {
			System.out.println(element.getSoXe());
		}
	}

	public void thongKePhuongTien() {
		System.out.println("Số lượng xe ô tô là: " + soLuongOto);
		System.out.println("Số lượng xe máy là: " + soLuongXeMay);
		System.out.println("Số lượng xe tải là: " + soLuongXeTai);
	}
}