package DataStructure.ListInterface.Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorExmp1 {
    public static void main(String[] args) {
        Vector<Float> marks = new Vector<>();
        marks.add(74.34f);
        marks.add(84.45f);
        marks.add(94.56f);
        marks.add(64.67f);
        marks.add(54.78f);

        Iterator itr = marks.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " , ");
        }


    }
}
