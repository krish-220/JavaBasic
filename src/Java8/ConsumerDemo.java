package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//for each method accepting consumer functional interface.instead of passing reference(cons) we can directly passed the 
//lambda syntax of consumer interface

public class ConsumerDemo {

	/*@Override
	public void accept(Integer t) { 
		System.out.println(" printing :" +t);
		
	}*/
	public static void main(String[] args) {
		// this is normal using lambda with consumer
		/*Consumer<Integer> cons = (t)->{ 
			System.out.println("printing :" + t);
		};
		cons.accept(10);*/
		
//Using stream,for each 	
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		list1.stream().forEach(t ->System.out.println("print: " + t));
		
		
	}



}
