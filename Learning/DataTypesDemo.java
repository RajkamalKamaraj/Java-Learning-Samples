package Learning;

public class DataTypesDemo {  //User defined data type
    public static void main(String[] args) {
        int arr[] =new int[] {4,3,5,23,2};   // derived data type
        //Numeric primitive data types
        byte b = 45;
        short s =435;
        int i = 2434;
        long l = 324234L;
        // Character type primitive data type
        char ch = 'S';
        // Boolean primitive data type
        boolean flag=true;

        //Fractional primitive data type
        float fl = 34.34f;
        double db = 343.23D;
        //Byte:
        System.out.println("Byte value = " + b);
        System.out.println("Byte size = " + Byte.SIZE); // Using wrapper class
        System.out.println("Byte Min Value = " + Byte.MIN_VALUE); //Using inbuilt methods
        System.out.println("Byte Max Value = " + Byte.MAX_VALUE); //Using inbuilt methods
        System.out.println("______________________________________");
        //Short
        System.out.println("Short value = " + s);
        System.out.println("Short size = " + Short.SIZE); // Using wrapper class
        System.out.println("Short Min Value = " + Short.MIN_VALUE); //Using inbuilt methods
        System.out.println("Short Max Value = " + Short.MAX_VALUE); //Using inbuilt methods
        System.out.println("______________________________________");
        //Integer
        System.out.println("Integer value = " + i);
        System.out.println("Integer size = " + Integer.SIZE); // Using wrapper class
        System.out.println("Integer Min Value = " + Integer.MIN_VALUE); //Using inbuilt methods
        System.out.println("Integer Max Value = " + Integer.MAX_VALUE); //Using inbuilt methods
        System.out.println("______________________________________");
        //Long
        System.out.println("Long value = " + l);
        System.out.println("Long size = " + Long.SIZE); // Using wrapper class
        System.out.println("Long Min Value = " + Long.MIN_VALUE); //Using inbuilt methods
        System.out.println("Long Max Value = " + Long.MAX_VALUE); //Using inbuilt methods
        System.out.println("______________________________________");
        //Float
        System.out.println("Float value = " + fl);
        System.out.println("Float size = " + Float.SIZE); // Using wrapper class
        System.out.println("Float Min Value = " + Float.MIN_VALUE); //Using inbuilt methods
        System.out.println("Float Max Value = " + Float.MAX_VALUE); //Using inbuilt methods
        System.out.println("______________________________________");
        //Double
        System.out.println("Double value = " + db);
        System.out.println("Double size = " + Double.SIZE); // Using wrapper class
        System.out.println("Double Min Value = " + Double.MIN_VALUE); //Using inbuilt methods
        System.out.println("Double Max Value = " + Double.MAX_VALUE); //Using inbuilt methods
        System.out.println("______________________________________");
        //Character
        System.out.println("Character value = " + ch);
        System.out.println("Double size = " + Character.SIZE); // Using wrapper class
        System.out.println("Double Min Value = " + Character.MIN_VALUE); //Using inbuilt methods
        System.out.println("Double Max Value = " + Character.MAX_VALUE); //Using inbuilt methods
        System.out.println("______________________________________");
        //Boolean
        System.out.println("Boolean value = " + flag);
        System.out.println("Boolean size = " + Boolean.FALSE); // Using wrapper class
        //System.out.println("Boolean Min Value = " + Boolean.MIN_VALUE); //Using inbuilt methods
        //System.out.println("Boolean Max Value = " + Boolean.MAX_VALUE); //Using inbuilt methods
        System.out.println("______________________________________");


    }
}
