package webapp.beans;

public class Calculator {
	
	private Calculator() {
		
	}
	static private Calculator calc;
	
	//singleton patten
	public static Calculator getInstance() {
		if (calc ==null)
			calc = new Calculator();
		
		return calc;
		
	}
	
	public int sum(int a, int b) {
		
		return a+b;
	}
	


}
