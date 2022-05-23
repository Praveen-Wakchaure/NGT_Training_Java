package _8_inheritance_and_polymorphism;

class A {
	void B() {
		System.out.println("Method B");
	}
}

class C extends A {
	@Override
	void B() // <-- Method void B is override
	{
		String a = "Override";
		System.out.println(a);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		C c = new C();

		c.B();
	}
}
