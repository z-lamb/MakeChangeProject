package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		//  ask how much user needs to pay
		Scanner tender = new Scanner(System.in);
		System.out.println("How much do you need to pay?");
		double amountR = tender.nextDouble();
		int amountRequired = (int) (amountR * 100);
//		System.out.println(amountRequired);
		
		//  ask how much user is tendering
		System.out.println("Please enter the amount being given");
		double amountT = tender.nextDouble();
		int amountTendered = (int) (amountT * 100);
//		System.out.println(amountTendered);
		
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
	
	public static String changeMaker(int amountRequired, int amountTendered) {
		String changeMaker = "";
		int amountToChange = amountTendered - amountRequired;
		
		
		int bills20, bills10, bills5, bills1, coins25, coins10, coins5, coins1;
		System.out.println();
		
//		System.out.println(1-.67);
//		System.out.println(amountRequired);
//		System.out.println(amountTendered);
//		System.out.println(amountToChange);
		if(amountToChange >= 2000) {
			bills20 = (int) (amountToChange / 2000);
			changeMaker = changeMaker + (bills20 + " Twenty Dollar bills\n");
			amountToChange = amountToChange - (bills20 * 2000);
//			System.out.println(amountToChange);
		}
		if(amountToChange >= 1000) {
			bills10 = (int) (amountToChange / 1000);
			changeMaker = changeMaker + (bills10 + " Ten Dollar bills\n");
			amountToChange = amountToChange - (bills10 * 1000);
//			System.out.println(amountToChange);
		}
		if(amountToChange >= 500) {
			bills5 = (int) (amountToChange / 500);
			changeMaker = changeMaker + (bills5 + " Five Dollar bills\n");
			amountToChange = amountToChange - (bills5 * 500);
//			System.out.println(amountToChange);
		}
		if(amountToChange >= 100) {
			bills1 = (int) (amountToChange / 100);
			changeMaker = changeMaker + (bills1 + " One Dollar bills\n");
			amountToChange = amountToChange - (bills1 * 100);
//			System.out.println(amountToChange);
		}
		if(amountToChange >= 25) {
			coins25 = (int) (amountToChange / 25);
			changeMaker = changeMaker + (coins25 + " Quarters\n");
			amountToChange = amountToChange - (coins25 * 25);
//			System.out.println(amountToChange);
		}
		if(amountToChange >= 10) {
			coins10 = (int) (amountToChange / 10);
			changeMaker = changeMaker + (coins10 + " Dimes\n");
			amountToChange = amountToChange - (coins10 * 10);
//			System.out.println(amountToChange);
		}
		if(amountToChange >= 5) {
			coins5 = (int) (amountToChange / 5);
			changeMaker = changeMaker + (coins5 + " Nickels\n");
			amountToChange = amountToChange - (coins5 * 5);
//			System.out.println(amountToChange);
			
		}
		if(amountToChange >= 1) {
			coins1 = (int) (amountToChange / 1);
			changeMaker = changeMaker + (coins1 + " Pennies\n");
			amountToChange = amountToChange - (coins1 * 1);
//			System.out.println(amountToChange);
		}

		
//		System.out.println(totalChange);
		
		return changeMaker;
	}

}
