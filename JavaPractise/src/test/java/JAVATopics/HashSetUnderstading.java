package JAVATopics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetUnderstading {
    /*
    Hash Set - A class implemented Set Interface

    1.Hetrogeneous Data---> Allowed         The list may contain Interger, String, Character etc.,
    2.Insertion order --> Not Preserved     It will print the list as serial order it can print randomly.
    3. Duplicate items-- Not allowed        It will not print the duplicate values present in the list.
    4.Multiple null-- not allowed           It will not print multiple null from the list.


     */

    public static void main(String[] args) {

        HashSet h8= new HashSet();
        h8.add(893);
        h8.add("Jaswinder");
        h8.add("Singh");
        h8.add(90990);
        h8.add("Jaswinder");
        h8.add(890);
        h8.add("Jaswinder");
        h8.add(true);
        h8.add("Jaswinder");
        h8.add("Jaswinder");
        h8.add("Jaswinder");
        h8.add("Jaswinder");
        h8.add(false);

        System.out.println(h8);

        //Removing Element from the HashSet     Index is not supported we need to add the element which we need to removed not the index value
        h8.remove("Jaswinder");
        System.out.println(h8);

        //Inserting is not possible in HashList
        //Accessing specific value from the HashSet is not possible

        //Convert HashList to ArrayList

        ArrayList al= new ArrayList(h8);
        System.out.println(al);

        // Using for each loop
        // Using iterator
        // we cannot use simple for loop as we do not know about the index value of the elements present in the list

        for ( Object c: h8){
            System.out.println(c);
        }

        //By Using Iterator we can also run the loop
//
//      Iterator HG= h8.iterator();
//        while(HG.hasNext()){
//            System.out.println(HG.next());

            //Size of a HashList we can identify that one
            System.out.println(h8.size());
        }
    }

