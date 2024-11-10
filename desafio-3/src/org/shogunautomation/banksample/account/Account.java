package org.shogunautomation.banksample.account;

public class Account {
	String ownerName;
	int balance;

	public Account (String ownerName, int initialBalance) {
		this.ownerName = ownerName;
		this.balance = initialBalance;
	}

	public int get_balance () {
		return this.balance;
	}

	public boolean withdraw (int value) {
		boolean success = false;
		if (this.balance < value) {
			success = false;
		} else {
			this.balance -= value;
			success = true;
		}
		return success;
	}

	public boolean deposit (int value) {
		boolean success = false;
		this.balance += value;
		success = true;
		return success;
	}
}

