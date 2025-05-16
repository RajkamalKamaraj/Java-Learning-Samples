package DataStructure.ListInterface.Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackExmp1 {
    public static void main(String[] args) {
        Stack<String> cricketers = new Stack<>();
        cricketers.add("Ganguly");
        cricketers.add("Sachin");
        cricketers.add("Raina");
        cricketers.add("Dhoni");

        Iterator itr = cricketers.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
