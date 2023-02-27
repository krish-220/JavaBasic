package coding;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

class Bike{
	void display() {
		System.out.println("running with 120km");
	}
	void run1() {
		System.out.println("car");
		//display();
	}
}
class Honda extends Bike{
	void display() {
		System.out.println("running speedy");
	}
	
	
}


public class MAinEX {
	public static void main(String[] args) {
		Honda h = new Honda();
		//h.run1();
		
		//h.display();
		//Bike b = new Bike();
		h.display();
		
		
	
		
		
		

	
	
	}
}
		

