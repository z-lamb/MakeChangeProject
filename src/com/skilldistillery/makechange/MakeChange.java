package com.skilldistillery.makechange;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		
		// calls requests() method to start the program
		requests();

	}

	private static void requests() {

		// requests amounts for purchase price and amount being tendered and stores it in an array
		// an array is not the best choice for this but I opted to use it to get the practice of using an array
		int[] requestsArr = new int[2];

		Scanner tender = new Scanner(System.in);
		System.out.print("Please input the total for your purchase:  $");
		double amountR = tender.nextDouble();
		requestsArr[0] = (int) (amountR * 100);

		System.out.print("Please enter the amount being tendered:  $");
		double amountT = tender.nextDouble();
		requestsArr[1] = (int) (amountT * 100);

		
//		checks to see if amount given is less than or equal to the purchase price
//		if amount is equal to purchase price the program will display a message and quit
//		if amount is is less than you will have the option to add more until enough or more has been given
//		if user will not give enough the program will display a message and quit
		while (requestsArr[0] >= requestsArr[1]) {
			if (requestsArr[0] == requestsArr[1]) {
				System.out.println("Thank you for giving exact change. Enjoy your purchase! ");
				tender.close();
				return;
			}
			else {
				System.out.print("You did not enter the correct amount. Would you like to add more? [Y]es / [N]o >> ");
				String extra = tender.next();
				switch (extra) {
				case "Y":
				case "y":
				case "Yes":
				case "yes":
					System.out.print("How much more will you be tendering: $");
					amountT = tender.nextDouble();
					requestsArr[1] = requestsArr[1] + (int) (amountT * 100);
					break;

				case "N":
				case "n":
				case "No":
				case "no":
					System.out.println("\nYou did not enter enough. We do not give our products to cherity.");
					System.out.println("Please take your $" + ((double)requestsArr[1]/100) + " and go away!");
					tender.close();
					return;
				default:
					System.out.println("Please enter Y or N\n");
				}
			}
		}
		
		
//		calls changeMaker() method to process change and returns to print out amount of change being given
		String changeMakerPrint = changeMaker(requestsArr);
		System.out.println(changeMakerPrint);
		System.out.println("Enjoy your purchase!");

		tender.close();
	}

	public static String changeMaker(int requestsArr[]) {
	
//		processes the change to be given as a result of tendering more than the purchase price
//		which adds to the string that is being returned to print the final change
//		the proper plural response will given if there are more than 1 denomination being given
		String changeMaker = "";
		int bills20, bills10, bills5, bills1, coins25, coins10, coins5, coins1;
		int amountToChange = requestsArr[1] - requestsArr[0];

		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println();
		System.out.println("Amount Tendered: $" + df.format((double)requestsArr[1] / 100));
		System.out.println("Amount Required: $" + df.format((double)requestsArr[0] / 100));
		System.out.println("Total Change: $" + df.format((double)amountToChange / 100));
		System.out.println();
		System.out.println("Your change is:");

		if (amountToChange >= 2000) {
			bills20 = amountToChange / 2000;
			if (bills20 == 1) {
				changeMaker = changeMaker + (bills20 + " Twenty Dollar Bill\n");
			}
			else {
				changeMaker = changeMaker + (bills20 + " Twenty Dollar Bills\n");
			}
			amountToChange = amountToChange - (bills20 * 2000);
		}
		if (amountToChange >= 1000) {
			bills10 = amountToChange / 1000;
			changeMaker = changeMaker + (bills10 + " Ten Dollar Bill\n");
			amountToChange = amountToChange - (bills10 * 1000);
		}
		if (amountToChange >= 500) {
			bills5 = amountToChange / 500;
			changeMaker = changeMaker + (bills5 + " Five Dollar Bill\n");
			amountToChange = amountToChange - (bills5 * 500);
		}
		if (amountToChange >= 100) {
			bills1 = amountToChange / 100;
			if (bills1 == 1) {
				changeMaker = changeMaker + (bills1 + " One Dollar Bill\n");
			}
			else {
				changeMaker = changeMaker + (bills1 + " One Dollar Bills\n");
			}
			amountToChange = amountToChange - (bills1 * 100);
		}
		if (amountToChange >= 25) {
			coins25 = amountToChange / 25;
			if (coins25 == 1) {
				changeMaker = changeMaker + (coins25 + " Quarter\n");
			}
			else {
				changeMaker = changeMaker + (coins25 + " Quarters\n");
			}
			amountToChange = amountToChange - (coins25 * 25);
		}
		if (amountToChange >= 10) {
			coins10 = amountToChange / 10;
			if (coins10 == 1) {
				changeMaker = changeMaker + (coins10 + " Dime\n");
			}
			else {
				changeMaker = changeMaker + (coins10 + " Dimes\n");
			}
			amountToChange = amountToChange - (coins10 * 10);
		}
		if (amountToChange >= 5) {
			coins5 = amountToChange / 5;
			changeMaker = changeMaker + (coins5 + " Nickel\n");
			amountToChange = amountToChange - (coins5 * 5);
		}
		if (amountToChange >= 1) {
			coins1 = amountToChange / 1;
			if (coins1 == 1) {
				changeMaker = changeMaker + (coins1 + " Penny\n");
			}
			else {
				changeMaker = changeMaker + (coins1 + " Pennies\n");
			}
			amountToChange = amountToChange - (coins1 * 1);
		}

		return changeMaker;
	}

}
