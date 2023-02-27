package coding;

import java.util.Arrays;
import java.util.List;

public class StreamEx {
	public static void main(String[] args) {
		List<Integer> obj=Arrays.asList(1,2,3,4,5);
		obj.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
	}

}
