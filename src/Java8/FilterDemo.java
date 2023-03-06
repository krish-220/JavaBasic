package Java8;
import java.util.*;

public class FilterDemo {

	public static void main(String[] args) {

		//filter using list
		// to print a string starting with m
		List<String> list = new ArrayList();
		list.add("muthu");
		list.add("muthu krishnan");
		list.add("arya");
		list.add("suriya");
		
		System.out.println(list);
		//using  normal iterator
		for(String s:list) {
			if(s.startsWith("m")){
			System.out.println(s);	
			}
		}
		
		//filter with stream in list
		list.stream().filter(t->t.startsWith("m")).forEach(t->System.out.println(t));
		
		//filter using map 
		// to print a even number
		Map<Integer,String> map = new HashMap();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
	
		//filter with stream in map
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
