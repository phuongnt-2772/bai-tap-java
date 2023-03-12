package baitapquanlyphuongtiengiaothong;

import java.util.Scanner;

public class XeMay extends PhuongTienGiaoThong {
	private double congSuat;

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}

	@Override
	public void hienThongTin() {
		super.hienThongTin();
		System.out.println("Công suất: " + this.congSuat);
	}

	@Override
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhập công suất: ");
		congSuat = Float.parseFloat(sc.nextLine());
	}
}