package DataStructure.ListInterface.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExmp1 {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();
        states.add("TamilNadu");
        states.add("Delhi");
        states.add("Karnataka");
        states.add("Andhra");

        Iterator itr = states.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
