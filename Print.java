/*
 * Used to store print methods
 */
import java.util.Scanner;

public class Print {
	public void Pause(){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Press enter to continue...");
		String a1 = sc.nextLine();
	}
	public void Selection(){
		System.out.println("Select Mode:");
		System.out.println("Any# - Customer Mode");
		System.out.println("0 - Manager Mode");
		System.out.println();
	}
	public void PrintMenu(){
		System.out.println();
		System.out.println("Welcome back! Manager Natas...");
		System.out.println();
		System.out.println("Menu:");
		System.out.println();
		System.out.println("0 - Exit");
		System.out.println("-----------------------------");
		System.out.println("1 - Insert Book");
		System.out.println("2 - Remove Book");
		System.out.println("3 - View all Book Database");
		System.out.println("-----------------------------");
		System.out.println("4 - Insert Employee");
		System.out.println("5 - Remove Employee");
		System.out.println("6 - View all Employee Database");
		System.out.println("-----------------------------");
		System.out.println("7 - Insert Customer");
		System.out.println("8 - Remove Customer");
		System.out.println("9 - View all Customer Database");
		System.out.println("-----------------------------");
		System.out.println("10 - Insert Catalogue");
		System.out.println("11 - Remove Catalogue");
		System.out.println("12 - View all Catalogue Database");	
		System.out.println();
		System.out.print("Choice: ");	
	}	
	public void PrintMenuCustomer(){
		System.out.println();
		System.out.println("Welcome Fellow Customer!");
		System.out.println();
		System.out.println("Menu:");
		System.out.println();
		System.out.println("0 - Exit");
		System.out.println("-----------------------------");
		System.out.println("1 - Order Book");
		System.out.println("2 - View all Catalogue");
		System.out.println();
		System.out.print("Choice: ");	
	}
	public void Valid() {
		System.out.println("Please enter a valid choice: ");
	}
	public void Exit() {
		System.out.println();
		System.out.println("The Program have been exited!");
		System.out.println();
	}
}
