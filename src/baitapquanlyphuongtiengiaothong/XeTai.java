package baitapquanlyphuongtiengiaothong;

import java.util.Scanner;

public class XeTai extends PhuongTienGiaoThong {
	private Float trongTai;

	public Float getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(Float trongTai) {
		this.trongTai = trongTai;
	}

	@Override
	public void hienThongTin() {
		super.hienThongTin();
		System.out.println("Trọng tải của xe là: " + this.trongTai);
	}

	@Override
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhập trọng tải của xe: ");
		trongTai = Float.parseFloat(sc.nextLine());
	}
}