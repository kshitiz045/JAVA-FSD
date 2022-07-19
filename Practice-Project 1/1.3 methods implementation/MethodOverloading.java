package interfacesCollections;

public class MethodOverloading {
	void area(int a , int b) {
		int res = a*b;
		System.out.println(res);
	}
	void area(int n) {
		int ans = n*n;
		System.out.println(ans);
	}
	public static void main(String args[]) {
		MethodOverloading obj = new MethodOverloading();
		obj.area(4,5);
		obj.area(4);
	}

}
