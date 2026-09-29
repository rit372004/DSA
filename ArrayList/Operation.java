package ArrayList;

import java.util.*;

public class Operation {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        //Add Operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1, 9);

        System.out.println(list);

        //Get Operation 
        int element = list.get(2);
        System.out.println(element);

        //Remove Operation
        list.remove(2);
        System.out.println(list);

        //set operation
        list.set(2,10);
        System.out.println(list);

        //contain operation
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //size function
        System.out.println(list.size());

        //print the arraylist
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}
