package DataStructure.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExmp2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Rajkamal");
        names.add("Divya");
        names.add("Siddhu");
        names.add("Arjun");

        Iterator itr = names.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
