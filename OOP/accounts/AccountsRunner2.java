package OOP.accounts;

import java.util.Scanner;

public class AccountsRunner2 {
    public static void main(String[] args) {
        // 5. Create two UserAccount variables `user1` and `user2` with usernames and passwords of your choosing. 
        //  Fill in the blank below for a program which asks the user for a username/password and checks 
        UserAccount user1 = new UserAccount("Bill", "Password123",27, "genericEmail@gmail.com"); 
        UserAccount user2 = new UserAccount("admin", "superSecretPassword", 32, "testEmail@gmail.com"); 


        Scanner input = new Scanner(System.in);

        String username1 = user1.getUser();
        String userpass1 = user1.getPass();
        int userage1 = user1.getAge();
        String userEmail1 = user1.getEmail();

        String username2 = user2.getUser();
        String userpass2 = user2.getPass();
        int userage2 = user2.getAge();
        String userEmail2 = user2.getEmail();

        System.out.print("Enter username: ");  
        String username = input.nextLine(); 

        System.out.print("Enter password: "); 
        String password = input.nextLine();

        if (username.equals(username1) && password.equals(userpass1)) {
            System.out.print("Welcome user1!");
        } else if (username.equals(username2) && password.equals(userpass2)) {
            System.out.print("Welcome user2!");
        } else { 
            System.out.println("invalid username/password");
        }

        input.close(); 
    }
}
