package AbstractClass;
	
	abstract class Figure{
	  double dim1;
	  double dim2;
	  int x=4;
	public Figure(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	  abstract double area();
	}
//.......................................
	class Rectangle extends Figure{

		public Rectangle(double dim1, double dim2) {
			super(dim1, dim2);
		}
		@Override
		double area() {
			System.out.println("Inside the Rectangle ");
			return dim1*dim2;
		}
	}
//.......................................
	class Triangle extends Figure{

		public Triangle(double dim1, double dim2) {
			super(dim1, dim2);
		}
		@Override
		double area() {
			System.out.println("Inside Triangle area");
			return (dim1*dim2)/2;
		}
		
	}
//.......................................
public class ExampleAbstruct {

	public static void main(String[] args) {
		Rectangle objR=new Rectangle(10, 20);
		Triangle  objT=new Triangle(20, 30);
		Figure objF;
		
		objF=objR;
		System.out.println("Area is "+objF.area());
		objF=objT;
		System.out.println("Area is "+objF.area());
		
	}

}
