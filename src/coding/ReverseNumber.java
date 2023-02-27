package coding;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     int num =234, rev=0, rem;
	        while(num>0){
	          rem=num%10;
	          num = num/10;
	          rev=rev*10 + rem;
	          
	        }
	        System.out.println("the reverse number is :" + rev);

	}

}
