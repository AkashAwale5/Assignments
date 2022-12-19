package ass14;



public class Circle implements Shape{

	private double redius;



	public Circle(double redius) {
		super();
		this.redius = redius;
	}

	@Override
	public double area() {
	
		return Math.PI*redius*redius;
	}

	@Override
	public double side() {
		
		return 2*Math.PI*redius;
	}

}
