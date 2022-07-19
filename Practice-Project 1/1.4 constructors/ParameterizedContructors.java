package constructors;

public class ParameterizedContructors {
	int id;
	String name;
	
	ParameterizedContructors(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		ParameterizedContructors obj1 = new ParameterizedContructors(1,"ABC");
		ParameterizedContructors obj2 = new ParameterizedContructors(2,"XYZ");
		obj1.display();
		obj2.display();
		
		
		
		
		

	}

}
