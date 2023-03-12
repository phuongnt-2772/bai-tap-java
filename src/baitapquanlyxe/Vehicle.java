package baitapquanlyxe;

public class Vehicle {
	private String loaiXe;
	private double giaTri, tienThue;
	int soCho;

	public Vehicle(String loaiXe, double giaTri, double tienThue, int soCho) {
		this.giaTri = giaTri;
		this.loaiXe = loaiXe;
		this.tienThue = tienThue;
		this.soCho = soCho;
	}

	public Vehicle() {

	}

	public String getloaiXe() {
		return loaiXe;
	}

	public void setloaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public double getGiaTri() {
		return giaTri;
	}

	public void setGiaTri(double giaTri) {
		this.giaTri = giaTri;
	}

	public int getSoCho() {
		return soCho;
	}

	public void setSoCho(int soCho) {
		this.soCho = soCho;
	}

	public double getTienThue() {
		return tienThue;
	}

	public void setTienThue(double tienThue) {
		this.tienThue = tienThue;
	}

	public double tienThue() {
		double VAT = 10 * 0.01;
		if (loaiXe == "Xedap")
			tienThue = 0;
		else if (loaiXe == "Xemay")
			tienThue = VAT + 0.05;
		else if (loaiXe == "Xeototai")
			tienThue = VAT + 0.02;
		else if (loaiXe == "Xeotokhach" && soCho < 5)
			tienThue = VAT + 0.07;
		else
			tienThue = VAT + 0.05;
		return tienThue;

	}

	@Override
	public String toString() {
		return "Vehicle [loaiXe=" + loaiXe + ", giaTri=" + giaTri + ", tienThue=" + tienThue + ", soCho=" + soCho + "]";
	}
}