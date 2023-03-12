package baitapquanlyphuongtiengiaothong;

import java.util.Scanner;

public class ChuXe {
	private int soCMND;
	private String hoTen;
	private String eMail;

	public void themThongtin(Scanner sc) {
		System.out.print("Nhập số CMND: ");
		soCMND = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập Họ Tên: ");
		hoTen = sc.nextLine();
		System.out.print("Nhập email: ");
		eMail = sc.nextLine();
	}

	public int getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(int soCMND) {
		this.soCMND = soCMND;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public void hienThongTin() {
		System.out.println("Số CMND: " + this.soCMND);
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Email: " + this.eMail);
	}

}