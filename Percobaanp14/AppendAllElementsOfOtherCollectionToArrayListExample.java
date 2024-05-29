package Percobaanp14;

import java.util.ArrayList;
import java.util.Vector;

public class AppendAllElementsOfOtherCollectionToArrayListExample {
    public static void main(String[] args) {
        //Create an ArrayList object
        ArrayList arrayList = new ArrayList();

        //Add elements to ArrayList
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        //Create a new Vector object
        Vector v = new Vector();
        v.add("4");
        v.add("5");

        //Append all elements of Vector to ArrayList
        arrayList.addAll(v);

        //Display elements of ArrayList
        System.out.println("After appending all elements of vector, ArrayList contains..");

        for (int i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
