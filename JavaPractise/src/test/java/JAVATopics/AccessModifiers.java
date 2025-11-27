package JAVATopics;

public class AccessModifiers {

    /*There are four types of Access Modifiers which we used.
    1.public      -->   Can be accessible anywhere
    2.private     -->   Can be accessible only within the class
    3.protected   -->   Can be accessible to another package by using Inheritence.
    4.default     -->   Only within the package.

    NOTE: If we do not use any kind of access modifiers which objects/functions then it will be considered as default.

     */

    int pro(int a){    //This one is default access modifier which can be accessible within the package the package name is Java Topics
        return a;
    }

    public static void superNatu(String dd){
        System.out.println(dd);
    }
}
