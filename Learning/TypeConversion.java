package Learning;

public class TypeConversion {

	public static void main(String[] args) {
		 short a = 123;
		 int b = a;
		 System.out.println("Short type : " + " " + a);
		 System.out.println("Widening Conversion:" + " " + b);//Implicit Conversion
		 //System.out.println(Math.type(b));
		 
		 int c = 456;
		 //short d = c;  It is not possible because d is lesser size than c
		 System.out.println("Integer type :"+" "+ c);
		 System.out.println("Narrowing Conversion:" + " " + (byte) c);//Explicit Conversion
		 //System.out.println(c.getClass());
		 
		 float x = 25.45f;
		 System.out.println("Narrowing Conversion:"+" "+ (int)x);
	}

}
