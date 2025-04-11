package Learning;

public class OneDarray {

	public static void main(String[] args) {
		//Version 1
		int marks[]=new int[5];
		marks[0]=50;
		marks[1]=60;
		marks[2]=70;
		marks[3]=80;
		marks[4]=90;
		System.out.println(marks[3]);

		//Version 2
		int subMarks[] = {34,65,87,99,100,34,56,75,87};
		System.out.println(subMarks[7]);
		
		//One D Example
		
		double nums[]= {12.5,5.67,45.6,34.77,12.67};
		double res = 0;
		int i;
		for(i=0;i<nums.length;i++) {
			res = res+nums[i];
		}
		System.out.println("Average : "+" "+ res);	
	}
}
