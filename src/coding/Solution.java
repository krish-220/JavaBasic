package coding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
//import java.io.; import java.util.;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.text.html.HTMLDocument.Iterator;
public class Solution {

public static void main(String[] args) {
 
	TreeSet<String> list = new TreeSet();
	list.add("gowtham");
	list.add("gowtham");
	//list.add(null);
	list.add("play boy");
	list.add("committed boy");
	//list.remove(1);
	//Collections.reverse(list);
	System.out.println(list);
	java.util.Iterator<String> itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		//System.out.println(itr.toString());
	}
	
}
}
