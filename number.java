
public class number {
	
	double value = 0;
	
	public Boolean isPrime(){
		for(int counter = 2; counter < value; counter++){
			if(value % counter == 0){
				return false;
			}
		}
		return true;
	}

	public void setValue(String input){
		value = Double.parseDouble(input);
	}
	
	//Stackoverflow Page: http://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-a-numeric-type-in-java
	public Boolean validateNumber(String input){
		try{
			@SuppressWarnings("unused")
			double d = Double.parseDouble(input);
		}
		catch(NumberFormatException nfe){
			return false;
		}
		return true;
	}
	
	public void displayNumberData(double input){
		System.out.println("Your number: " + String.valueOf(input));
		System.out.println("-----------------------------");
		System.out.print("Is Prime?: ");
		
		if(isPrime()){
			System.out.println("true");
		}
		
		else{
			System.out.println("false");
		}
		
		System.out.println("\n1First 25 multiples: ");
		
		printMultiples(input);
	}
	
	private void printMultiples(double input){
		for(int counter = 0; counter <= 4; counter++){
			for(int subcounter = 1; subcounter <= 5; subcounter++){
				System.out.print(String.valueOf(input * (subcounter + (counter * 5))) + "\t");
			}
			System.out.println("");
		}
	}
}
