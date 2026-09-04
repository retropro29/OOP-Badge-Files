package OOP.oop;

import OOP.oop.Animal;

public class Cat {
    public String name;
    public int age;

    public Cat(String catName, int catAge){
        this.name = catName;
        this.age = catAge;
    }

    public void meow(){
        if (this.age > 10){
            System.out.println(this.name + " meows at you wisely");
        }
        else if (this.age < 5){
            System.out.println(this.name + " meows at you naively");
        }
        else {
            System.out.println(this.name + " meows at you.");
        }
        
    }
    // 1. Complete your Cat class:
    //    - Add the properties "name" and "age"
    //    - Add a constructor that initializes both properties
    //    - Add a makeSound() method that prints "meow"
}