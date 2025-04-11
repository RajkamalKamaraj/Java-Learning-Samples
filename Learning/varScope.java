package Learning;

public class varScope {

	public static void main(String[] args) {
		int x = 10;
		if(x==10) {
			int y =20;
			System.out.println("X and Y are :" + x +" "+ y);
			x = y*2;
		}
		//y = 100;
		x = 100;
		System.out.println(x);
				

	}

}
