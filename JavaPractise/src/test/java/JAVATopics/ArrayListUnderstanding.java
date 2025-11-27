package JAVATopics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUnderstanding {

    /*
    COLLECTIONS- To represent group of elements/objects/data into single entity.
    Collection is an interface available in java.util

    ARRAY LIST:-
    1.Hetrogeneous data- Allowed.                      (Different type of elements like String, int we can store)
    2.Insertion order- preserved(Index).               (Index value will starts from zero)
    3. Duplicate elements- Allowed.                    (There is no limit we can store n number of elements)
    4.Multiple nulls- Allowed.

    Declaration:Syntax
               ArrayList mylist= new ArrayList();
               List mylist= new ArrayList();

        ArrayList<Integer> mylist= new ArrayList<Integer>();        Will store only Integer
        ArrayList<String> mylist= new ArrayList<String>();          Will store only String


   ArrayList mylist= new ArrayList();  To use the hetrogeneous data we use the following
   we will use .add in Array list
        mylist.add(9990);
        mylist.add("Jaswinder Singh");
        mylist.add(989);
        mylist.add('p');
        mylist.add("Pronounciation");



        To find out the size of Array List we can use the following
        mylist.size()

        ADDING-
              Adding means we can add something to the end of the list.

        INSERTION-
                Insertion means to insert the value in middle of something we can add index value and the rest will be move forward.


     */


    public static void main(String[] args){
        ArrayList mylist= new ArrayList();

        mylist.add(9990);
        mylist.add("Jaswinder");
        mylist.add(989);
        mylist.add('p');
        mylist.add("Pronounciation");
        mylist.add(null);
        mylist.add(null);


        // will print all the data
        System.out.println("This will display all the items present in the Array List: "+mylist);

        // will print the size of Array list
        System.out.println("This will display the length of the Array List: "+mylist.size());

        //Remove element from Array List
        mylist.remove(6);
        System.out.println("This will remove the specific element from the index value we have provided: "+mylist);

        //Insert element in the ArrayList
        mylist.add(5,"jass");     // Here at the sixth index jass will be added
        System.out.println("This will add the element in the list on the index value we have provided: "+mylist);


         //Modify element in the Arraylist (modify/Replace/change)
        mylist.set(1,"singh");
        System.out.println("This will replace Jaswinder text with Singh text as the index position is 1: "+mylist);

        //Access Specific element from ArrayList
        System.out.println("This will help us to get the specific element from the Arraylist: "+mylist.get(3));


        //Important Topics  Iterating all values from ArrayList

        //Using simple for loop
        for (int i=0;i<mylist.size()-1;i++){
            System.out.println(mylist.get(i));
        }

        //Using for each loop/ enhanced loop
        for(Object x: mylist){
            System.out.println(x);
        }
          //Most Important Topic Iterator
        Iterator it= mylist.iterator();

        // we have to use while loop if we dont know about the number of elements instead of using for loop
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // To check if the Arraylist is empty or not
        System.out.println("This will display if the Array List is empty or not:" + mylist.isEmpty());

    }
}
