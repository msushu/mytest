class Exmpl{
	void area(int s) {
		System.out.println("area is"+(s*s));
	}
	void area(int l,int b) {
		System.out.println("area is"+(l*b));
	}
	
}


class PolyMethodOverloadExmpl {

	public static void main(String[] args) {
		Exmpl s1=new Exmpl();
		s1.area(2);
		s1.area(2,6);

	}

}
