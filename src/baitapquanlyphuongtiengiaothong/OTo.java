package baitapquanlyphuongtiengiaothong;

package selfstudy;

import java.util.Scanner;

public class OTo extends PhuongTienGiaoThong {
	private int soChongoi;
	private String kieuDongco;

	public int getSoChongoi() {
		return soChongoi;
	}

	public void setSoChongoi(int soChongoi) {
		this.soChongoi = soChongoi;
	}

	public String getKieuDongco() {
		return kieuDongco;
	}

	public void setKieuDongco(String kieuDongco) {
		this.kieuDongco = kieuDongco;
	}

	@Override
	public void hienThongTin() {
		super.hienThongTin();
		System.out.println("Số chỗ ngồi: " + this.soChongoi);
		System.out.println("Kiểu động cơ: " + this.kieuDongco);
	}

	@Override
	public void nhap(Scanner sc) {
		super.nhap(sc);

		System.out.print("Nhập số chỗ ngồi: ");
		soChongoi = Integer.parseInt(sc.nextLine());

		System.out.print("Nhập kiểu động cơ: ");
		String kieuDongco = sc.nextLine();
	}
}
