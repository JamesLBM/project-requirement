import java.util.Scanner;
 
public class Server extends ManagementServer {
	
	private int Order_No;
	private int Book_Number;
	
	public void PublicServer() {
		Scanner sc = new Scanner(System.in);
		flag = true;

		Print Text = new Print();
		Employee Casher = new Employee();
		
		while(flag) {
			Text.PrintMenuCustomer();
			choice = sc.nextInt();
			switch(choice) {
			case 0:
                flag = false;
				break;
			case 1:
				System.out.println("Insert your ID");
				ID = sc.nextInt();
				System.out.println("Insert your Name");
				Name = sc.next();
				System.out.println("Insert your Address");
				Address = sc.next();
				System.out.println("Insert your Sex");
				Sex = sc.next();
				System.out.println("Insert your Birthdate");
				Birthdate = sc.next();
				getString(Birthdate);
				System.out.println("Insert your Order Number");
				Order_No = sc.nextInt();
				System.out.println("Insert the Book Number");
				Book_Number = sc.nextInt();
				Casher.insertCustomer(ID, Name, Address, Sex, getString(Birthdate));
				Casher.InsertOrder(Order_No, Book_Number, Book_Number);
				Casher.InsertReceipt(Order_No, Order_No, Book_Number);
				System.out.println("-----------------------");
				System.out.println("Here is your Receipt: ");
				Casher.ViewCurrentReceipt();
				break;
			case 2:
				Casher.ViewCatalogue();
				break;
			default:
				Text.Valid();
				Text.Pause();
			}
		}
		Text.Exit();
	}
}
