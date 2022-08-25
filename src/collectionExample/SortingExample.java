package collectionExample;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("PAOK");
        names.add("Aris");
        names.add("Giorgos");
        names.add("Giota");


        for (String name : names) {
            System.out.println(name);
        }


        Collections.sort(names);
        System.out.println("-------sorted-------");

        for (String name : names) {
            System.out.println(name);
        }
    }

}
