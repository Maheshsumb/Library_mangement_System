import java.sql.*;
public class LibraryManagementSystem {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","root");
		if (c!=null) {
			System.out.println("Connected Succesfully....");
			Menu m=new Menu();
			Operations o=new Operations();
			boolean exit=false;
			while(!exit) {
				int option=m.showMenu();
				switch (option) {
				case 1: {
			        System.out.println("<--- Add book --->");
			        break;
			    }
			    case 2: {
			        System.out.println("<--- Check availability of book --->");
			        o.displayAllBooks(c);
			        break;
			    }
			    case 3: {
			        System.out.println("<--- Find a book with detailed info --->");
			        break;
			    }
			    case 4: {
			        System.out.println("<--- Remove books --->");
			        break;
			    }
			    case 5: {
			        System.out.println("<--- Issue a book --->");
			        break;
			    }
			    case 6: {
			        System.out.println("<--- Return book --->");
			        break;
			    }
			    case 7: {
			        System.out.println("<--- Check book holders --->");
			        break;
			    }
			    case 8: {
			        System.out.println("<--- Register reader --->");
			        break;
			    }
			    case 9: {
			        System.out.println("<--- Cancel reader's membership --->");
			        break;
			    }
			    case 10: {
			        System.out.println("Thank You....");
			        exit=true;
			        break;
			    }
			    default: {
			        System.out.println("Invalid choice! Please try again.");
			    }
			}
			
		}
		}
		else {
			System.out.println("Not onnected !!!");
		}
		

	}

}
