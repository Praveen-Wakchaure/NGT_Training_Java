package _5_constructor;

class MyEmployee
{
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	 public String  MyEmployee(String n)
	 {
		 name=n;
		return name; 
	 }
	 
	 public int MyEmployee(int i) {
		 id=i;
		 return id;
	}
	 
	 public void MyEmployee() {
		 name="Manoj Vajpayee";
		 id=10;
	}
}

public class Constructors {
	
	public static void main(String[] args) {
		
		MyEmployee m= new MyEmployee();
		
		m.setName("Pankaj Tripathi");
		m.setId(20);
		
		//getId() & getName()
		
		System.out.println("Name: "+m.getName());
		System.out.println("Id: "+m.getId());
		
		//MyEmployee(int i) & MyEmployee(String n)
		
		System.out.println("name: "+m.MyEmployee("Rajkumar Rao"));
		System.out.println("id: "+m.MyEmployee(30));
		
		//MyEmployee(String n, int i)

	}

}
