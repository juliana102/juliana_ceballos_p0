package projectZero.main;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import projectZero.pojos.Users;

public class projectZeroDriver {
	static Scanner scan = new Scanner(System.in);
	public static List<Users> users = new ArrayList<Users>();
	
	public static void main(String args[]) {
		/* FileWriter writer = new FileWriter("trackUsers.txt");
		for(Users name : users) {
			writer.write(Users.get(name));
		}
		writer.close(); */
		String userInput;
		do {
			System.out.println("Please choose one of the following");
			System.out.println("[1] New User");
			System.out.println("[2] Returning User");
			System.out.println("[3] exit");

			userInput = scan.nextLine();
			 
			switch(userInput) {
			
			case "1":
				if(userReg()) {
					System.out.println("Thank you for registering with us!");
				}else {
					System.out.println("There was a problem with your registration");
					
				}
				break;
			case "2":
				if(returnUser()) {
					System.out.println(users);
				}
				break;
				
			}
			
			} while (!"3".equals(userInput));
	}
	private static boolean userReg() {
		System.out.println("Enter first and last name");
		String name = scan.nextLine();
		System.out.println("Enter your age");
		int age = scan.nextInt();
		System.out.println("Enter your height in cm");
		double height = scan.nextDouble();
		System.out.println("Enter your weight");
		int weight = scan.nextInt();
		System.out.println("What is your current weight goal?");
		int weightGoal = scan.nextInt();
		System.out.println("What is your daily calorie goal intake?");
		int calorieGoal = scan.nextInt();
		Users user = new Users(name, age, height, weight, weightGoal, calorieGoal);
		users.add(user);
		System.out.println(user);
		return true;
	}
	private static boolean returnUser() {
		System.out.println("Enter your full name please");
		String name = scan.nextLine();
		if(users.contains(name)) {
			return true;
		}
		else {
			System.out.println("You have not registered with us yet. Click option [1] to register with us.");
		}
			return true;
		 }
		
	}
