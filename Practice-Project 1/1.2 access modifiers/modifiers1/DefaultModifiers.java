package modifiers1;
class AccessModifiers{
	void display() {
		System.out.println("This is a default access modifiers");
	}
}
public class DefaultModifiers {
	public static void main(String args[]) {
		System.out.println("Default Access Modifiers");
		AccessModifiers obj = new AccessModifiers();
		obj.display();
	}

}
