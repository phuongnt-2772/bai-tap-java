package Baitapdongvatvakethua;

public class Dog extends Animal{
	private String mauSac;
	private double trongLuong;
	
	public Dog(String ten, int tuoi, String giong, String mauSac, double trongLuong) {
		super(ten, tuoi, giong);
		this.mauSac = mauSac;
		this.trongLuong = trongLuong;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public double getTrongLuong() {
		return trongLuong;
	}
	public void setTrongLuong(double trongLuong) {
		this.trongLuong = trongLuong;
	}
	@Override
	public String toString() {
		return "Dog [ten= "+super.getTen()+",tuoi= "+super.getTuoi()+",giong= "+super.getGiong()+", mauSac=" + mauSac + ", trongLuong=" + trongLuong + "]";
	}
	
}
