import java.sql.*;
public class Operations {

	public void displayAllBooks(Connection conn) {
		String query = "SELECT * FROM books";

        try (PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
if(rs!=null) {
            System.out.printf("%-5s %-30s %-20s %-10s %-10s%n", "ID", "Title", "Author","Genre", "Quantity");
            System.out.println("----------------------------------------------------------------------------");
            while (rs.next()) {
                int id = rs.getInt("book_id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String genre=rs.getString("genre");
                int quantity = rs.getInt("copies");
                System.out.printf("%-5d %-30s %-20s %-10s %-10d%n", id, title, author,genre, quantity);
            }
}

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
