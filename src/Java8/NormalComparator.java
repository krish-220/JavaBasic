package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Studen {
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public Studen(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public Studen() {
		// TODO Auto-generated constructor stub
	}
	
}

public class NormalComparator {

	public static void main(String[] args) {
		
		List<Studen> list = new ArrayList();
		list.add(new Studen(1, "arath", 25));
		list.add(new Studen(2, "ara", 56));
		list.add(new Studen(3, "lokjhgfd", 89));
        Collections.sort(list,new IdCom());
        System.out.println(list
        		);
		
		
		
		

	}

}
