package _8_inheritance_and_polymorphism;

class One
{
	int a;
	
	One(int a)
	{
		this.a=a;
		System.out.println("class one");
	}
}

class Two extends One
{

	Two(int a) {
		super(a);
		System.out.println("class two");
	}
	
}

public class ThisAndSuper {

	public static void main(String[] args) {
		
		One one = new One(1);
		
		System.out.println(one.a);
		
		Two two = new Two(2);
		
		System.out.println(two.a);
	
		
	}

}
