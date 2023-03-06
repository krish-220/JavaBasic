package Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		//iterate a list and map using for each:
		List<String> list = new ArrayList();
		list.add("muthu");
		list.add("krishnan");
		list.add("krish");
		list.add("suriya");
		
		for(String s:list) {
			System.out.println(s);
		}
		
		//we using lambda in for each method to print a value
		list.stream().forEach(t->System.out.println(t));
		
		
		Map<Integer,String> map = new HashMap();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
		// map for using iteration if we can directly using for each means we cannot access the pipeline method
		map.forEach((Key,Value)->System.out.println(Key+ ":" +Value));
		//for each in map to print a value
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		Consumer<String> consumer =(t)-> System.out.println(t);
		consumer.accept("hi, hello");
		
		//for each method this is the main example
		Consumer<String> consumer1 =(t)-> System.out.println(t);
		for(String s1:list){
			consumer1.accept(s1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
