package baitapquanlysieuthi;

import java.util.Scanner;

public abstract class Product {
	int maHang;
	int soLuong;
	int tonKho;
	float donGia;
	public Product() {};
	public abstract void danhGiatieuthu();
	public Product(int maHang, int soLuong, int tonKho, float donGia) {
		super();
		this.maHang = maHang;
		this.soLuong = soLuong;
		this.tonKho = tonKho;
		this.donGia = donGia;
	}
	
	public void hienThongTin()
	{
	    System.out.println("Ma hang: "+this.maHang);
	    System.out.println("So luong: "+this.soLuong);
	    System.out.println("Ton Kho : "+this.tonKho);
	    System.out.println("Don gia: "+this.donGia);
	}

	public void nhap(Scanner sc) 
	{
		System.out.print("Nhap ma hang:");
		maHang=Integer.parseInt(sc.nextLine());
	    System.out.print("Nhap so luong: ");
	    soLuong=Integer.parseInt(sc.nextLine());

	    System.out.print("Nhap ton kho:");
	    tonKho=Integer.parseInt(sc.nextLine());

	    System.out.print("Nhap donGia:");
	    donGia=Float.parseFloat(sc.nextLine());
	}
	public int getMaHang() {
		return maHang;
	}
	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}	
}
