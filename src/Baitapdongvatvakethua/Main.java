package Baitapdongvatvakethua;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("cho muc", 3, "duc", "den", 3.5);
		Cat cat = new Cat("meo mun", 1, "cai", "den", 0.5);
		
		System.out.println(dog.toString());
		System.out.println(cat.toString());
	}
}
