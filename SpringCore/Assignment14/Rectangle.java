package ass14;



public class Rectangle implements Shape 
{

	private double lenght;
	   private double breadth;
	   
	   
		public Rectangle(double lenght, double breadth) {
		super();
		this.lenght = lenght;
		this.breadth = breadth;
	}

		@Override
		public double area() {
			
			return lenght*breadth;
		}

		@Override
		public double side() {
			
			return 2*(lenght+breadth);
		}

}
