package _8_inheritance_and_polymorphism;

class Animal
{
	String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

class Dog extends Animal
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Introduction {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		
		a.setType("Dog");
		System.out.println(a.getType());
		
		
		//Inheritance
		
		System.out.println(".....Inheritance.....");
		
		Dog d = new Dog();
		
		d.setType("Dog");                   //<-- This belongs to class Animal
		d.setName("Raja");
		System.out.println(d.getType());    //<-- This belongs to class Animal
		System.out.println(d.getName());
		
		
	}

}
