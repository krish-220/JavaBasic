package coding;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =121, rev=0, rem, temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=rev*10 + rem;
		}
		System.out.println("the number is:" + rev);
		if(temp==rev) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not a palindrome number");
		}
	}

}
