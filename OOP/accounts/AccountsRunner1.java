package OOP.accounts;

import OOP.accounts.UserAccount;

public class AccountsRunner1 {
    public static void main(String[] args) {
        //  Then, write a program which involves calling both of Bill's methods.  
        UserAccount bill = new UserAccount("Bill", "Password123", 27, "email123@gmail.com"); 

        String user = bill.getUser();
        String pass = bill.getPass();
        int age = bill.getAge();
        String email = bill.getEmail();
        
        System.out.println("This is " + user +". They are " + age +" years old. Their password is super secret and I'm not allowed to tell anybody");
        System.out.println("*whisper* " + pass);

        // 5. After all of that, create another user. Fill in the blank below for a program which asks the user for a username/password, and checks 
    }
}


