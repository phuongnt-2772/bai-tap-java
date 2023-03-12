package Baitapdongvatvakethua;

public class Animal {
	private String ten;
	private int tuoi;
	private String giong;
	
	
	public Animal(String ten, int tuoi, String giong) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.giong = giong;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getGiong() {
		return giong;
	}
	public void setGiong(String giong) {
		this.giong = giong;
	}
	@Override
	public String toString() {
		return "Animal [ten=" + ten + ", tuoi=" + tuoi + ", giong=" + giong + "]";
	}
}
