package Java8;

interface Addable{
	void sum(int input);
}

public class OneParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable a = (int input)->{
			System.out.println("sum is:" + input);
		};
		a.sum(451);

	}

}
