package typecast; 
public class TypeCasting {
	public static void main(String args[]) {
		//Implicit type casting 
		//assign a value of  small data type to bigger data type
		int num = 100;
		long number1 = num;
		float number2 = num;
		System.out.println("Implicit Type Casting");
		System.out.println("Long data type value " + number1);
		System.out.println("Float data type value " + number2);
		System.out.println("\n");
		//Explicit type casting
		//assign a value of bigger data type to small data type
		long num1 = 100;
		int new_num = (int)num1;
		float new_num2 = (float)num1;
		System.out.println("Explicit Type Casting");
		System.out.println("Double data type value " + new_num);
		System.out.println("Float data type value " + new_num2);
		
		
	}

}
