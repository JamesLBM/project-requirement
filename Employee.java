import java.sql.*;

public class Employee extends Manager{
	public void InsertOrder(int Order_No, int Book_Number, int ID) {
		Connection database;
		try {
			database = getConnection();
			PreparedStatement insert = database.prepareStatement("INSERT INTO Order(Order_No, Book_Number, ID)  VALUES(?,?,?)");
			insert.setInt(1, Order_No);
			insert.setInt(2, Book_Number);
			insert.setInt(3, ID);
			insert.execute();
			database.close();
		} 
		catch(Exception e){ 
			System.out.println(e);
		}
	}
	public void InsertReceipt(int Receipt_No, int Order_No, int ID) {
		Connection database;
		try {
			database = getConnection();
			PreparedStatement insert = database.prepareStatement("INSERT INTO Receipt(Receipt_No, Order_No, ID)  VALUES(?,?,?)");
			insert.setInt(1, Receipt_No);
			insert.setInt(2, Order_No);
			insert.setInt(3, ID);
			insert.execute();
			database.close();
		} 
		catch(Exception e){ 
			System.out.println(e);
		}
	}
	public void ViewCurrentReceipt() {
		Connection database;
		
		try {
			database = getConnection();
			PreparedStatement insert = database.prepareStatement("SELECT Receipt.Receipt_No, Order.Order_No FROM `Receipt` join Order ON Receipt.Receipt_No, Employee.SSN FROM `Receipt` join Employee ON Receipt.Receipt_No, Customer.ID FROM `Receipt` join Customer ON Receipt.Receipt_No");
			ResultSet rs = insert.executeQuery();
			System.out.println("Receipt_No:  Order_No:  SSN:  ID:");
			System.out.println(rs.getObject("Receipt_No") + " " + rs.getObject("Order_No")+ " " + rs.getObject("SSN") + " " + rs.getObject("ID"));
		} 
		catch(Exception e){ 
			System.out.println(e);
		}
	}
}
