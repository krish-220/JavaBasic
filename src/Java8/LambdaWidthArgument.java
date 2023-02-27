package Java8;

interface Calci{
	void add(int input);
}


public class LambdaWidthArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calci c=(int input)->{
			System.out.println("Sum is :" + input);
		};
		c.add(95);
		
		
		
		
		
	}


}
