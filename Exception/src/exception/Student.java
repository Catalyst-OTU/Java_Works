package exception;

public class Student {

	public void validation(int age) throws StudentHandlingException {
		
		if(age < 18) {
			
			throw new StudentHandlingException("Hello, please you are not up to 18 years");
			
		}else {
			
			System.out.println("You are welcome");
		}
		
	}

}
