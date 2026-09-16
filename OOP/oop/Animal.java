package OOP.oop;

public class Animal {
    // 3. Complete your Animal class:
    //    - Look at what properties & methods are shared between Cat.java and Dog.java. Add them in here
    //    - Add a constructor that initializes each property
    private String name;
    private int age;

    public Animal(String animalName, int animalAge){
        this.name = animalName;
        this.age = animalAge;
    }

    public void animalSound(){  
        System.out.println("This is the sound that an animal makes");
    }

    public void maintenanceDifficulty(){
        System.out.println("This tells you how hard it is to maintain an animal");
    }

    public void describe(){
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public String getName(){return this.name;}
    public int getAge(){return this.age;}

    public void setName(String animalName){name = animalName;}
    public void setAge(int animalAge){age = animalAge;}


}