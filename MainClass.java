package ATM_project;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		AtmOperation op = new AtmOperatonImple();
		int atmnumber = 12345;
		int atmpin = 123;

		Scanner scn = new Scanner(System.in);

		System.out.println("Welcome to ATM Machine");

		System.out.print("Enter ATM Number : ");
		int atmNumber = scn.nextInt();

		System.out.print("Enter ATM Pin : ");
		int atmPin = scn.nextInt();

		if (atmnumber == atmNumber && atmpin == atmPin) {
			System.out.println("Validation Done");
			while (true) {
				System.out.println(" 1.View Available Balance \n 2.Withdraw Amount "
						+ "\n 3.Deposit Amount \n 4.Exit");
				System.out.print("Enter Choice : ");
				int ch = scn.nextInt();

				if (ch == 1) {

					op.viewBalance();
				} else if (ch == 2) {

					System.out.print("Enter Amount to Withdraw : ");
					double withdrawAmount = scn.nextDouble();
					op.withdrawAmount(withdrawAmount);
				} else if (ch == 3) {

					System.out.print("Enter Amount to Deposit : ");
					double depositAmount = scn.nextDouble();
					op.depositAmount(depositAmount);
				}  else if (ch == 4) {

					System.out.println("Please Collect your card \n" + 
					"Thanks for using our ATM Machine");
					System.exit(0);
				}
				else {
					System.out.println("Please Enter Correct Choice");
				}
				
			}
		} else if (atmnumber != atmNumber) {
			System.out.println("Enter Correct Atm Number");
		} else if (atmnumber == atmNumber && atmpin != atmPin) {
			System.out.println("Enter Correct Atm Pin");
		} else {
			System.out.println("Enter Correct Atm Number & Pin ");
		}
	}
}
