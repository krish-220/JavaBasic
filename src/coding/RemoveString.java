package coding;

public class RemoveString {

	public static void main(String[] args) {
		String s1 = "A statement is a statement";
		String s2 = "statement a";
		String s3;
		String[] a1 =s2.split("\\s");
		String[] a2 =s1.split("\\s");
		
		int number = 0;
		
		for(int i =0; i<a1.length; i++) {
			
			for(int j=0; j<a2.length; j++) {
				
				number = a2[j].compareTo(a1[i]);
				
				if(number == 0) {
					s3= s1.replaceFirst(a2[j], "");
					s1=s3;
					break;
				}
			}
		}
		
		System.out.println(s1);

	}

}
