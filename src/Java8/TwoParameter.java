package Java8;

//example program


interface Runnable{
	int Sub(int i1, int i2);
}

public class TwoParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r =(int i1, int i2)->{
			if( i1< i2) {
				System.out.println("jljk");
			}else {
				return i1-i2;
			}
			//return i1;
			return i1;
			
		};
		System.out.println(r.Sub(10, 20));

	}

}
