package Learning.Iterative;

public class EnhancedForLoopDemo {
    public static void main(String[] args) {
        int a[] = {10,20,30,40};
        int sum = 0;
//
//        //1D Array Elements with Normal For loop
//        for(int i =0;i<a.length;i++){
//            sum = sum + a[i];
//            System.out.println(a[i]);
//        }
//        System.out.println();
//        System.out.println("sum = "+ sum);

        System.out.println("1D Array Enhanced For Loop");
        System.out.println("------------------");

        int summ = 0;
        for(int x : a){
            summ = summ + x;
            System.out.println(x + " \t");
        }
        System.out.println();
        System.out.println("sum = "+ summ);

        System.out.println("2D Array Enhanced For Loop");
        System.out.println("------------------");

        int b[][] = {{10,20,40},{20,12,3},{12,11,23}};
        sum =0;
        for(int[] row : b){
            for(int y : row){
                sum = sum + y;
                System.out.print(y + "\t");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
