package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*List<Integer> list = Arrays.asList(12,3,15,6,18);
		System.out.println("====before====");
		System.out.println(list);
		
		//Before java 8
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
			if(x<y) {
				return -1;
			}else if(x>y){
				return 1;
			}
				return 0;
			}
			
		});
		
		System.out.println("====after====");
		System.out.println(list);*/
		
	//to sort a list in java8 using comparator with lambda
		List<Integer> list = Arrays.asList(12,3,15,6,18);
		Collections.sort(list, (x,y)->(x<y)? -1:(x>y)? 1: 0);
		System.out.println(list);

	}

}
