package AbstractandInterface;

	public class Rectangle extends AbstractShape{

		
		private double length;
		private double bredth;
		private String coloroftheshape;
		
		public Rectangle(double l,double b,String rcs) {
			
			this.length=l;
			this.bredth=b;
			this.coloroftheshape=rcs;
			
			
		}
//		public Circle(String S) {
//			
//			super(coloroftheshape);
//		}

		@Override
		public double area() {
			// TODO Auto-generated method stub
			return (length*bredth);
		}

		@Override
		public double perimeter() {
			// TODO Auto-generated method stub
			return (2*(length+bredth));
		}

		@Override
		public String toString() {
			return "Rectangle [length is=" + length + ", bredth of rectangle=" + bredth + ", coloroftheshape is =" + coloroftheshape + "]";
		}
		
	}


