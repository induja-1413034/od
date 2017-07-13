package GuviLogic;
class areas{
	void circle(double d){
		System.out.println("The area of the circle is"+(d*d*3.14));
	}
	void rectangle(double d,double e){
		System.out.println("The area of the rectangle is"+(d*e));
	}
	void triangle(double d,double e){
		System.out.println("The area of the triangle"+(d*e*0.5));
	}
}
public class area {
public static void main(String[] args){
	areas a=new areas();
	a.circle(10.5);
	a.rectangle(23.5, 43.7);
	a.triangle(45.3, 31.9);
}
}