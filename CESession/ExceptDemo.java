package CESession;

import java.lang.*;
public class ExceptDemo {
//    void hello(){
//        System.out.println("1");
//        Object o = null;
//        o.toString();
//        System.out.println("4");
//    }

    public static void main(String[] args) {
        String s ="";
        try {
            int c=0/0;
//            s+="g";
            //return;
  //          System.exit(0);
        }
        catch (NullPointerException e){
            System.out.println("n");
//            s+="o";
//            return;
        }
        catch (RuntimeException e){
            System.out.println("r");
        }

        finally {
            System.out.println("f");
            //s+="o";
        }
//        s+="d";
//        System.out.println(s);
    }
}
