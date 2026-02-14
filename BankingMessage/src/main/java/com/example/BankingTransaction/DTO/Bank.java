package com.example.BankingTransaction.DTO;

public class Bank {
public String id;
public String name;
public String choice;
public double amount;
public Bank(String id, String name, String choice, double amount) {
	super();
	this.id = id;
	this.name = name;
	this.choice = choice;
	this.amount = amount;
}
public Bank() {
	super();
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
public String getChoice() {
	return choice;
}
public void setChoice(String choice) {
	this.choice = choice;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Bank [id=" + id + ", name=" + name + ", choice=" + choice + ", amount=" + amount + "]";
}



}
