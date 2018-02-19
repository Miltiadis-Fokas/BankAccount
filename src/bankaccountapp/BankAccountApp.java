package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
	List <Account> accounts = new LinkedList<Account>();
    
		
		
		/*
		Savings savacc1= new Savings("Miltiadis Fokas","455125",2500);
		Checking ckacc1= new Checking("Miltos Fokas","552552455",1500);
		
		savacc1.compound();
		savacc1.showInfo();
		
		System.out.println("******************");

		ckacc1.showInfo();
		
	*/
		String file= "C:\\Users\\miltos\\Desktop\\web dev\\NewBankAccounts.csv";
		List<String[]> newAccountHolders= utilities.CSV.read(file);
		for(String[] accountHolder:newAccountHolders) {
			String name=accountHolder[0];
			String sSN=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit= Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + sSN+" " + accountType + " $" + initDeposit);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name,sSN,initDeposit));
				//System.out.println("OPEN SAVINGS ACCOUNT");
			}else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name,sSN,initDeposit));
				//System.out.println("OPEN A CHECKING ACCOUNT");
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
			/*
			System.out.println("NEW ACCOUNT HOLDER");
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
			*/
		}
		
		for(Account acc : accounts) {
			System.out.println("*************************");
			acc.showInfo();
			
		}
		
		
		//accounts.get((int) Math.random()* accounts.size()).deposit(1000);
		//savacc1.deposit(5000);
		//savacc1.withdraw(4125);
		//savacc1.transfer("Iordanis Fokas", 500);
	}

}
