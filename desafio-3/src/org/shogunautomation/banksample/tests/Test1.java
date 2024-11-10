package org.shogunautomation.banksample.tests;

import org.shogunautomation.banksample.account.Account;

public class Test1 {
	static void run () {
		System.out.print("Test 1...\t");
		String owner = "Jose";
		int initial_balance = 12000;
		Account demo_account = new Account(owner, initial_balance);
		//	Check if it initializes with success
		{
			int balance_got = demo_account.get_balance();
			assert(initial_balance == balance_got) : "Initial balance is different from the balance got";
		}
		//	A successful deposit
		{
			int deposit_value = 23000;
			boolean deposit_success = demo_account.deposit(deposit_value);
			assert(deposit_success) : "Got a deposit failure";
			int after_deposit_expect = 35000;
			int after_deposit_real = demo_account.get_balance();
			assert(after_deposit_expect == after_deposit_real) : "Balance after deposit is different from expected";
		}
		//	A failed withdraw
		{
			int invalid_withdraw_value = 90000;
			boolean withdraw_success = demo_account.withdraw(invalid_withdraw_value);
			assert(!withdraw_success) : "This withdraw was supposed to fail";
		}
		//	A successful withdraw
		{
			int valid_withdraw_value = 10000;
			boolean withdraw_success = demo_account.withdraw(valid_withdraw_value);
			assert(withdraw_success) : "A valid withdraw failed";
			int current_balance = demo_account.get_balance();
			int expected_balance = 25000;
			assert(current_balance == expected_balance) : "Balance after withdraw operation is different from expected";
		}
		System.out.println("OK");
	}
}

