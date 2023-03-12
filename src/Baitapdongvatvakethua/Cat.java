package Baitapdongvatvakethua;

public class Cat extends Animal {
private String mauLong;
private double chieuCao;

public Cat(String ten, int tuoi, String giong, String mauLong, double chieuCao) {
	super(ten, tuoi, giong);
	this.mauLong = mauLong;
	this.chieuCao = chieuCao;
}

	@Override
	public String toString() {
		return "Cat [ten= "+super.getTen()+",tuoi= "+super.getTuoi()+",giong= "+super.getGiong()+",mauLong=" + mauLong + ", chieuCao=" + chieuCao + "]";}
	
	public String getMauLong() {
		return mauLong;
	}
	public void setMauLong(String mauLong) {
		this.mauLong = mauLong;
	}
	public double getChieuCao() {
		return chieuCao;
	}
	public void setChieuCao(double chieuCao) {
		this.chieuCao = chieuCao;
	}
	
	
}
