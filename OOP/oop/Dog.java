package OOP.oop;

import OOP.oop.Animal;

public class Dog {
    public String name;
    public int age;

    public Dog(String dogName, int dogAge){
        this.name = dogName;
        this.age = dogAge;
    }

    public void woof(){
        if (this.age > 10){
            System.out.println(this.name + " woofs at you wisely");
        }
        else if (this.age < 5){
            System.out.println(this.name + " woofs at you naively");
        }
        else {
            System.out.println(this.name + " woofs at you.");
        }
        
    }
    // 2. Complete your Dog class:
    //    - Add the properties "name" and "age"
    //    - Add a constructor that initializes both properties
    //    - Add a makeSound() method that prints "bark"
}