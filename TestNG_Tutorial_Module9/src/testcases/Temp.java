package testcases;
public class Temp {
	public static void main(String[] args) {
		// Understanding Object Array Datatype
		//String name = "Tom";
		//int phone = 98493834;
		//double height = 5.9;
		
		// Array of String type
		String[] str = new String[2];
		str[0] = "Jerry";
		str[1] = "Jerry";
		// Array of object class, Object class is super class of all the classes in java
		Object[][] address = new Object[2][3]; // 2 D array of Objects
		address[0][0] = "Lekha";
		address[0][1] = "H-3, marigold";  // string
		address[0][2] = 500019;				// int
		address[1][0] = "Mak";
		address[1][1] = "H-3, marigold";
		address[1][2] = 500019;
		
		Object[] str2 = new Object[2]; // 1 D object
		str2[0] = "task";
		str2[1] = 12345;
	}

}
