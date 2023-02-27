package Java8;

interface Addables{
	int subtract(int i1, int i2);
}

public class MulitpeParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addables a = (i1,i2)->{
			return i1 -i2;
		};
		System.out.println(a.subtract(20, 15));

	}

}
