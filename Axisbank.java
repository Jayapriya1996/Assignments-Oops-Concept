package org.college;
class Axisbank extends BankInfo {

public void deposit()
		{
			int deposit=200000;
			System.out.println("Deposit - "+deposit);
		}
public static void main(String[] args) {
	Axisbank obj=new Axisbank();
	BankInfo obj1=obj;
	BankInfo.saving();
	BankInfo.fixed();
	obj1.deposit();
	
	}

}
