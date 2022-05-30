package AssignmentWeek4.Day3;

public class AxisBank extends BankInfo {
	

public void Deposit() {
	System.out.println("@overrides Deposit In Bank");
	
}
public static void main(String[] args) {
	AxisBank Bank = new AxisBank();
	Bank.saving();
	Bank.fixed();
	Bank.Deposit();
	
}
}
	
	



	

