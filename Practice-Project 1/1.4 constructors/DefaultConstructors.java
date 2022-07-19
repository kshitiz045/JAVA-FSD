package constructors;

public class DefaultConstructors {
	int id;
	String name;
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		DefaultConstructors obj = new DefaultConstructors();
		obj.display();
		

	}

}
