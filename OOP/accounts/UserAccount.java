package OOP.accounts;

public class UserAccount {
    // 1. Fill out the properties
    private String username; 
    private String password; 
    private int age;
    private String email;

    // 2. Write constructor for UserAccount
    public UserAccount(String username, String password , int age, String email) {
        this.username = username; 
        this.password = password; 
        this.age = age;  
        this.email = email; 
    }

    public void resetUsername(String newUsername){
        this.username = newUsername;
    }

    public void resetPassword(String newPassword){
        this.password = newPassword;
    }

    public String getUser(){return username;}
    public String getPass(){return password;}
    public int getAge(){return age;}
    public String getEmail(){return email;}
    // 3. Write your methods here

    
}
