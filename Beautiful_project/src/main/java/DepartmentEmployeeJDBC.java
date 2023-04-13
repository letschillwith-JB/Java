import java.sql.*;
import java.util.Scanner;

public class DepartmentEmployeeJDBC {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/db11";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            Scanner inputScanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("1. Insert Employee Details");
                System.out.println("2. Get Employees in 'Account' Department");
                System.out.println("3. Delete Department by Department ID");
                System.out.println("4. Get Departments of Employees living in Mumbai");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = inputScanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int empId = inputScanner.nextInt();
                        inputScanner.nextLine(); // Consume newline character
                        System.out.print("Enter Employee Name: ");
                        String ename = inputScanner.nextLine();
                        System.out.print("Enter Employee Address: ");
                        String address = inputScanner.nextLine();
                        System.out.print("Enter Employee Mobile: ");
                        String mobile = inputScanner.nextLine();
                        System.out.print("Enter Department ID: ");
                        int deptId = inputScanner.nextInt();

                        String insertSql = "INSERT INTO Employee (empId, ename, address, mobile, deptId) " +
                                "VALUES (?, ?, ?, ?, ?)";
                        PreparedStatement insertStmt = conn.prepareStatement(insertSql);
                        insertStmt.setInt(1, empId);
                        insertStmt.setString(2, ename);
                        insertStmt.setString(3, address);
                        insertStmt.setString(4, mobile);
                        insertStmt.setInt(5, deptId);
                        insertStmt.executeUpdate();
                        System.out.println("Employee details inserted successfully!");
                        break;
                    case 2:
                        String accountDeptSql = "SELECT * FROM Employee e " +
                                "INNER JOIN Department d ON e.deptId = d.did " +
                                "WHERE d.dname = 'Account'";
                        ResultSet accountDeptResult = stmt.executeQuery(accountDeptSql);
                        System.out.println("Employees in 'Account' Department:");
                        while (accountDeptResult.next()) {
                            int empIdResult = accountDeptResult.getInt("empId");
                            String enameResult = accountDeptResult.getString("ename");
                            String addressResult = accountDeptResult.getString("address");
                            String mobileResult = accountDeptResult.getString("mobile");
                            System.out.println("Emp ID: " + empIdResult + ", Name: " + enameResult +
                                    ", Address: " + addressResult + ", Mobile: " + mobileResult);
                        }
                        accountDeptResult.close();
                        break;
                    case 3:
                        System.out.print("Enter Department ID to delete: ");
                        int deptIdToDelete = inputScanner.nextInt();
                        String deleteDeptSql = "DELETE FROM Department WHERE did = ?";
                        PreparedStatement deleteDeptStmt = conn.prepareStatement(deleteDeptSql);
                        deleteDeptStmt.setInt(1, deptIdToDelete);
                        int deleteDeptResult = deleteDeptStmt.executeUpdate();
                        if (deleteDeptResult > 0) {
                            System.out.println("Department with ID " + deptIdToDelete + " deleted successfully!");
                        } else {
                           
                        	System.out.println("No department found with ID " + deptIdToDelete + ". Deletion failed.");
                        }
                        break;
                        case 4:
                        String mumbaiDeptSql = "SELECT * FROM Employee e " +
                        "INNER JOIN Department d ON e.deptId = d.did " +
                        "WHERE e.address LIKE '%Mumbai%'";
                        ResultSet mumbaiDeptResult = stmt.executeQuery(mumbaiDeptSql);
                        System.out.println("Departments of Employees living in Mumbai:");
                        while (mumbaiDeptResult.next()) {
                        int deptIdResult = mumbaiDeptResult.getInt("did");
                        String dnameResult = mumbaiDeptResult.getString("dname");
                        String locationResult = mumbaiDeptResult.getString("location");
                        System.out.println("Dept ID: " + deptIdResult + ", Department Name: " +
                        dnameResult + ", Location: " + locationResult);
                        }
                        mumbaiDeptResult.close();
                        break;
                        case 5:
                        System.out.println("Exiting...");
                        break;
                        default:
                        System.out.println("Invalid choice. Please try again.");
                        }
                        } while (choice != 5);
	            stmt.close();
	            conn.close();
	        } catch (SQLException se) {
	            se.printStackTrace();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (stmt != null) stmt.close();
	            } catch (SQLException se2) {
	            }
	            try {
	                if (conn != null) conn.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	        }
	    }
}
