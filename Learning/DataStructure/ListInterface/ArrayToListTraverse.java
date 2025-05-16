package DataStructure.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListTraverse {
    public static void main(String[] args) {
        String[] arr= {"java","python","C++","C","Cobol"};
        System.out.println("Array Values:" + Arrays.toString(arr));

        //convert Array to List
        List<String> arrList = new ArrayList<String>();
        for(String s:arr){
            arrList.add(s);
        }

        System.out.println("ArrayList  :" + arrList);

        //Convert List to Array
        String[] arrnew =arrList.toArray(new String[arrList.size()]);

        System.out.println("Array New : " + arrnew.toString());
    }
}
