package AbstractandInterface;

public abstract class AbstractShape implements Shape {
	
	String coloroftheshape;
	
	public AbstractShape(String cots ) {
		this.coloroftheshape = cots;
		
	}
	

	public abstract double area ();;
	public abstract double perimeter();

}
