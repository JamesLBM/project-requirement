import java.util.Scanner;

public class Start {
	
	private static int Choice;
	private static String Username;
	private static String Password;

	public static void Login() {
		Scanner sc = new Scanner(System.in);
		ManagementServer Manager = new ManagementServer();
		System.out.println("MANAGER LOGIN: ");
		System.out.println("------------------");
		System.out.println("Enter your Username: ");
		Username = sc.next();
		System.out.println("Enter your Password: ");
		Password = sc.next();
			if(Username.equals("Natas") || Username.equals("natas")  && Password.equals("123")) {
				System.out.println("Access Granted!");
				Manager.Server();
			}
			else { System.out.println("Access Denied!"); }
	}
	
	public static void Home() {
		Scanner sc = new Scanner(System.in);
		Server Customer = new Server();
		Print Text = new Print();
		Text.Selection();
		Choice = sc.nextInt();
		if (Choice == 0) {
			Login();
		}
		else {
			Customer.PublicServer();
		}
	}
}
