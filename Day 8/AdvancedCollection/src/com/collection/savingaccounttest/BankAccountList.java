package com.collection.savingaccounttest;

import java.util.Set;
import java.util.TreeSet;

import com.collection.savingaccount.SavingAccount;

public class BankAccountList {

	public static void main(String[] args) {
		
		Set<Object> bankAccount = new TreeSet<>();
		
		bankAccount.add(new SavingAccount(10000,59,"Sayali",false));
		bankAccount.add(new SavingAccount(20000,55,"Siddhi",true));
		bankAccount.add(new SavingAccount(15000,55,"Nishad",false));
		bankAccount.add(new SavingAccount(14000,58,"Mehek",true));
		bankAccount.add(new SavingAccount(16000,52,"Drishti",true));
		
		bankAccount.stream().forEach((account) -> System.out.println(account));

	}
}
