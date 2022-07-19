package interfacesCollections;

public class CallByValue {
	int val = 150;
	int code(int val) {
		int ans = val*val;
		return ans;
	}
	public static void main(String[] args) {
		CallByValue obj = new CallByValue();
		System.out.println("Before , vlaue of n "+ obj.val);
		
		System.out.println("After, value of n " + obj.code(100));
	}

}
