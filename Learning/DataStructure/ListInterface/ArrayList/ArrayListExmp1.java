package DataStructure.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExmp1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(5);
        numbers.add(23);
        numbers.add(345);
        numbers.add(123);

        Iterator itr = numbers.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
