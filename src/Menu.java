import java.util.Scanner;

public class Menu {
public int showMenu() {
	System.out.println("<============ Welcome to Library Management System ============>\n1. Add book \n2. Check availability of book \n3. Find a book with detailed info \n4. Remove books \n5. Issue a book \n6. Return book \n7. Check book holders \n8. Register reader \n9. Cancel reader's membership \n10. Exit\n");
	System.out.print("Enter Option number from above:(1 - 10):");
	Scanner s=new Scanner(System.in);
	int n = s.nextInt();
//	s.close();
return n;
}
}
