package OOP.dog; 

public class Dog {
    // 1. Write your properties here. 
    private String name; 
    private String type;
    private boolean big;


    // 2. Fill in the constructor below so that the dog's name is correctly set
    public Dog(String dogName, String dogType, boolean dogBig) {
        this.name = dogName; 
        this.type = dogType;
        this.big = dogBig;
    }

    // 3. Write your methods here. 
    public void bark() {
        if (this.big){
            System.out.println(this.name + ", the " + this.type + " barks menacingy at you");
        }
        else{
            System.out.println(this.name + ", the " + this.type + " barks cutely at you");
        }
    }

    
}