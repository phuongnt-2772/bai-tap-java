package baitapquanlyxe;

public class Main {
	public static void main(String[] args) {
		Vehicle loaiXe1 = new Vehicle();
		Vehicle loaiXe2 = new Vehicle();
		Vehicle loaiXe3 = new Vehicle();
		Vehicle loaiXe4 = new Vehicle();
		loaiXe1.setloaiXe("Xedap");
		loaiXe2.setloaiXe("xemay");
		loaiXe3.setloaiXe("Xeotokhach");
		loaiXe4.setloaiXe("Xeototai");
		loaiXe4.setSoCho(5);

		System.out.println("Loại xe: " + loaiXe1.getloaiXe());
		System.out.println("Tiền Thuế: " + loaiXe1.tienThue());
		System.out.println("================================");

		System.out.println("Loại xe: " + loaiXe2.getloaiXe());
		System.out.println("Tiền Thuế: " + loaiXe2.tienThue());
		System.out.println("================================");

		System.out.println("Loại xe: " + loaiXe3.getloaiXe());
		System.out.println("Tiền Thuế: " + loaiXe3.tienThue());
		System.out.println("================================");

		System.out.println("Loại xe: " + loaiXe4.getloaiXe());
		System.out.println("Tiền Thuế: " + loaiXe4.tienThue());
	}
}

