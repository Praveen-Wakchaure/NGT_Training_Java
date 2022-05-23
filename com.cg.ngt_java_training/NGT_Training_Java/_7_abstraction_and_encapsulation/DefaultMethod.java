package _7_abstraction_and_encapsulation;


interface Camera
{
	void takePhoto();
	
	default void save()
	{
		System.out.println("Photo Saving");
	}
}

interface GPS
{
	void search();
	void loaction();
}


abstract class CellPhone
{
	abstract void Call();
	
	void PickCall()
	{	
		System.out.println("Picking...");
	}
}


class SmartPhone extends CellPhone implements Camera,GPS
{

	@Override
	public void search() {
		System.out.println("Searching...");
	}

	@Override
	public void loaction() {
		System.out.println("Location");
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking Photo...");	
	}

	@Override
	void Call() {
		System.out.println("Calling...");
	}
	
	@Override
	void PickCall()                                      //<--- overridden method
	{
		System.out.println("Overridden - Answering...");
	}
	
	@Override
	public void save()
	{
		System.out.println("Saving...");                   //<--- Default method overridden
	}
	
}

public class DefaultMethod {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		sp.search();
		sp.loaction();
		sp.takePhoto();
		sp.Call();
		sp.PickCall();
		sp.save();
	}

}
