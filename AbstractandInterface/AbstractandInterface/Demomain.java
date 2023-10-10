package AbstractandInterface;

public class Demomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Shape[] shapes = new Shape[1];
		 shapes[0] =  new Rectangle(2, 3, "red");
         shapes[1] =  new Circle("green", 4);
         
         for(Shape item : shapes)
         {
       	  
       	  System.out.println();
       	  System.out.println("Area of " + Shape.getcoloroftheshape + " is " + item.area());
       	  
       	 
       	  
       	  System.out.println("Details of " + item.toString());
       	  
       	  System.out.print(item);
	}

}
}
