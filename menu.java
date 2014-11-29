import java.util.Scanner;

public class menu {

	static Scanner scan = new Scanner(System.in);
	static String input = "";
	
	static number n = new number();
	static EquationHandler eh = new EquationHandler();
	
	public static void main(String[] args) {
		promptMainMenu();
		
		while(!n.validateNumber(input) && !acceptableAnswer(Integer.parseInt(input))){
			clearConsole();
			System.out.println("Error with input.  Please try again.");
			promptMainMenu();
		}
				
		switch(Integer.parseInt(input)){
			case 1: 
				clearConsole();
				System.out.print("Please enter the number: ");
				input = scan.nextLine();
				while(!n.validateNumber(input)){
					clearConsole();
					System.out.println("Error with input.  Please try again.");
					System.out.print("\nPlease enter the number: ");
					input = scan.nextLine();
				}
				n.setValue(input);
				n.displayNumberData(Double.parseDouble(input));
				break;
			case 2:
				clearConsole();
				promptEquationMenu();
				input = scan.nextLine();
				while(!n.validateNumber(input)){
					clearConsole();
					System.out.println("Error with input.  Please try again.");
					promptEquationMenu();
					input = scan.nextLine();
				}
				
				break;
			default:
				break;
		}
	}

	private static Boolean acceptableAnswer(int test){
		if(test == 1 || test == 2){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static void promptMainMenu(){
		System.out.println("Welcome to my Math Suite");
		System.out.println("\nPlease select an option below:");
		System.out.println("-----------------------------");
		System.out.println("1. Number Information");
		System.out.println("2. Solve Equation");
		System.out.print("\nSelection: ");
		
		input = scan.nextLine();
	}
	
	
	public static void promptEquationMenu(){
		System.out.println("Equations Sub-Menu");
		System.out.println("\nPlease select an option below:");
		System.out.println("-----------------------------");
	}
	//Stackoverflow Page: http://stackoverflow.com/questions/2979383/java-clear-the-console
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
}


