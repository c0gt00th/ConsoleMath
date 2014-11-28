import java.util.Scanner;

public class menu {

	static Scanner scan = new Scanner(System.in);
	static String input = "";
	static int choice = 0;
	static number n = new number();
	
	public static void main(String[] args) {
		promptMenu();
		
		while(!n.checkIfNumber(input) && !acceptableAnswer(choice)){
			clearConsole();
			System.out.println("Error with input.  Please try again.");
			promptMenu();
		}
		
		choice = Integer.parseInt(input);
		
		switch(choice){
			case 1: 
				clearConsole();
				System.out.print("Please enter the number: ");
				input = scan.nextLine();
				while(!validateNumber(input)){
					System.out.println("Error with input.  Please try again.");
					clearConsole();
					System.out.print("Please enter the number: ");
					input = scan.nextLine();
				}
				n.setValue(input);
				break;
			default:
				break;
		}
	}

	private static Boolean acceptableAnswer(int test){
		if(test == 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static void promptMenu(){
		System.out.println("Welcome to my Math Suite");
		System.out.println("\nPlease select an option below:");
		System.out.println("-----------------------------");
		System.out.println("1. Number Information");
		
		input = scan.nextLine();
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
