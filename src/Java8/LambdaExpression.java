package Java8;

// lambda expression with no arguments
interface Bike{
	void run();
}

// lambda expression

public class LambdaExpression {

	public static void main(String[]args) {
		Bike b =()->{
			System.out.println("bike is running");
		};
		b.run();
		
	}

	
}
	




