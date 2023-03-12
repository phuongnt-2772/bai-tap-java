package baitapquanlyhocsinh;

import java.util.ArrayList;


public class School {
	ArrayList<Student>studentList = new ArrayList<Student>();
	
	public void Themhocsinh(Student student) {
		studentList.add(student);
	}
	
	public void Hienthihocsinh () {
		System.out.println("Nhung hoc sinh 20 tuoi la: ");
		
		for(int i=0; i<studentList.size(); i++) {
			if(studentList.get(i).age==20) {
				System.out.println(studentList.get(i).fullName);
			}
		}
		
		System.out.println("==========================================");
	}
	
	public void hienThiHocSinh23Tuoi() {
		int count = 0;
		
		for(int i=0; i<studentList.size(); i++) {
			if(studentList.get(i).age==23 && studentList.get(i).address.equals("dn")) {
				count++;
			}
		}
		
		System.out.println("Co hoc sinh 23 tuoi va o da nang la: "+count);
	}
}
