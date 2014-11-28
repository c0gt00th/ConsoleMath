
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
	public Boolean checkIfNumber(String input){
		try{
			@SuppressWarnings("unused")
			double d = Double.parseDouble(input);
		}
		catch(NumberFormatException nfe){
			return false;
		}
		return true;
	}
}
