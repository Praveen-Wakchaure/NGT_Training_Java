package _5_constructor;

class Cirle
{
	private double radius;

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	
	public double area() 
	{
		return ((22/7)*radius*radius);
	}
	
	public double perimeter() 
	{
	return (2*(22/7)*radius);	
	}
	
}

public class GettersAndSetters {
	
	public static void main(String[] args) {
		
		Cirle c = new Cirle();
		
		c.setRadius(5);
		
		System.out.println("Radius: "+c.getRadius());
		System.out.println("Area: "+c.area());
		System.out.println("Perimeter: "+c.perimeter());
		
		
		
		
	}

}
