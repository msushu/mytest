/*
 *  added in featureAbranch*/


class Student{
	int rollno;
	void getno(int rno) {
		rollno = rno;
	}
	void putno() {
		System.out.println("the number is" +rollno);
	}
	
}	

class Marks extends Student{
	double marks;
	void getmarks(double m) {
		marks=m;
	}
	void putmarks() {
		System.out.println("the marks are" +marks);
	}
}
	
public class InheritanceExmpl {	
	public static void main(String[] args) {
		Marks mem = new Marks();
		mem.getmarks(122);
		mem.getno(4);
		mem.putno();
		mem.putmarks();
	}

}
