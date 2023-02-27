package Java8;

interface Biscuits{
	String s(String taste);
}

//lambda with single parameter

public class SingleParamaterLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Biscuits b = (taste)->{
			System.out.println("sweety");
			return taste;
			
		};
		System.out.println(b.s("hide"));

	}

}
