package ATM_project;

import java.util.HashMap;
import java.util.Map;

public class AtmOperatonImple implements AtmOperation {

	ATM atm = new ATM();

	@Override
	public void viewBalance() {
		System.out.println("Available Balance is : " + atm.getBalance());

	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if (withdrawAmount % 100 == 0) {
			if (withdrawAmount <= atm.getBalance()) {
				System.out.println("Collect the Cash " + withdrawAmount);
				atm.setBalance(atm.getBalance() - withdrawAmount);
				viewBalance();
			} else {
				System.out.println("You do not have sufficient Balance");
				viewBalance();
			}
		}else {
			System.out.println("Enter the Amount in a multiple of 100");
		}

	}

	@Override
	public void depositAmount(double depositAmount) {
		if(depositAmount%100==0) {
		System.out.println(depositAmount + " Deposited Successfully");
		atm.setBalance(atm.getBalance() + depositAmount);
		viewBalance();
		}
		else {
			System.out.println("Enter the Amount in a multiple of 100");
		}
	}

}
