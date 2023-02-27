package coding;

import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(System.in);
		//System.out.println("enter the numbers");
		// without using third variable
		int x=5,y=6;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		//using third variable
		int a=5;
		int b=3;
		//a=input.nextInt();
		//b=input.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		

	}

}
// the logic is :
// a=5,b=3
//c=a -----c=5
//a=b------a=3
//b=c------b=5
