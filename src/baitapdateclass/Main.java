package baitapdateclass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int date, month, year;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập ngày: ");
		date = scanner.nextInt();
		System.out.println("Nhập tháng: ");
		month = scanner.nextInt();
		System.out.println("Nhập năm: ");
		year = scanner.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (date > 0 && date <= 31) {
				System.out.println("Ngày tháng năm hợp lệ");
				break;
			} else {
				System.out.println("Ngày tháng năm không hợp lệ");
				break;
			}

		case 4:
		case 6:
		case 9:
		case 11:
			if (date <= 30 && date > 0) {
				System.out.println("Ngày tháng năm hợp lệ");
				break;
			} else {
				System.out.println("Ngày tháng năm không hợp lệ");
				break;
			}

		case 2:
			if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0 && date <= 29 && date > 0) {
				System.out.println("Đây là năm nhuận và ngày tháng năm hợp lệ");
				break;
			} else if (date <= 28 && date > 0) {
				System.out.println("Ngày tháng năm hợp lệ");
				break;
			} else {
				System.out.println("Ngày tháng năm không hợp lệ");
				break;
			}

		default:
			System.out.println("Ngày tháng năm không hợp lệ");
			break;
		}

		System.out.println("===============");
		if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
			System.out.println(year + " là năm nhuận");
		} else
			System.out.println("Đây không phải là năm nhuận");
	}
}