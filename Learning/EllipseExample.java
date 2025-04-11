package Learning;

public class EllipseExample {
	public static void printnumbers(int...numbers) {
		for(int number: numbers) {
			System.out.println(number);
		}
	}
	public static void main(String[] args) {
		System.out.println("Printing Numbers: ");
		printnumbers(10,20,30,40,50);
	}
}
