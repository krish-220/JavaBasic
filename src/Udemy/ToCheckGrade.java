package Udemy;

public class ToCheckGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int maths =60;
        int physics=75;
        int chemistry = 100;
        if(maths<=34||physics<35||chemistry<35){
            System.out.println("YOU GOT A FAIL MARK");
        }
        else{
           int average=(maths+physics+chemistry)/3;
            if(average<=59){
                System.out.println("c grade");
            }
            else if(average<=73){
                System.out.println("b grade");
            }else{
                System.out.println("a grade");
            }
            
        }
    }
}
