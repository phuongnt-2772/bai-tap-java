package baitapquanlyphuongtiengiaothong;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLyPTGT manager = new QuanLyPTGT();
		manager.themnhieuPhuongtien(sc);
		System.out.println("=======================================");
		manager.timPhuongTienTheoSoXe(sc);
		System.out.println("=======================================");
		manager.timPhuongTienTheoCMND(sc);
		System.out.println("=======================================");
		manager.xoaPhuongTienTheoNSX(sc);
		System.out.println("=======================================");
		manager.thongKePhuongTien();
		System.out.println("=======================================");
		manager.sapXepPhuongTienGiamdan();
	}
}