package bankaccountapp;

public class Savings extends Account {
	//List properties specific to a savings  account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//Constructor to initialize savings accounts properties 
		public Savings(String name,String sSN,double initDeposit) {
			super(name,sSN,initDeposit); 
			accountNumber="1"+accountNumber;
			
			setSafetyDepositBox();
			
		}
		
		@Override
		public void setRate() {
			rate=getBaseRate() - .25;
			
		}
		private void setSafetyDepositBox() {
			safetyDepositBoxID=(int) (Math.random()*Math.pow(10, 3));
			safetyDepositBoxKey=(int) (Math.random()*Math.pow(10, 4));
			
			//System.out.println(safetyDepositBoxID);
			
		}
	//List any methods to specific to the  savings account
		public void showInfo() {
			System.out.println("ACCOUNT TYPE: Savings");
			super.showInfo();
			System.out.println(
					"Your Savings Account features"+
					"\n Safety Deposit Box ID :"+safetyDepositBoxID+
					"\n Safety Deposit Box Key :"+safetyDepositBoxKey
					);
		}

		

}