package org.bank;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("6% deposit");
	
}
public static void main(String[] args) {
	AxisBank ax = new AxisBank();
	ax.Bankinformation();
	ax.sav();
	ax.fix();
	ax.deposit();
	ax.loan();
	
}

}
