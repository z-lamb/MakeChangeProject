package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		//  ask how much user needs to pay
		Scanner tender = new Scanner(System.in);
		System.out.println("How much do you need to pay?");
		double amountRequired = tender.nextDouble();
		
		
		//  ask how much user is tendering
		System.out.println("Please enter the amount being given");
		double amountTendered = tender.nextDouble();
		
		
		//  display message if too little is entered
		if ( amountRequired == amountTendered ) {
			System.out.println("Thank you for giving exact change");
		}
		else if (amountRequired >= amountTendered) {
			System.out.println("You did not enter the correct amount. Please go away!");
		}
		else {
			String changeMaker = changeMaker(amountRequired, amountTendered);
			System.out.println(changeMaker);
		}
		
		//  display message if exact amount is tendered
		
		//  return how much change is being given
		
	}
	
	public static String changeMaker(double amountRequired, double amountTendered) {
		String changeMaker = "";
		double amountToChange = amountTendered - amountRequired;
		
		int totalChange = (int) (amountToChange * 100); 
		int bills20, bills10, bills5, bills1, coins25, coins10, coins5, coins1;
		System.out.println();
		
		if(totalChange >= 2000) {
			bills20 = (int) (totalChange / 2000);
			changeMaker = changeMaker + (bills20 + " Twenty Dollar bills\n");
			totalChange = totalChange - (bills20 * 2000);
		}
		if(totalChange >= 1000) {
			bills10 = (int) (totalChange / 1000);
			changeMaker = changeMaker + (bills10 + " Ten Dollar bills\n");
			totalChange = totalChange - (bills10 * 1000);
		}
		if(totalChange >= 500) {
			bills5 = (int) (totalChange / 500);
			changeMaker = changeMaker + (bills5 + " Five Dollar bills\n");
			totalChange = totalChange - (bills5 * 500);
		}
		if(totalChange >= 100) {
			bills1 = (int) (totalChange / 100);
			changeMaker = changeMaker + (bills1 + " One Dollar bills\n");
			totalChange = totalChange - (bills1 * 100);
		}
		
		System.out.println(totalChange);
		if(totalChange >= 25) {
			coins25 = (int) (totalChange / 25);
			changeMaker = changeMaker + (coins25 + " Quarters\n");
			totalChange = totalChange - (coins25 * 25);
			System.out.println(totalChange);
		}
		if(totalChange >= 10) {
			coins10 = (int) (totalChange / 10);
			changeMaker = changeMaker + (coins10 + " Dimes\n");
			totalChange = totalChange - (coins10 * 10);
		}
		if(totalChange >= 5) {
			coins5 = (int) (totalChange / 5);
			changeMaker = changeMaker + (coins5 + " Nickels\n");
			totalChange = totalChange - (coins5 * 5);
			System.out.println(totalChange);
			
		}
		if(totalChange >= 1) {
			coins1 = (int) (totalChange / 1);
			changeMaker = changeMaker + (coins1 + " Pennies\n");
			totalChange = totalChange - (coins1 * 1);
			System.out.println(totalChange);
		}

		
//		System.out.println(totalChange);
		
		return changeMaker;
	}

}
