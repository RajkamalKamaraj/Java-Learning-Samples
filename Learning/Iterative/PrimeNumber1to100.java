package Learning.Iterative;

public class PrimeNumber1to100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers 1 to 100 :");
        int count =0;

        for(int i =2;i<=100;i++){
            boolean isprime =true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime)count++;
        }
        System.out.println(count);
    }
}
