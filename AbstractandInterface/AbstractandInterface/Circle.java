package AbstractandInterface;

public class Circle extends AbstractShape{

	private static String cots;
	double radius;
	private String coloroftheshape;
	
	
	
	public Circle(String ccos,double r) {
		super(cots);
		this.radius=r;
		
		
		
	}
//	public void AbstractShape() {
//		super(coloroftheshape );
//	
//	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (3.14 *(Math.sqrt(radius)));
		
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (2*3.14*radius);
	}

	@Override
	public String toString() {
		return "Circle [radius is =" + radius + ", coloroftheshape is =" + coloroftheshape + "]";
	}
	
}
