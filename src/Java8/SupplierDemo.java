package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {

               
	public static void main(String[] args) {
		/*Supplier<String> supplier =()-> {
			return "Muthu krishnan";                
		};*/
		
		//System.out.println(supplier.get());
		
		//using stream:
		
		/*List<String> list1 = Arrays.asList("u","b");
		System.out.println(list1.stream().findAny().orElseGet(supplier));*/
		
		//without any arguments in parameter
		/*List<String> list1 = Arrays.asList();
		System.out.println(list1.stream().findAny().orElseGet(supplier));*/
		
		//reference value directly passing
		List<String> list1 = Arrays.asList();
		System.out.println(list1.stream().findAny().orElseGet(()->"hi ......"));
		
		
	}

}
