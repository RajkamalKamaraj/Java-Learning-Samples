package Codechef.April9;

public class FindAxis {
        void Axis(int A, int B, int C, int D){
            int xfinal = (A-C);
            int yfinal = (B-D);
            System.out.println(xfinal +" "+ yfinal);
            System.out.println();
        }

        public static void main (String[] args) throws java.lang.Exception
        {
            FindAxis obj= new FindAxis();
            obj.Axis(5,4,7,3);
            //FindAxis.Axis(5,4,7,3);

        }
}
