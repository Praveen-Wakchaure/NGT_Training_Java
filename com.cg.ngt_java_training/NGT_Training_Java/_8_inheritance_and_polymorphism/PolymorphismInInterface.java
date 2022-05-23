package _8_inheritance_and_polymorphism;

interface GPS4
{
	void gps1();
	void location1();
}
interface Camera4
{
	void video1();
	void photo1();
}
	
class SmartPhone1 implements GPS4, Camera4
{

	@Override
	public void video1() {
		System.out.println("Recording video...");
		
	}

	@Override
	public void photo1() {
		System.out.println("Taking Photo...");
		
	}

	@Override
	public void gps1() {
		System.out.println("GPS");
		
	}

	@Override
	public void location1() {
		System.out.println("Sharing Location...");
		
	}
	
}

public class PolymorphismInInterface {

	public static void main(String[] args) {
		
		GPS4 g = new SmartPhone1();
		
		//g.video1();   //<--- Not allowed
		//g.photo1();   //<--- Not allowed
		
		//Object can implements only methods which are include in it's reference. In this case reference is GPS.
		
		g.gps1();
		g.location1();

	}

}
