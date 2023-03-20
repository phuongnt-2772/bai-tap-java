package baitapchuyentien;

public class Main {
	public static void main(String[] args) {
	Account a = new Account("abc","TK1",50);
	Account b = new Account("abc","TK2",10);
	
	System.out.println("Balance TK1: " + a.getBalance());
	System.out.println("Balance TK2: " + b.getBalance());
	
//	Nap tien vao TK 
	
	a.credit(20);
	System.out.println("=======================================");
	System.out.println("Balance TK1 sau khi nap tien vao: " + a.getBalance());
	System.out.println("=======================================");
	if(a.getBalance()>0) {
		System.out.println("TK duong");
	}
	else {
		System.out.println("TK am");
	}
	
//	Tru tien vao TK thanh cong
	
	a.debit(40);
	System.out.println("=======================================");
	System.out.println("Balance TK1 sau khi thanh toan: " + a.getBalance());
	
// Tham so am
	a.debit(-40);
	
//	Chuyen tien cho TK2
	
	a.transferTo(b, 10);
	System.out.println("=======================================");
	System.out.println("Balance TK1 sau khi chuyen tien: " + a.getBalance());
	System.out.println("Balance TK2 sau khi chuyen tien: " + b.getBalance());	    
	}
}