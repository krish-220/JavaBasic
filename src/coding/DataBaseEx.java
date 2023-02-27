package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;



public class DataBaseEx {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(7,"dinesh","90"));
		list.add(new Student(10,"sarath","90"));
		list.add(new Student(6,"muthu","90"));
		Collections.sort(list);
		for(String s:list) {
			System.out.println(s);
		}
		
		
		
	
	
	
	
		
	
	}
}
