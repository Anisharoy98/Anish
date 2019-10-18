package org.bank;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("6% deposit");}
	public void add() {
		System.out.println("0 %");
	}
	

public static void main(String[] args) {
	AxisBank ax = new AxisBank();
	ax.Bankinformation();
	ax.add();
	ax.sav();
	ax.fix();
	ax.deposit();
	ax.loan();
	
}

}
