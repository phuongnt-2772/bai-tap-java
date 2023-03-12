package baitapquanlysieuthi;

public class HangDienMay extends Product {
	int baoHanh;
	double congSuat;

	public HangDienMay() {
		super();
	}

	public HangDienMay(int maHang, int soLuong, int tonKho, float donGia, int baoHanh, double congSuat) {
		super(maHang, soLuong, tonKho, donGia);
		this.baoHanh = baoHanh;
		this.congSuat = congSuat;
	}

	@Override
	public void danhGiatieuthu() {
		if (tonKho < 3) {
			System.out.println("Hang Dien May ban duoc");
		}
	}
}
