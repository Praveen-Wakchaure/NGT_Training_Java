package _8_inheritance_and_polymorphism;


interface if1
{
	void meth1();
	void meth2();	
}


interface if5
{
	void meth6();
	void meth7();	
}

interface if2 extends if1,if5{
	default void meth2()
	{
		System.out.println("Overridden method 2");//Overridden
	}
	void meth4();
}

class if3 implements if2         //default method not necessary to implement
{

	@Override
	public void meth1() {
		System.out.println("Method 1...");	
	}

	@Override
	public void meth4() {
		System.out.println("Method 4...");	
	}

	@Override
	public void meth6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void meth7() {
		// TODO Auto-generated method stub
		
	}
}

public class InheritanceInInterface {

	public static void main(String[] args) {

		if3 i = new if3();
		
		i.meth1();
		i.meth2();
		i.meth4();

	}

}
