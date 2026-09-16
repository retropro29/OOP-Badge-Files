package OOP.oop;

import OOP.oop.Animal;

public class Dog extends Animal{


    Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void animalSound(){
        if (super.getAge() > 10){
            System.out.println(this.getName() + " woofs at you wisely");
        }
        else if (super.getAge() < 5){
            System.out.println(this.getName() + " woofs at you naively");
        }
        else {
            System.out.println(this.getName() + " woofs at you.");
        }
        
    }

    @Override
    public void maintenanceDifficulty(){
        System.out.println("This animal is somewhat challenging to keep as a pet");
    }
    // 2. Complete your Dog class:
    //    - Add the properties "name" and "age"
    //    - Add a constructor that initializes both properties
    //    - Add a makeSound() method that prints "bark"
}