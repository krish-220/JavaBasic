package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int id;
	String name;
	
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

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public int compareTo(Student s) {
		if(id==s.id) {
			return 0;
		}else if(id<s.id) {
			return 1;
		}
		return -1;
	}
	
	
	
}

public class NormalComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(101,"krish"));
		list.add(new Student(105,"suriya"));
		list.add(new Student(103,"muthu"));
		
		System.out.println(list);
		Collections.sort(list);
		
		for(Student s: list) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
