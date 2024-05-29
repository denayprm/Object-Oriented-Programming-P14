package Percobaanp14;

import java.util.*;
public class SetExample {
    public static void main (String[] args) {
        Set set = new HashSet();
        set.add("Bernadine");
        set.add("Elizabeth");
        set.add("Gene");
        set.add("Elizabeth");
        set.add("Clara");
        System.out.println("Elemen pada Hashet : ");
        System.out.println(set);
        Set sortSet = new TreeSet(set);
        System.out.println("Elemen pada TreeSet : ");
        System.out.println(sortSet);
    }
}
