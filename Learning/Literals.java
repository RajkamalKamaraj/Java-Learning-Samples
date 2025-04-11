package Learning;

public class Literals {

	public static void main(String[] args) {
		int x = 0b01101010__10101__100001; //binary literals
		int y = 123_456_789;//integer literals with underscore
		int z = 123__456__789;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//String Literals
		String s1 = "Hello World!";
		String s2 = "two \n lines";
		String s3 = "  \"This is in quotes\"  ";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
