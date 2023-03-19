package baitapquanlysinhvien;

public class KetQuaHocTap {
	private String tenHocky;
	private double diemTrungbinh;

	public KetQuaHocTap(String tenHocky, double diemTrungbinh) {
		this.tenHocky = tenHocky;
		this.diemTrungbinh = diemTrungbinh;
	}

	public String getTenHocky() {
		return tenHocky;
	}

	public void setTenHocky(String tenHocky) {
		this.tenHocky = tenHocky;
	}

	public double getDiemTrungbinh() {
		return diemTrungbinh;
	}

	public void setDiemTrungbinh(double diemTrungbinh) {
		this.diemTrungbinh = diemTrungbinh;
	}

	public void hienThiDiem() {
		System.out.println("tenHocky=" + tenHocky + ", diemTrungbinh=" + diemTrungbinh);
	}
}