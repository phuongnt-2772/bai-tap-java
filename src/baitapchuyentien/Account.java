package baitapchuyentien;

import baitapchuyentien.Account;

public class Account {
private String id;
private String name;
private int balance;

//Khoi tao constructor

public Account(String id, String name, int balance) {
	this.id=id;
	this.name=name;
	this.balance=balance;
}



public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}

public void credit (int amount) {
	this.balance +=amount;
}

public void debit (int amount) {
	System.out.println("=======================================");
	if (amount > this.balance) {
		System.out.println("Thanh toan khong thanh cong");
		return;
	}
	if(amount<0) {
		System.out.println("Invalid params");
		return;
	}
	this.balance -=amount;
}

public void transferTo(Account account, int amount) {
	if (amount > this.balance) {
		System.out.println("=======================================");
		System.out.println("Chuyen tien khong thanh cong");
	} else {
		this.balance -=amount;
		account.credit(amount);
	}
}




}
