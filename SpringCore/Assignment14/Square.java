package ass14;

public class Square implements Shape{

	double side;


	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double area() {
	
		return side*side;
	}

	@Override
	public double side() {
		
		return side*4;
	}

}
