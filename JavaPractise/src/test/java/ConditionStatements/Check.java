package ConditionStatements;

public class Check {

    public static void main(String[] args) {

        String username="Jass";
        String password="admin123456";
        String message="will update later";

        if (username == "Jases"&& password=="admin123456"){
            message= "login Successful";
        }
        else if (username=="Jass"&& password!="admin123456"){
            message= "Incorrect Password";

        }
        else if(username!="Jass"&& password =="admin123456"){
            message="incorrect Username";
        }
        System.out.println(username);
        System.out.println(password);
        System.out.println(message);

    }
}

//Complex Login System:
//Write a program that asks for a username and password. Check the following:
//If both are correct → "Login Successful"
//If only the username is correct → "Incorrect Password"
//If only the password is correct → "Incorrect Username"
//If both are wrong → "Invalid Credentials"