package Java8;
import java.util.*;

public class SortListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList();
		list.add(2);
		list.add(4);
		list.add(8);
		list.add(16);
		// sorting a list in normal way
		Collections.sort(list);//Ascending
		Collections.reverse(list);//Descending
		System.out.println(list);
		
		//using streams to sort
		// to print in  ascending order
		list.stream().sorted().forEach(s->System.out.println(s));
		// to print in descending order
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
