package Learning;

public class ArithmeticOptr {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        
        String str3 = new String("like java");

        System.out.println(str1);
        System.out.println(str1 == str2);
        System.out.println(str1==str3);
        System.out.println(str1.charAt(2));
        System.out.println(str1.length());
        //System.out.println(str3.substring(3,1));
        System.out.println("abc".compareTo("abv"));
    }
}
