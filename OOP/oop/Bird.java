package OOP.oop;

import OOP.oop.Animal;

public class Bird extends Animal{


    Bird(String name, int age){
        super(name, age);
    }

    @Override
    public void animalSound(){
        if (super.getAge() > 10){
            System.out.println(this.getName() + " tweets at you wisely");
        }
        else if (super.getAge() < 5){
            System.out.println(this.getName() + " tweets at you naively");
        }
        else {
            System.out.println(this.getName() + " tweets at you.");
        }
        
    }

    @Override
    public void maintenanceDifficulty(){
        System.out.println("This animal is hard to keep as a pet");
    }
    // 2. Complete your Dog class:
    //    - Add the properties "name" and "age"
    //    - Add a constructor that initializes both properties
    //    - Add a makeSound() method that prints "bark"
}