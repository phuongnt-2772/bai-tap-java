package baitapquanlysieuthi;

import java.util.ArrayList;
import java.util.Scanner;

import baitapquanlyphuongtiengiaothong.PhuongTienGiaoThong;

public class QuanLyDSHH {
	ArrayList<Product> ds =new ArrayList<Product>();
	public void themHanghoa(Scanner sc) {
		System.out.print("Nhap loai hang hoa: ");
		String loaiHH = sc.nextLine();
		
		switch (loaiHH) {
			case "HangThucPham": 
				HangThucPham thucPham = new HangThucPham();
				thucPham.nhap(sc);
				if(kiemtraMaHH(thucPham.maHang)) {
					ds.add(thucPham);
				}
				break;
			case "HangDienMay": 
				HangDienMay dienMay = new HangDienMay();
				dienMay.nhap(sc);
				if(kiemtraMaHH(dienMay.maHang)) {
					ds.add(dienMay);
				}
				break;
			case "HangSanhSu": 
				HangSanhSu sanhSu = new HangSanhSu();
				sanhSu.nhap(sc);
				if(kiemtraMaHH(sanhSu.maHang)) {
					ds.add(sanhSu);
				}
				break;
			default: 
				System.out.println("Khong co loai hang ban can nhap");
				System.out.println("Vui long nhap lai");
				themHanghoa(sc);
		}
	}

	public void themnhieuHangHoa(Scanner sc) {
		while(true) {
			themHanghoa(sc);

			System.out.print("Ban co muon nhap them hang hoa khong?(y/n): ");
			String xacNhan = sc.nextLine();

			if (xacNhan.equals("n")) {
				break;
			}
		}
	}
	
	public boolean kiemtraMaHH(int maHH) {
		boolean kiemTra = true;
		for (int i = 0; i< ds.size(); i++) {
			Product hangHoa = ds.get(i);
			
			if (hangHoa.getMaHang() == maHH) {
				System.out.println("Ma hang nay da ton tai");
				kiemTra = false;
				break;
			}
		}
		return kiemTra;
	}
}
