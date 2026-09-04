package OOP.accounts;

import java.util.Scanner;

public class AccountsRunner2 {
    public static void main(String[] args) {
        // 5. Create two UserAccount variables `user1` and `user2` with usernames and passwords of your choosing. 
        //  Fill in the blank below for a program which asks the user for a username/password and checks 
        UserAccount user1 = new UserAccount("Bill", "Password123",27); 
        UserAccount user2 = new UserAccount("admin", "superSecretPassword", 32); 


        Scanner input = new Scanner(System.in);

        String username1 = user1.returnUser();
        String userpass1 = user1.returnPass();
        int userage1 = user1.returnAge();

        String username2 = user2.returnUser();
        String userpass2 = user2.returnPass();
        int userage2 = user2.returnAge();

        System.out.print("Enter username: ");  
        String username = input.nextLine(); 

        System.out.print("Enter password: "); 
        String password = input.nextLine();

        // if (username == username1 && password == userpass1) {
        //     System.out.print("Welcome user1!");
        // } else if (username == username2 && password == userpass2) {
        //     System.out.print("Welcome user2!");
        // } else { 
        //     System.out.println(username1 + "\t\t\t" + userpass1);
        //     System.out.println(username + "\t\t\t" + password);
        //     System.out.println(username2 + "\t\t\t" + userpass2);
        //     System.out.println(username + "\t\t\t" + password);

        //     System.out.println("invalid username/password");
        // }

        if (username.equals(username1) && password.equals(userpass1)) {
            System.out.print("Welcome user1!");
        } else if (username.equals(username2) && password.equals(userpass2)) {
            System.out.print("Welcome user2!");
        } else { 
            System.out.println("invalid username/password");
        }

        /*
        What I've tried so far
            Changed password values
            Made it so the if statement used direct values eg: "Bill" rather than username1
            Deleted age from UserAccount
            Changed the && to a || so that if any values worked, it would have gone through
            Added printlns to check and make sure the values match
            Rearranged the order in which variables were declared
            Investigated UserAccount.Java
            Changed the values again to numbers again (Still strings) because why not
         */
        input.close(); 
    }
}
