package JAVATopics;

import java.util.HashMap;

public class HashMapUnderstanding {

    /* HashMap
              A class implemented map interface
              1.Data can be stored in form of key, value pairs.
              2.Key is unique but we can have duplicate values.
              3.Insertion order not preserved(Index not allowed).
     */

    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        hm.put(1,"Jaswinder");
        hm.put(2,"Singh");
        hm.put(3,"preceeding");
        System.out.println(hm);

        //To identify the size of the HashMap
        hm.size();
        System.out.println(hm.size());

        //To get the value of the Pair from HashMap
        System.out.println(hm.get(1));

        //To remove the pair from the HashMap
       hm.remove(2);
        System.out.println(hm);

        //Get all the keys from the HashMap
        System.out.println(hm.keySet());
    }
}
