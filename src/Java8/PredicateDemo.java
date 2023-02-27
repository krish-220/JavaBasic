package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	
		public static void main(String[] args) {
		// normal predicate
			
		/*Predicate<Integer> predicate=(Integer t)-> {
			if(t%2==0) {
			return	true;
			}
			else
			return false;
		};
		System.out.println(predicate.test(9));*/
			
			//using lambda:
			/*Predicate <Integer> predicate = t-> t%2==0;
			System.out.println(predicate.test(6));*/
			
			//Using stream:
			
			/*List<Integer> list1 = Arrays.asList(1,2,3,4,5);
			list1.stream().filter(predicate).forEach(t->System.out.println("print the even no" +t));*/
			
			// we will directly used the lambda in filter object:
			
			List<Integer> list1 = Arrays.asList(1,2,3,4,5);
			list1.stream().filter(t-> t%2==0).forEach(t->System.out.println("print the even no" +t));
			
			
			
			
			
		}

}
