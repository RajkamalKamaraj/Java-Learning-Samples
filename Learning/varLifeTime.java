package Learning;

public class varLifeTime {

	public static void main(String[] args) {
		int x;
		for(x= 0;x<3;x++) {
			int y = -1;
			System.out.println(y);
			y = 100;
			System.out.println(y);
		}

	}

}
