package baitapquanlyhocsinh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School school = new School();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập so luong hoc sinh: ");
		int soLuong = Integer.parseInt(scanner.nextLine());
		 
		for(int i=0; i< soLuong; i++) {
			Student student = new Student();

			System.out.println("Nhập họten: ");
			student.fullName = scanner.nextLine();
			System.out.println("Nhập tuổi: ");
			student.age = Integer.parseInt(scanner.nextLine());
			System.out.println("Nhập quê quán: ");
			student.address = scanner.nextLine();
				
			school.Themhocsinh(student);
		}
		 
		System.out.println("==========================================");
		school.Hienthihocsinh();
		school.hienThiHocSinh23Tuoi();
	}

}
