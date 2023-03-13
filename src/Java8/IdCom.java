package Java8;

import java.util.Comparator;

public class IdCom implements Comparator<Studen> {

	@Override
	public int compare(Studen o1, Studen o2) {
		//String
		if((o1.name).equals(o2.name)) {
			return 0;	
		}
		return -1;
		
	}
	

}
