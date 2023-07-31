import java.util.Scanner;

public class Name {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first name: ");
	        String firstName = scanner.nextLine();
	        
	        System.out.print("Enter last name: ");
	        String lastName = scanner.nextLine();

	        printNameLength(firstName);
	        printFullName(firstName, lastName);

	    }
	
    private static void printNameLength(String name) {
        System.out.println("Cuantas letras tiene?: " + name.length());
    }

   

    private static void printFullName(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

   
}
