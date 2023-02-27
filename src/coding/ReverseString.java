package coding;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name  ;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the string:");
		name = input.nextLine();
		
		String reverse="";
		
		for (int i=name.length()-1;i>0;i--) {
			reverse=reverse+name.charAt(i);		}
		System.out.println(reverse);

	}

}
// logic method flow: first check the character krishnan(7)
//7-1=6 6>=0 its true

