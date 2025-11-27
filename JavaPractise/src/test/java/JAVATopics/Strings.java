package JAVATopics;

public class Strings {
    public static void main(String[] args){

       String firstName= "Jaswinder";
       String lastName= "Singh ";
       String firstName1="jaswinder";
       String fullName= firstName+" "+lastName;

        int n = firstName.lastIndexOf("e");
        int u= lastName.indexOf("g");

        System.out.println(fullName.trim());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.replace("Singh","Singhh").replace("Jaswinder","Jass"));

        System.out.println(n);
        System.out.println(u);

        System.out.println(firstName.charAt(5));
        System.out.println(firstName.startsWith("Jas"));
        System.out.println(lastName.endsWith(" "));

        System.out.println(firstName.length());

        System.out.println(firstName.concat(lastName));
        System.out.println(firstName+" "+lastName);

        System.out.println(firstName.charAt(7));

        System.out.println(firstName.contains("kaur"));
        System.out.println(firstName.equals(firstName1));
        System.out.println(firstName.equalsIgnoreCase(firstName1));

        System.out.println(firstName.replace('J','j'));
        //substring() starting index from 0 and ending index will start from 1

        String b= "Jaswinder";
        System.out.println(b.substring(0,3));


        String i3="Basics of Automation Testing";







    }
}
