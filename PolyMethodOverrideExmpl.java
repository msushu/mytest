class shape{
	void area() {
		System.out.println("I am square");
	}
}

class rectangle extends shape{
	void area() {
		System.out.println("I am rect");
	}
}

class circle extends shape{
	void area() {
		System.out.println("I am circle");
	}
}
public class PolyMethodOverrideExmpl {

	public static void main(String[] args) {
		shape sh=new shape();
		sh.area();
		circle c=new circle();
		c.area();
		rectangle r= new rectangle();
		r.area();

	}

}
