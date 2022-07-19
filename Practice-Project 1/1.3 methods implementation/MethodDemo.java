package interfacesCollections;

public class MethodDemo {
	int add(int a,int b) {
		int ans = a+b;
		return ans;
	}
	public static void main(String[] args) {
		MethodDemo obj = new MethodDemo();
		int res = obj.add(5,5);
		System.out.println("Sum is "+res);

	}

}
