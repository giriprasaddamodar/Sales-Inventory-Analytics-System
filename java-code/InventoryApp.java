import java.sql.*;
import java.util.Scanner;

public class InventoryApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/inventory_db";
        String user = "root";
        String password = "your_password"; // Replace this

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            while (true) {
                System.out.println("\n1. Add Product\n2. View Products\n3. Exit");
                System.out.print("Choose: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    String insertSQL = "INSERT INTO products (id, name, quantity, price) VALUES (?, ?, ?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(insertSQL);
                    pstmt.setInt(1, id);
                    pstmt.setString(2, name);
                    pstmt.setInt(3, qty);
                    pstmt.setDouble(4, price);
                    pstmt.executeUpdate();

                    System.out.println("Product added.");
                } else if (choice == 2) {
                    ResultSet rs = stmt.executeQuery("SELECT * FROM products");
                    System.out.println("ID | Name | Quantity | Price");
                    while (rs.next()) {
                        System.out.println(rs.getInt("id") + " | " +
                                           rs.getString("name") + " | " +
                                           rs.getInt("quantity") + " | " +
                                           rs.getDouble("price"));
                    }
                } else {
                    break;
                }
            }

            sc.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
