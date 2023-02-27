package codingquestions;

public class FibonanciSeries {

	public static void main(String[] args) {
		
		int c,a=1,b=1;
		c=0;
		System.out.println("1 1");
		while(c<=100) {
			c=a+b;
			System.out.println(c +" ");
			a=b;
			b=c;
		}

	}

}
