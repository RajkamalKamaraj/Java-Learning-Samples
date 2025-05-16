package DataStructure.ListInterface;

import java.util.*;

public class FirstList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        List<Number> age = new LinkedList<Number>();
        List<Integer> Mob = new Vector<Integer>();
        List<String> Location = new Stack<String>();

        //Test to add element
        names.add("Rajkamal");names.add("Divya");names.add("Siddhaarth");names.add("Arjun");names.add("Rajkamal");
        age.add(37);age.add(35);age.add(8);age.add(2);
        Mob.add(123);Mob.add(321);Mob.add(456);Mob.add(654);
        Location.add("KRR");Location.add("CBE");Location.add("KRR");Location.add("CBE");

        int index = names.indexOf("Rajkamal");
        System.out.println("Index :" + index);
        System.out.println(names.get(0));
        System.out.println(names.get(4));

        System.out.println(names.remove(4));

        for(String ln:names){
            System.out.println(ln);
        }

    }
}
