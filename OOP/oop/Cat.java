package OOP.oop;

import OOP.oop.Animal;

public class Cat extends Animal{

    Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void animalSound(){
        if (super.getAge() > 10){
            System.out.println(this.getName() + " meows at you wisely");
        }
        else if (super.getAge() < 5){
            System.out.println(this.getName() + " meows at you naively");
        }
        else {
            System.out.println(this.getName() + " meows at you.");
        }
        
    }
    // 1. Complete your Cat class:
    //    - Add the properties "name" and "age"
    //    - Add a constructor that initializes both properties
    //    - Add a makeSound() method that prints "meow"
}