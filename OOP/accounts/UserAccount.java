package OOP.accounts;

public class UserAccount {
    // 1. Fill out the properties
    private String username; 
    private String password; 
    private int age;

    // 2. Write constructor for UserAccount
    public UserAccount(String username, String password , int age) {
        this.username = username; 
        this.password = password; 
        this.age = age;   
    }

    public String returnUser(){return username;}
    public String returnPass(){return password;}
    public int returnAge(){return age;}
    // 3. Write your methods here

    
}
