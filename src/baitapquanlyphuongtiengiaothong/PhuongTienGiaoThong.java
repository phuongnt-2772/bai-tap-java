package baitapquanlyphuongtiengiaothong;

import java.util.Scanner;

public class PhuongTienGiaoThong {
	private int soXe;
	private String nhaSX;
	private int namSX;
	private String mauXe;
	private ChuXe chuXe;

	public PhuongTienGiaoThong(int soXe, String nhaSX, int namSX, String mauXe, ChuXe chuXe) {
		super();
		this.soXe = soXe;
		this.nhaSX = nhaSX;
		this.namSX = namSX;
		this.mauXe = mauXe;
		this.chuXe = chuXe;
	}

	public PhuongTienGiaoThong() {
	};

	public int getSoXe() {
		return soXe;
	}

	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}

	public String getNhaSX() {
		return nhaSX;
	}

	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}

	public int getNamSX() {
		return namSX;
	}

	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}

	public String getMauXe() {
		return mauXe;
	}

	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}

	public ChuXe getChuXe() {
		return chuXe;
	}

	public void setChuXe(ChuXe chuXe) {
		this.chuXe = chuXe;
	}

	public void hienThongTin() {
		System.out.println("Số xe: " + this.soXe);
		System.out.println("Nhà sản xuất: " + this.nhaSX);
		System.out.println("Năm sản xuất : " + this.namSX);
		System.out.println("Màu xe: " + this.mauXe);
		chuXe.hienThongTin();
	}

	public void nhap(Scanner sc) {
		System.out.print("Nhập số xe: ");
		soXe = Integer.parseInt(sc.nextLine());

		System.out.print("Nhập nhà sản xuất: ");
		nhaSX = sc.nextLine();

		System.out.print("Nhập năm sản xuất: ");
		namSX = Integer.parseInt(sc.nextLine());

		System.out.print("Nhập màu xe: ");
		mauXe = sc.nextLine();

		ChuXe chuXe = new ChuXe();
		chuXe.themThongtin(sc);
		this.chuXe = chuXe;
	}
}