package OOP.accounts;

import java.util.Scanner;

public class AccountsRunner2 {
    public static void main(String[] args) {
        // 5. Create two UserAccount variables `user1` and `user2` with usernames and passwords of your choosing. 
        //  Fill in the blank below for a program which asks the user for a username/password and checks 
        UserAccount user1 = new UserAccount("Bill", "Password123",27); 
        UserAccount user2 = new UserAccount("admin", "superSecretPassword",21); 


        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");  
        String username = input.nextLine(); 

        System.out.print("Enter password: "); 
        String password = input.nextLine();

        String username1 = user1.returnUser();
        String userpass1 = user1.returnPass();
        int userage1 = user1.returnAge();

        String username2 = user2.returnUser();
        String userpass2 = user2.returnPass();
        int userage2 = user2.returnAge();

        if (username1 == username || userpass1 == password) {
            System.out.println("Welcome user1!");
        } else if (username == username2 || userpass2 == password) {
            System.out.println("Welcome user2!");
        } else {
            System.out.println("invalid username/password");
        }

        input.close(); 
    }
}
