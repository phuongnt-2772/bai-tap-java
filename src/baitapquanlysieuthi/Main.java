package baitapquanlysieuthi;

import java.time.LocalDate;
import java.util.Scanner;

import baitapquanlyphuongtiengiaothong.QuanLyPTGT;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HangSanhSu hangSanhSu = new HangSanhSu(123,3,51,55,"BatTrang", LocalDate.of(2023, 01, 15));
		HangDienMay hangDienMay = new HangDienMay(456,5,2,105,12,65);
		HangThucPham hangThucPham = new HangThucPham(789,10,4,200,LocalDate.of(2023, 01, 15), LocalDate.of(2023,02,15),"ABC");
		hangSanhSu.danhGiatieuthu();
		hangDienMay.danhGiatieuthu();
		hangThucPham.danhGiatieuthu();
		
		QuanLyDSHH manager = new QuanLyDSHH();
		manager.themnhieuHangHoa(sc);
	}
}
