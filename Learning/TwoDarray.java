package Learning;

public class TwoDarray {
	public static void main(String[] args) {
		 int twoD[][] = new int[4][5];
		 int i,j,k=0;
		 for(i=0;i<4;i++)
			 for(j=0;j<5;j++) {
				 twoD[i][j] = k;
				 k++;
			 }
		 for(i=0;i<4;i++) {
			 System.out.print("Row :" +i+"=");
			 for(j=0;j<5;j++) 
				System.out.print(twoD[i][j]);
				System.out.println();
			 }
	
	//Different type
	int twD[][] = new int[4][]; //Null pointer Exception will occur
	int x,y,z=0;
	 for(x=0;x<4;x++) {
	  for(y=0;y<5;y++) 
        twD[x][y] = z;
		   z++;
	  }
	 for(x=0;x<4;x++) {
	   System.out.print("Row :"+x+"=");
		 for(y=0;y<y+1;y++) 
			System.out.print(twD[x][y]);
			System.out.println();
		 }
	}
}
