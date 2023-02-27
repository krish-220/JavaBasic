package coding;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	
int id;
String name;
String marks;
public Student(int id, String name, String marks) {
	
	this.id = id;
	this.name = name;
	this.marks = marks;
}
@Override
public int compare(T o1, T o2) {
	// TODO Auto-generated method stub
	return 0;
}


}
