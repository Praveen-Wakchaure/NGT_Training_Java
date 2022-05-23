package _7_abstraction_and_encapsulation;

abstract  class Shape
{
	void meth1()
	{
		System.out.println("This is method 1");
	}
	
	abstract void area();
	
	abstract void volume();
}

abstract class Cube
{
	
}


// If class declared as normal class and extends abstract class, then all the abstract method of abstract class must be overridden 
class Sphere extends Shape
{

	@Override
	void area() {
		
		System.out.println("Sphere Area");
	}

	@Override
	void volume() {
		
		System.out.println("Sphere Volume");
	}
	
}

//If abstract class methods not overridden, then subclass must be as the abstract class 

abstract class Cylinder extends Shape
{
	void meth2()
	{
		System.out.println("This is method 2 from abstract subclass 'Cylinder'");
	}
}

public class AbstractMethodAndClasses {

	public static void main(String[] args) {
		
	    //	Shape s =new Shape();    //<-- abstract class object cannot be create
		
		Sphere s = new Sphere();
		
		s.area();
		s.volume();
		
        // Cyliner c = new Cylinder();  //<-- not possible
		
		
		//If class declared as normal class and extends abstract class, then all the abstract method of abstract class must be overridden
		
		
		Cylinder c =new Cylinder() {
			
			@Override
			void volume() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			void area() {
				// TODO Auto-generated method stub
				
			}
		};
		
		c.meth2();
		
		Shape p = new Cylinder() {
			
			@Override
			void volume() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			void area() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
